package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No8 
{

	public static void main(String[] args) 
	{
		String	strNom;						//Nom de l'élève
		String	strNote;					//Note de l'élève
		String	strPond;					//Pondération de l'examen
		
		double 	dNote;						//Conversion de la note de l'élève
		double 	dPond;						//Conversion de la pondération de l'examen
		double	dNotePourcent;				//Calcul de la note sur 100
		
		NumberFormat 	pourcentage 	= NumberFormat.getPercentInstance();
		DecimalFormat 	zerochiffres 	= new DecimalFormat("0");
		
		strNom 		= JOptionPane.showInputDialog("Entrez le nom de l'élève.");
		strNote 	= JOptionPane.showInputDialog("Entrez le résultat de l'élève.");
		strPond		= JOptionPane.showInputDialog("Entrez la pondération de l'examen.");
		dNote		= Double.parseDouble(strNote);
		dPond		= Double.parseDouble(strPond);
		
		dNotePourcent = dNote / dPond;
		
		String strResultat = " ";
		strResultat += "\n" + strNom + " a eu " + zerochiffres.format(dNote) + " points sur un examen de " + zerochiffres.format(dPond) + " points.";
		strResultat += "\n" + strNom + " obtien donc " + pourcentage.format(dNotePourcent) + " pour son examen.";
		
		JOptionPane.showMessageDialog(null, strResultat, "Résultat sur 100", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);		

	}

}
