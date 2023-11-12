package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No5 
{

	public static void main(String[] args) 
	{

		final 	double D_ESC 			= 0.85;	//Escompte
		final 	double D_TPS 			= 0.075;	//Taxes f�d�rales
		final 	double D_TVQ 			= 0.07;		//Taxes provinciales
				
				String strPrixHab;					//Prix de l'habit
		
				double dPrixHab;					//Conversion prix de l'habit
				double dSousTotal;					//Sous-total
				double dCoutTps;					//Co�t des taxes f�d�rales
				double dSousTotalTps;				//Sous-total incluant TPS
				double dCoutTvq;					//Co�t des taxes provinciales
				double dCoutTotalFinal;				//Co�t total

		NumberFormat signedollars = NumberFormat.getCurrencyInstance();
		
		strPrixHab 	= JOptionPane.showInputDialog("Entrez le prix de l'habit.");
		dPrixHab 	= Double.parseDouble(strPrixHab);
		
		dSousTotal 		= dPrixHab * D_ESC;
		
		dCoutTps 		= dSousTotal * D_TPS;
		dSousTotalTps 		= dSousTotal + dCoutTps;
		
		dCoutTvq		= dSousTotalTps * D_TVQ;
		dCoutTotalFinal	= dSousTotalTps + dCoutTvq;
		
		String strRecu = " ";
		strRecu += "\nCo�t de l'habit de base: " + signedollars.format(dPrixHab);
		strRecu += "\nCo�t de l'habit apr�s escompte: " + signedollars.format(dSousTotal);
		strRecu += "\nTaxes f�d�rales: " + signedollars.format(dCoutTps);
		strRecu += "\nTaxes provinciales: " + signedollars.format(dCoutTvq);
		strRecu += "\nCo�t Total: " + signedollars.format(dCoutTotalFinal);
		
		JOptionPane.showMessageDialog(null, strRecu, "Co�t de l'habit", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
