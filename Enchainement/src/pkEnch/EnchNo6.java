package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo6 
{

	public static void main(String[] args) 
	{
		String strEcoInitial;		//Montant de d�part des �conomies
		String strNbrBurger;		//Nombre de hamburger consomm�
		String strPrixBruger;		//Prix de chaque hamburger
		String strNbrCoke;			//Nombre de Coke consomm�
		String strPrixCoke;			//Prix de chaque Coke
		String strNbrGlace;			//Nombre de cr�me glac�e consomm�
		String strPrixGlace;		//Prix de chaque cr�me glac�e
		
		double dEcoInitial;
		double dNbrBurger;
		double dPrixBurger;
		double dNbrCoke;
		double dPrixCoke;
		double dNbrGlace;
		double dPrixGlace;
		
		double dEcoFinal;			//Montant final des �conomies
		
		strEcoInitial 	= JOptionPane.showInputDialog("Entrez le montant des �conomies initiales.");
		strNbrBurger 	= JOptionPane.showInputDialog("Entrez le nombre de hamburgers consomm�s.");
		strPrixBruger 	= JOptionPane.showInputDialog("Entrez le prix d'un hamburger.");
		strNbrCoke 		= JOptionPane.showInputDialog("Entrez le nombre de Cokes consomm�s.");
		strPrixCoke 	= JOptionPane.showInputDialog("Entrez le prix d'un Coke.");
		strNbrGlace 	= JOptionPane.showInputDialog("Entrez le nombre de cr�mes glac�es consomm�s.");
		strPrixGlace 	= JOptionPane.showInputDialog("Entrez le prix d'une cr�me glac�e.");
		dEcoInitial 	= Double.parseDouble(strEcoInitial);
		dNbrBurger 		= Double.parseDouble(strNbrBurger);
		dPrixBurger 	= Double.parseDouble(strPrixBruger);
		dNbrCoke 		= Double.parseDouble(strNbrCoke);
		dPrixCoke 		= Double.parseDouble(strPrixCoke);
		dNbrGlace 		= Double.parseDouble(strNbrGlace);
		dPrixGlace 		= Double.parseDouble(strPrixGlace);
		
		dEcoFinal = dEcoInitial - ((dNbrBurger * dPrixBurger) + (dNbrCoke * dPrixCoke) + (dNbrGlace * dPrixGlace));
		
		JOptionPane.showMessageDialog(null, "Le montant restant des �conomies est de: " + dEcoFinal + "$", "�conomies restantes", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
