package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo7 
{

	public static void main(String[] args) 
	{
		
		String	strDepCine;				//D�pense en cin�ma
		String	strDepResto;			//D�pense en restaurant
		String	strDepQuille;			//D�pense en quilles
		String	strDepCadeau;			//D�pense en cadeaux
		
		double	dBudgetAnnuel = 200;	//Budget Annuel
		double	dDepCine;
		double	dDepResto;
		double	dDepQuille;
		double	dDepCadeau;
		double	dBudgetRestant;			//Restant du buget qui n'a pas �t� d�pens�.
		
		int 	iPourcentCine;			//Pourcentage des d�penses en cin�ma
		int		iPourcentResto;			//Pourcentage des d�penses en restaurant
		int		iPourcentQuille;		//Pourcentage des d�penses en quilles
		int		iPourcentCadeau;		//Pourcentage des d�penses en cadeaux
		int		iPourcentBudgetRestant;	//Pourcentage du budget qui n'a pas �t� d�pens�
		
		strDepCine 		= JOptionPane.showInputDialog("Entrez le montant d�pens� en cin�ma.");
		strDepResto 	= JOptionPane.showInputDialog("Entrez le montant d�pens� en restaurant.");
		strDepQuille 	= JOptionPane.showInputDialog("Entrez le montant d�pens� en jouant au quilles.");
		strDepCadeau 	= JOptionPane.showInputDialog("Entrez le montant d�pens� en cadeaux.");
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
		
		JOptionPane.showMessageDialog(null, "Cin�ma: " + iPourcentCine + "%" + "\nRestaurant: " + iPourcentResto + "%" + 
											"\nQuilles: " + iPourcentQuille + "%" + "\nCadeaux : " + iPourcentCadeau + "%" + 
											"\nBudget Restant: " + iPourcentBudgetRestant + "%", "Budget annuel de sorties", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
