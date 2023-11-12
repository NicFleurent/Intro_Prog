package pkSi;

import javax.swing.*;
import java.text.*;

public class SiNo4 
{

	public static void main(String[] args) 
	{
		final	double	D_AUG_0 	= 1.05;		//Augmentation � 0 accident
		final	double	D_AUG_1 	= 1.08;		//Augmentation � 1 accident
		final	double	D_AUG_2 	= 1.15;		//Augmentation � 2 accident
		final	double	D_AUG_3 	= 1.40;		//Augmentation � 3 accident
		final	int		I_NBR_ACC_0 = 0;		//Constant pour comparaison a 0 accident
		final	int		I_NBR_ACC_1 = 1;		//Constant pour comparaison a 1 accident
		final	int		I_NBR_ACC_2 = 2;		//Constant pour comparaison a 2 accident
		final	int		I_NBR_ACC_3 = 3;		//Constant pour comparaison a 3 accident
		
				String 	strNumClient;			//Num�ro du client
				String 	strNbrAcc;				//Nombre d'accident
				String 	strPrime;				//Prime Actuel
				String	strResPrime = " ";		//Variable pour le message de fin
				
				int		iNbrAcc;				//Conversion nombre accident
				
				double	dPrime;					//Conversion de la prime
		
		NumberFormat signedollard = NumberFormat.getCurrencyInstance();
		
		strNumClient 	= JOptionPane.showInputDialog("Entrez le num�ro du client.");
		strNbrAcc 		= JOptionPane.showInputDialog("Entrez le nombre d'accident du client.");
		iNbrAcc 		= Integer.parseInt(strNbrAcc);
				
		if (iNbrAcc == I_NBR_ACC_0)
			{
				strPrime 		= JOptionPane.showInputDialog("Entrez la prime du client.");
				dPrime			= Double.parseDouble(strPrime);
				
				dPrime 			*= D_AUG_0;
				
				strResPrime 	+= "La nouvelle prime du client num�ro " + strNumClient + " est de " + signedollard.format(dPrime);
				
				JOptionPane.showMessageDialog(null, strResPrime);
			}
		
		else if (iNbrAcc == I_NBR_ACC_1)
			{
				strPrime 		= JOptionPane.showInputDialog("Entrez la prime du client.");
				dPrime			= Double.parseDouble(strPrime);
				
				dPrime 			*= D_AUG_1;
				
				strResPrime 	+= "La nouvelle prime du client num�ro " + strNumClient + " est de " + signedollard.format(dPrime);
				
				JOptionPane.showMessageDialog(null, strResPrime);
			}
		
		
		else if (iNbrAcc == I_NBR_ACC_2)
			{
				strPrime 		= JOptionPane.showInputDialog("Entrez la prime du client.");
				dPrime			= Double.parseDouble(strPrime);
				
				dPrime 			*= D_AUG_2;
				
				strResPrime 	+= "La nouvelle prime du client num�ro " + strNumClient + " est de " + signedollard.format(dPrime);
				
				JOptionPane.showMessageDialog(null, strResPrime);
			}
		
		else if (iNbrAcc == I_NBR_ACC_3)
			{
				strPrime 		= JOptionPane.showInputDialog("Entrez la prime du client.");
				dPrime			= Double.parseDouble(strPrime);
				
				dPrime 			*= D_AUG_3;
				
				strResPrime 	+= "La nouvelle prime du client num�ro " + strNumClient + " est de " + signedollard.format(dPrime);
				
				JOptionPane.showMessageDialog(null, strResPrime);
			}
		
		else
			{
				
				strResPrime 	+= "La police du client num�ro " + strNumClient + " doit �tre supprimer.";
				
				JOptionPane.showMessageDialog(null, strResPrime);
			}
					
		System.exit(0);
		
	}

}
