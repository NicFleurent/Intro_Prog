package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo5 
{

	public static void main(String[] args) 
	{
		String strNbrBicyclettes;		//Nombre de bicyclettes achet�
		String strNbrPlanches;			//Nombre de planche � roulettes achet�
		
		double dNbrBicyclettes;			//Conversion du nombre de bicyclettes
		double dNbrPlanches;			//Conversion du nombre de planches � roulette
		
		double dSomme;					//Somme total des achats
		
		double dProfBicyclette = 40;	//Profit pour une bicyclette
		double dProfPlanche = 20;		//Profit pour une planche � roulette
		
		strNbrBicyclettes	= JOptionPane.showInputDialog("Entrez le nombre de bicyclettes.");
		strNbrPlanches 		= JOptionPane.showInputDialog("Entrez le nombre de planches � roulettes.");
		dNbrBicyclettes 	= Double.parseDouble(strNbrBicyclettes);
		dNbrPlanches 		= Double.parseDouble(strNbrPlanches);
		
		dSomme = (dNbrBicyclettes * dProfBicyclette) + (dNbrPlanches * dProfPlanche);
		
		JOptionPane.showMessageDialog(null, "Le Profit total est de: " + dSomme + "$", "Profit des ventes", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
