package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No10 
{

	public static void main(String[] args) 
	{
		
		final double 	D_VAL_1_SOU = 0.01;		//Valeur de 1 sou
		final double 	D_VAL_5_SOU = 0.05;		//Valeur de 5 sous
		final double 	D_VAL_10_SOU = 0.1;		//Valeur de 10 sous
		final double 	D_VAL_25_SOU = 0.25;	//Valeur de 25 sous
		final double 	D_VAL_1_DOL = 1;		//Valeur de 1 dollard
		final double 	D_VAL_2_DOL = 2;		//Valeur de 2 dollords
		
		String 			strNbr1Sou;				//Nombre de 1 sou
		String 			strNbr5Sou;				//Nombre de 5 sous
		String 			strNbr10Sou;			//Nombre de 10 sous
		String 			strNbr25Sou;			//Nombre de 25 sous
		String 			strNbr1Dol;				//Nombre de 1 dollard
		String 			strNbr2Dol;				//Nombre de 2 dollards
		
		double 			dNbr1Sou;				//Conversion 1 sou
		double 			dNbr5Sou;				//Conversion 5 sous
		double 			dNbr10Sou;				//Conversion 10 sous
		double 			dNbr25Sou;				//Conversion 25 sous
		double 			dNbr1Dol;				//Conversion 1 dollard
		double 			dNbr2Dol;				//Conversion 2 dollards
		
		double dEcono;							//Montant des �conomies
		
		NumberFormat signedollard = NumberFormat.getCurrencyInstance();
		
		strNbr1Sou 		= JOptionPane.showInputDialog("Entrez le nombre de 1 sou.");
		strNbr5Sou 		= JOptionPane.showInputDialog("Entrez le nombre de 5 sous.");
		strNbr10Sou 	= JOptionPane.showInputDialog("Entrez le nombre de 10 sous.");
		strNbr25Sou 	= JOptionPane.showInputDialog("Entrez le nombre de 25 sous.");
		strNbr1Dol 		= JOptionPane.showInputDialog("Entrez le nombre de 1 dollard.");
		strNbr2Dol 		= JOptionPane.showInputDialog("Entrez le nombre de 2 dollards.");
		dNbr1Sou		= Double.parseDouble(strNbr1Sou);
		dNbr5Sou		= Double.parseDouble(strNbr5Sou);
		dNbr10Sou		= Double.parseDouble(strNbr10Sou);
		dNbr25Sou		= Double.parseDouble(strNbr25Sou);
		dNbr1Dol		= Double.parseDouble(strNbr1Dol);
		dNbr2Dol		= Double.parseDouble(strNbr2Dol);
		
		dNbr1Sou 	*= D_VAL_1_SOU;
		dNbr5Sou 	*= D_VAL_5_SOU;
		dNbr10Sou 	*= D_VAL_10_SOU;
		dNbr25Sou 	*= D_VAL_25_SOU;
		dNbr1Dol 	*= D_VAL_1_DOL;
		dNbr2Dol 	*= D_VAL_2_DOL;
		
		dEcono 		= dNbr1Sou + dNbr5Sou + dNbr10Sou + dNbr25Sou + dNbr1Dol + dNbr2Dol;
		
		JOptionPane.showMessageDialog(null, "Le montant des �conomies s'�l�ve � " + signedollard.format(dEcono));
		
		System.exit(0);
		
	}

}
