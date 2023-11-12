package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo6 
{

	public static void main(String[] args) 
	{
		String strEcoInitial;		//Montant de départ des économies
		String strNbrBurger;		//Nombre de hamburger consommé
		String strPrixBruger;		//Prix de chaque hamburger
		String strNbrCoke;			//Nombre de Coke consommé
		String strPrixCoke;			//Prix de chaque Coke
		String strNbrGlace;			//Nombre de crème glacée consommé
		String strPrixGlace;		//Prix de chaque créme glacée
		
		double dEcoInitial;
		double dNbrBurger;
		double dPrixBurger;
		double dNbrCoke;
		double dPrixCoke;
		double dNbrGlace;
		double dPrixGlace;
		
		double dEcoFinal;			//Montant final des économies
		
		strEcoInitial 	= JOptionPane.showInputDialog("Entrez le montant des économies initiales.");
		strNbrBurger 	= JOptionPane.showInputDialog("Entrez le nombre de hamburgers consommés.");
		strPrixBruger 	= JOptionPane.showInputDialog("Entrez le prix d'un hamburger.");
		strNbrCoke 		= JOptionPane.showInputDialog("Entrez le nombre de Cokes consommés.");
		strPrixCoke 	= JOptionPane.showInputDialog("Entrez le prix d'un Coke.");
		strNbrGlace 	= JOptionPane.showInputDialog("Entrez le nombre de crèmes glacées consommés.");
		strPrixGlace 	= JOptionPane.showInputDialog("Entrez le prix d'une crème glacée.");
		dEcoInitial 	= Double.parseDouble(strEcoInitial);
		dNbrBurger 		= Double.parseDouble(strNbrBurger);
		dPrixBurger 	= Double.parseDouble(strPrixBruger);
		dNbrCoke 		= Double.parseDouble(strNbrCoke);
		dPrixCoke 		= Double.parseDouble(strPrixCoke);
		dNbrGlace 		= Double.parseDouble(strNbrGlace);
		dPrixGlace 		= Double.parseDouble(strPrixGlace);
		
		dEcoFinal = dEcoInitial - ((dNbrBurger * dPrixBurger) + (dNbrCoke * dPrixCoke) + (dNbrGlace * dPrixGlace));
		
		JOptionPane.showMessageDialog(null, "Le montant restant des économies est de: " + dEcoFinal + "$", "Économies restantes", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
