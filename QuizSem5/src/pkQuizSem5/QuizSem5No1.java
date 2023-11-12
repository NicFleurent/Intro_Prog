package pkQuizSem5;

import javax.swing.*;
import java.text.*;

public class QuizSem5No1 
{

	public static void main(String[] args) 
	{
		final	double	D_COUT_MIN_1 	= 1.50;			//Constant cout pallier 1 min
		final	double	D_COUT_MIN_2 	= 2;			//Constant cout pallier 1 min
		final	double	D_COUT_INTER 	= 2;			//Constant cout pallier 1 min
		final	double	D_MIN 			= 20;			//Constante 20 1ere min
		
				String 	strNom;							//Nom client
				String	strNbrMin;						//Nombre minute
				String	strNbrInter;					//Nombre d'appel interubain
				String	strMois;						//Mois
				
				double	dNbrMin;						//conversion nombre de minute
				double	dNbrInter;						//Conversion nombre d'appel interurbain
				double	dCoutTotal		= 0;			//Pour calcul cout total
		
		NumberFormat 	signedollars 	= NumberFormat.getCurrencyInstance();
		
		strNom 		= JOptionPane.showInputDialog("Entrez le nom du client.");
		strMois 	= JOptionPane.showInputDialog("Entrez le mois. (en lettre complete s.v.p.)");
		strNbrMin 	= JOptionPane.showInputDialog("Entrez le nombre de minute d'appel.");
		strNbrInter = JOptionPane.showInputDialog("Entrez le nombre d'appels interurbains.");
		dNbrMin		= Double.parseDouble(strNbrMin);
		dNbrInter	= Double.parseDouble(strNbrInter);
		
		if (dNbrMin <= D_MIN)
			dCoutTotal = dNbrMin * D_COUT_MIN_1;
		else
			dCoutTotal = (D_MIN * D_COUT_MIN_1) + ((dNbrMin - D_MIN) * D_COUT_MIN_2);
		
		if (dNbrInter > 0)
			dCoutTotal += dNbrInter * D_COUT_INTER;
		
		JOptionPane.showMessageDialog(null, "Pour le mois de " + strMois + " les frais mensuels de " + strNom + " s'élève à " + signedollars.format(dCoutTotal));
		
		System.exit(0);
		
	}

}
