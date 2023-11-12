package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No7 
{

	public static void main(String[] args) 
	{
		
		final 	double D_POND = 40;		//Pondération de l'examen /100
				
				String strNote;			//Saisie de la note sur 40
				
				double dNote;			//Conversion de la note sur 40
		
		NumberFormat pourcentage = NumberFormat.getPercentInstance();
		
		strNote 	= JOptionPane.showInputDialog("Entrez la note sur 40.");
		dNote 		= Double.parseDouble(strNote);
		
		dNote 		/= D_POND;
		
		JOptionPane.showMessageDialog(null, "La note est: " + pourcentage.format(dNote));
		
		System.exit(0);

	}

}
