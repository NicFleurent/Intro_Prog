package pkChaineCar;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class ChaineCarNo1V2 
{

	public static void main(String[] args) 
	{
		final	int				I_FIN		= 999;
		final	double			D_VIDE		= 0;
		
				String			strNbr		= "";
				String			strMessage	= "Les palindromes qui ont été entrez sont:";
				
				char			cNbr1, cNbr2;
				
				int				iNbr;
				
				double			dCtr = 0, dPal = 0, dMoy = 0;
				
				NumberFormat 	pourcentage = NumberFormat.getPercentInstance();
		
		strNbr	= JOptionPane.showInputDialog(	null, 
				"Entrez un nombre entre 100 et 998 inclus", 
				"Entrez 999 pour terminer la saisie");
		
		iNbr	= Integer.parseInt(strNbr);
		

		while (iNbr != I_FIN)
			{
				
				if (strNbr.length() == 3) 
				{
					dCtr++;
					cNbr1	= strNbr.charAt(0);
					cNbr2	= strNbr.charAt(2);
					
					if (cNbr1 == cNbr2)
					{
						strMessage	+= "\n" + strNbr + " ";
						dPal++;
					}
				}
				
				strNbr	= JOptionPane.showInputDialog(	null, 
														"Entrez un nombre entre 100 et 998 inclus", 
														"Entrez 999 pour terminer la saisie");
				iNbr	= Integer.parseInt(strNbr);
				
			} 
		
		if (dPal == D_VIDE)
			{
				strMessage = " ";
				strMessage += "Aucun palindrome n'a été identifié";
			}
		else
			{
				dMoy = dPal / dCtr;
				strMessage += "\nLa moyenne de palindrome est de: " + pourcentage.format(dMoy);
			}
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		System.exit(0);

	}

}
