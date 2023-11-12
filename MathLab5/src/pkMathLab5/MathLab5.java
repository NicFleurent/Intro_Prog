package pkMathLab5;

import javax.swing.*;

public class MathLab5 
{

	public static void main(String[] args) 
	{
		final	int		MAX_LONG		= 8;										//Maximum de longueur de binaire
		
				int 	iNbr			= 0;										//Nombre à convertir
				
				int 	iDiv[]			= new int[MAX_LONG];						//Division
				int		iMod[]			= new int[MAX_LONG];						//Modulo
				
				String	strAffichage	= "";
				
				boolean	bCherche		= true;
				
		/********************************************
		Convertisseur base10 vers base2
		********************************************/		
		iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrer un nombre entre -128 et 127"));
		
		if (iNbr >= 0 && iNbr <= 127)
		{
			for (int iCtr = 0 ; iCtr < MAX_LONG ; iCtr++)
			{
				if (iCtr == 0)
				{
					iDiv[iCtr] 	= iNbr / 2;
					iMod[iCtr]	= iNbr % 2;
				}
				else
				{
					iDiv[iCtr] 	= iDiv[iCtr - 1] / 2;
					iMod[iCtr]	= iDiv[iCtr - 1] % 2;
				}
			}
			
			for (int iCtr = (MAX_LONG - 1) ; iCtr >= 0 ; iCtr--)
			{
				strAffichage += iMod[iCtr];
			}
			
			JOptionPane.showMessageDialog(null, strAffichage);
		}
		
		if (iNbr >= -128 && iNbr < 0)
		{
			for (int iCtr = 0 ; iCtr < MAX_LONG ; iCtr++)
			{
				if (iCtr == 0)
				{
					iDiv[iCtr] 	= Math.abs(iNbr / 2);
					iMod[iCtr]	= Math.abs(iNbr % 2);
				}
				else
				{
					iDiv[iCtr] 	= Math.abs(iDiv[iCtr - 1] / 2);
					iMod[iCtr]	= Math.abs(iDiv[iCtr - 1] % 2);
				}
			}
			
			for (int iCtr = 0 ; iCtr < MAX_LONG ; iCtr++)
			{
				if (bCherche)
					if (iMod[iCtr] == 1)
					{
						bCherche = false;
						continue;
					}
				
				if (!bCherche)
					if (iMod[iCtr] == 0)
						iMod[iCtr] = 1;
					else
						iMod[iCtr] = 0;
			}
			
			for (int iCtr = (MAX_LONG - 1) ; iCtr >= 0 ; iCtr--)
			{
				strAffichage += iMod[iCtr];
			}
			
			JOptionPane.showMessageDialog(null, strAffichage);
		}
		
		
		

	}

}
