package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo4 
{

	public static void main(String[] args) 
	{
		String strNbrBicyclettes;		//Nombre de bicyclettes achet�
		String strNbrPlanches;			//Nombre de planche � roulettes achet�
		
		double dNbrBicyclettes;			//Conversion du nombre de bicyclettes
		double dNbrPlanches;			//Conversion du nombre de planches � roulette
		
		double dSomme;					//Somme total des achats
		
		double dCoutBicyclette = 100;	//Co�t pour une bicyclette
		double dCoutPlanche = 80;		//Co�t pour une planche � roulette
		
		strNbrBicyclettes 	= JOptionPane.showInputDialog("Entrez le nombre de bicyclettes.");
		strNbrPlanches 		= JOptionPane.showInputDialog("Entrez le nombre de planches � roulettes.");
		dNbrBicyclettes 	= Double.parseDouble(strNbrBicyclettes);
		dNbrPlanches 		= Double.parseDouble(strNbrPlanches);
		
		dSomme = (dNbrBicyclettes * dCoutBicyclette) + (dNbrPlanches * dCoutPlanche);
		
		JOptionPane.showMessageDialog(null, "Le co�t total est de: " + dSomme + "$", "Co�t des achats", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
