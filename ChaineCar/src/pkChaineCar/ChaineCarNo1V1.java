package pkChaineCar;

import javax.swing.*;
import java.text.*;

public class ChaineCarNo1V1 
{

	public static void main(String[] args) 
	{
		final	double			D_LIM_MIN	= 100;
		final	double			D_LIM_MAX	= 999;
		
				String			strNbr		= "";
				String			strMessage	= "Les palindromes compris entre 100 et 999 sont:";
				
				char			cNbr1, cNbr2;
				
				double			dNbr, dPal = 0, dMoy = 0;
				
				NumberFormat 	pourcentage = NumberFormat.getPercentInstance();
				DecimalFormat	zero		= new DecimalFormat ("0");
		
		
		for (dNbr = D_LIM_MIN ; dNbr <= D_LIM_MAX ; dNbr++)
		{
			strNbr	= String.valueOf(zero.format(dNbr));
			cNbr1	= strNbr.charAt(0);
			cNbr2	= strNbr.charAt(2);

			if (dNbr % 100 == 0)
				strMessage += "\n";
			
			if (cNbr1 == cNbr2)
			{
				strMessage	+= strNbr + " ";
				dPal++;
			}
		}
		
		dMoy = dPal / (D_LIM_MAX - D_LIM_MIN);
		strMessage += "\n La moyenne de palindrome est de: " + pourcentage.format(dMoy);
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		System.exit(0);

	}

}
