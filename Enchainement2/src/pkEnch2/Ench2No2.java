package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No2 
{

	public static void main(String[] args) 
	{
				String strMois;						//Pour permettre à l'utilisateur d'entrer le mois
				String strVendeur;					//Pour permettre à l'utilisateur d'entrer le nom du vendeur
				String strNbrOrdi;					//Pour permettre à l'utilisateur d'entrer le nombre d'ordinateur vendu
				String strVente;					//Pour permettre à l'utilisateur d'entrer les ventes du mois du vendeur
				
				double dNbrOrdi;					//Conversion du nombre d'ordinateur vendu
				double dVente;						//Conversion du montant des ventes mensuelles
		
		final 	double D_SAL_MENS 		= 900;		//Constante du salaire mensuel
		final 	double D_PRIME_ORDI 	= 50;		//Constante de la prime pour chaque vente d'ordinateur
		final 	double D_COMMIS 		= 0.02;		//Constante de la commission sur les ordinateurs vendus
		
				double dSalMensFinal;				//Variable pour le calcul de salaire final

		NumberFormat signedollars = NumberFormat.getCurrencyInstance();
		
		strMois 	= JOptionPane.showInputDialog("Entrez le mois payable.");
		strVendeur 	= JOptionPane.showInputDialog("Entrez le nom du vendeur.");
		strNbrOrdi	= JOptionPane.showInputDialog("Entrez le nombre d'ordinateur vendu.");
		strVente	= JOptionPane.showInputDialog("Entrez le montant des ventes mensuelles.");
		dNbrOrdi	= Double.parseDouble(strNbrOrdi);
		dVente		= Double.parseDouble(strVente);
		
		dSalMensFinal 	= D_SAL_MENS + (dNbrOrdi * D_PRIME_ORDI)  + (dVente * D_COMMIS);
		
		String strFichePaye = " ";
		
		strFichePaye += "\nMois payable: " + strMois;
		strFichePaye += "\nNom du vendeur: " + strVendeur;
		strFichePaye += "\nSalaire du mois traité: " + signedollars.format(dSalMensFinal);
		
		JOptionPane.showMessageDialog(null, strFichePaye, "Fiche de paye", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
