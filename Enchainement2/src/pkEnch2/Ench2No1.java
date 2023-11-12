package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No1 
{

	public static void main(String[] args) 
	{
				String strCoutBaseBillet;						//Chant pour que l'utilisateur indique le co�t du billet
				double dCoutBaseBillet;							//Conversion du co�t de base du billet
		
		final 	double D_CULT 				= 2;				//Constante pour les frais de la taxe de culture
		final	double D_PUB 				= 0.1;				//Constante du co�t de la publicit�
		final	double D_BATIMENT			= 0.02;				//Constante du co�t des frais de batiment et d'entretien
		final	double D_PROFIT 			= 0.15;				//Constante du co�t des profits
		final	double D_TPS	 			= 1.05;				//Constante du co�t de la TPS
		final	double D_TVQ	 			= 1.095;			//Constante du co�t de la TVQ	
				
				double dSousTotal;								//Variable du calcul du co�t avant taxe
				double dSousTotalTps;							//Variable du co�t avec TPS
				double dCoutFinal;								//Variable du calcul du co�t final du billet
		
		NumberFormat signedollars = NumberFormat.getCurrencyInstance();
		
		strCoutBaseBillet 	= JOptionPane.showInputDialog("Entrez le co�t de base du billet.");
		dCoutBaseBillet 	= Double.parseDouble(strCoutBaseBillet);
		
		dSousTotal			= dCoutBaseBillet + (dCoutBaseBillet * D_PUB) + (dCoutBaseBillet * D_BATIMENT) + (dCoutBaseBillet * D_PROFIT) + D_CULT;
		
		dSousTotalTps		= dSousTotal * D_TPS;
		
		dCoutFinal			= dSousTotalTps * D_TVQ;
		
		JOptionPane.showMessageDialog(null, "Le  co�t du billet sera de: " + signedollars.format(dCoutFinal));
		
		System.exit(0);
		

	}

}
