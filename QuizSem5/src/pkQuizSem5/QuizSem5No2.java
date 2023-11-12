package pkQuizSem5;

import javax.swing.*;
import java.text.*;

public class QuizSem5No2 
{

	public static void main(String[] args) 
	{
		final	double	D_VENTE_1 		= 10000;		//Constante du premier palier de vente
		final	double	D_VENTE_2 		= 50000;		//Constante du deuxieme palier de vente
		final	double	D_COMISSSION_1 	= 0.1;			//Constante de la comission du 1er palier de vente
		final	double	D_COMISSSION_2 	= 0.25;			//Constante de la comission du 2e palier de vente
		final	double	D_COMISSSION_3 	= 0.3;			//Constante de la comission du 3e palier de vente
		final	double	D_DEP_1 		= 500;			//Constante de déplacement du 1er palier
		final	double	D_DEP_2 		= 1500;			//Constante de déplacement du 2e palier
		final	double	D_DEP_3 		= 2000;			//Constante de déplacement du 3e palier
		final	double	D_TRANCHE		= 10000;		//Constante de tranche additionnelle
		final	double	D_BONUS			= 1000;			//Constante du bonus par tranche aditionnelle
		
		
		String	strNom;									//Nom de l'employé
		String	strNum;									//Numéro de l'employé
		String	strVente;								//Vente mensuelle de l'employé
		String	strPresentation			= " ";			//Message à la fin
		
		double	dVente					= 0;			//Vente
		double	dComission				= 0;			//Salaire du vendeur
		double	dPrime					= 0;			//Prime de rendement
		double	dTotal					= 0;			//Montant total
		
		NumberFormat 	signedollars 	= NumberFormat.getCurrencyInstance();
		
		strNom 		= JOptionPane.showInputDialog("Entrez le nom du vendeur.");
		strNum 		= JOptionPane.showInputDialog("Entrez le numéro du vendeur.");
		strVente 	= JOptionPane.showInputDialog("Entrez les ventes mensuelles du vendeur.");
		dVente 		= Double.parseDouble(strVente);
		
		if (dVente <= D_VENTE_1)
			{
			dComission 		= dVente * D_COMISSSION_1;
			dTotal 			= dComission + D_DEP_1 + dVente;
			
			strPresentation += "\nNom du vendeur: " + strNom;
			strPresentation += "\nNuméro d'employé: " + strNum;
			strPresentation += "\nComission: " + signedollars.format(dComission);
			strPresentation += "\nFrais de déplacement: " + signedollars.format(D_DEP_1);
			strPresentation += "\nPrime de rendement: " + signedollars.format(dPrime);
			strPresentation += "\nMontant total: " + signedollars.format(dTotal);
			
			JOptionPane.showMessageDialog(null, strPresentation);
			}
		
		
		else if (dVente <= D_VENTE_2)
			{
			dComission 		= dVente * D_COMISSSION_2;
			dTotal 			= dComission + D_DEP_2 + dVente;
			
			strPresentation += "\nNom du vendeur: " + strNom;
			strPresentation += "\nNuméro d'employé: " + strNum;
			strPresentation += "\nComission: " + signedollars.format(dComission);
			strPresentation += "\nFrais de déplacement: " + signedollars.format(D_DEP_2);
			strPresentation += "\nPrime de rendement: " + signedollars.format(dPrime);
			strPresentation += "\nMontant total: " + signedollars.format(dTotal);
			
			JOptionPane.showMessageDialog(null, strPresentation);
			}
		
		else
			{
			dComission 		= dVente * D_COMISSSION_3;
			dPrime 			= Math.floor((dVente - D_VENTE_2) / D_TRANCHE) * D_BONUS;
			dTotal 			= dComission + D_DEP_3 + dPrime + dVente;
			
			strPresentation += "\nNom du vendeur: " + strNom;
			strPresentation += "\nNuméro d'employé: " + strNum;
			strPresentation += "\nComission: " + signedollars.format(dComission);
			strPresentation += "\nFrais de déplacement: " + signedollars.format(D_DEP_3);
			strPresentation += "\nPrime de rendement: " + signedollars.format(dPrime);
			strPresentation += "\nMontant total: " + signedollars.format(dTotal);
			
			JOptionPane.showMessageDialog(null, strPresentation);
			}
		
			System.exit(0);
			
	}

}
