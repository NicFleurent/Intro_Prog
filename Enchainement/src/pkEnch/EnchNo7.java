package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo7 
{

	public static void main(String[] args) 
	{
		
		String	strDepCine;				//Dépense en cinéma
		String	strDepResto;			//Dépense en restaurant
		String	strDepQuille;			//Dépense en quilles
		String	strDepCadeau;			//Dépense en cadeaux
		
		double	dBudgetAnnuel = 200;	//Budget Annuel
		double	dDepCine;
		double	dDepResto;
		double	dDepQuille;
		double	dDepCadeau;
		double	dBudgetRestant;			//Restant du buget qui n'a pas été dépensé.
		
		int 	iPourcentCine;			//Pourcentage des dépenses en cinéma
		int		iPourcentResto;			//Pourcentage des dépenses en restaurant
		int		iPourcentQuille;		//Pourcentage des dépenses en quilles
		int		iPourcentCadeau;		//Pourcentage des dépenses en cadeaux
		int		iPourcentBudgetRestant;	//Pourcentage du budget qui n'a pas été dépensé
		
		strDepCine 		= JOptionPane.showInputDialog("Entrez le montant dépensé en cinéma.");
		strDepResto 	= JOptionPane.showInputDialog("Entrez le montant dépensé en restaurant.");
		strDepQuille 	= JOptionPane.showInputDialog("Entrez le montant dépensé en jouant au quilles.");
		strDepCadeau 	= JOptionPane.showInputDialog("Entrez le montant dépensé en cadeaux.");
		dDepCine 		= Double.parseDouble(strDepCine);
		dDepResto 		= Double.parseDouble(strDepResto);
		dDepQuille 		= Double.parseDouble(strDepQuille);
		dDepCadeau 		= Double.parseDouble(strDepCadeau);
		
		dBudgetRestant = dBudgetAnnuel - (dDepCine + dDepResto + dDepQuille + dDepCadeau);		
		
		iPourcentCine 			= (int) (dDepCine * 100 / dBudgetAnnuel);
		iPourcentResto 			= (int) (dDepResto * 100 / dBudgetAnnuel);
		iPourcentQuille 		= (int) (dDepQuille * 100 / dBudgetAnnuel);
		iPourcentCadeau 		= (int) (dDepCadeau * 100 / dBudgetAnnuel);
		iPourcentBudgetRestant 	= (int) (dBudgetRestant * 100 / dBudgetAnnuel);
		
		JOptionPane.showMessageDialog(null, "Cinéma: " + iPourcentCine + "%" + "\nRestaurant: " + iPourcentResto + "%" + 
											"\nQuilles: " + iPourcentQuille + "%" + "\nCadeaux : " + iPourcentCadeau + "%" + 
											"\nBudget Restant: " + iPourcentBudgetRestant + "%", "Budget annuel de sorties", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
