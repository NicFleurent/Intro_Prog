package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo4 
{

	public static void main(String[] args) 
	{
		String strNbrBicyclettes;		//Nombre de bicyclettes acheté
		String strNbrPlanches;			//Nombre de planche à roulettes acheté
		
		double dNbrBicyclettes;			//Conversion du nombre de bicyclettes
		double dNbrPlanches;			//Conversion du nombre de planches à roulette
		
		double dSomme;					//Somme total des achats
		
		double dCoutBicyclette = 100;	//Coût pour une bicyclette
		double dCoutPlanche = 80;		//Coût pour une planche à roulette
		
		strNbrBicyclettes 	= JOptionPane.showInputDialog("Entrez le nombre de bicyclettes.");
		strNbrPlanches 		= JOptionPane.showInputDialog("Entrez le nombre de planches à roulettes.");
		dNbrBicyclettes 	= Double.parseDouble(strNbrBicyclettes);
		dNbrPlanches 		= Double.parseDouble(strNbrPlanches);
		
		dSomme = (dNbrBicyclettes * dCoutBicyclette) + (dNbrPlanches * dCoutPlanche);
		
		JOptionPane.showMessageDialog(null, "Le coût total est de: " + dSomme + "$", "Coût des achats", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
