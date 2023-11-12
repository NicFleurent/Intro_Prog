package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No5 
{

	public static void main(String[] args) 
	{

		final 	double D_ESC 			= 0.85;	//Escompte
		final 	double D_TPS 			= 0.075;	//Taxes fédérales
		final 	double D_TVQ 			= 0.07;		//Taxes provinciales
				
				String strPrixHab;					//Prix de l'habit
		
				double dPrixHab;					//Conversion prix de l'habit
				double dSousTotal;					//Sous-total
				double dCoutTps;					//Coût des taxes fédérales
				double dSousTotalTps;				//Sous-total incluant TPS
				double dCoutTvq;					//Coût des taxes provinciales
				double dCoutTotalFinal;				//Coût total

		NumberFormat signedollars = NumberFormat.getCurrencyInstance();
		
		strPrixHab 	= JOptionPane.showInputDialog("Entrez le prix de l'habit.");
		dPrixHab 	= Double.parseDouble(strPrixHab);
		
		dSousTotal 		= dPrixHab * D_ESC;
		
		dCoutTps 		= dSousTotal * D_TPS;
		dSousTotalTps 		= dSousTotal + dCoutTps;
		
		dCoutTvq		= dSousTotalTps * D_TVQ;
		dCoutTotalFinal	= dSousTotalTps + dCoutTvq;
		
		String strRecu = " ";
		strRecu += "\nCoût de l'habit de base: " + signedollars.format(dPrixHab);
		strRecu += "\nCoût de l'habit après escompte: " + signedollars.format(dSousTotal);
		strRecu += "\nTaxes fédérales: " + signedollars.format(dCoutTps);
		strRecu += "\nTaxes provinciales: " + signedollars.format(dCoutTvq);
		strRecu += "\nCoût Total: " + signedollars.format(dCoutTotalFinal);
		
		JOptionPane.showMessageDialog(null, strRecu, "Coût de l'habit", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
