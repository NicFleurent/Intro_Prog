package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No8 
{

	public static void main(String[] args) 
	{
		String	strNom;						//Nom de l'�l�ve
		String	strNote;					//Note de l'�l�ve
		String	strPond;					//Pond�ration de l'examen
		
		double 	dNote;						//Conversion de la note de l'�l�ve
		double 	dPond;						//Conversion de la pond�ration de l'examen
		double	dNotePourcent;				//Calcul de la note sur 100
		
		NumberFormat 	pourcentage 	= NumberFormat.getPercentInstance();
		DecimalFormat 	zerochiffres 	= new DecimalFormat("0");
		
		strNom 		= JOptionPane.showInputDialog("Entrez le nom de l'�l�ve.");
		strNote 	= JOptionPane.showInputDialog("Entrez le r�sultat de l'�l�ve.");
		strPond		= JOptionPane.showInputDialog("Entrez la pond�ration de l'examen.");
		dNote		= Double.parseDouble(strNote);
		dPond		= Double.parseDouble(strPond);
		
		dNotePourcent = dNote / dPond;
		
		String strResultat = " ";
		strResultat += "\n" + strNom + " a eu " + zerochiffres.format(dNote) + " points sur un examen de " + zerochiffres.format(dPond) + " points.";
		strResultat += "\n" + strNom + " obtien donc " + pourcentage.format(dNotePourcent) + " pour son examen.";
		
		JOptionPane.showMessageDialog(null, strResultat, "R�sultat sur 100", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);		

	}

}
