package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No9 
{

	public static void main(String[] args) 
			{
		
		final	double	D_MIN 	= 60;			//Nombre de seconde dans une minute
		final	double	D_HEURE = 3600;			//Nombre de seconde dans une heure
		
				String	strSec;					//Nombre de seconde
				
				double	dSec;					//Conversion nombre de seconde
				double	dNbrHeure;				//Calcul du nombre d'heure
				double	dNbrMin;				//Calcul du nombre de minute
		
		
		DecimalFormat zerochiffres = new DecimalFormat("0");
		
		strSec 	= JOptionPane.showInputDialog("Entrez le nombre de seconde.");
		dSec 	= Double.parseDouble(strSec);
		
		dNbrHeure 	= Math.floor(dSec / D_HEURE);
		dNbrMin 	= Math.floor((dSec % D_HEURE) / D_MIN);
		dSec		%= D_MIN;
		
		JOptionPane.showMessageDialog(null, "Cela équivaut à " + zerochiffres.format(dNbrHeure) + " heures, " + zerochiffres.format(dNbrMin) + " minutes et " + zerochiffres.format(dSec) + " secondes.");
		
		System.exit(0);

	}

}
