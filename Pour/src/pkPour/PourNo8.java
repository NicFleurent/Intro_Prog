package pkPour;

import javax.swing.*;

public class PourNo8 
{

	public static void main(String[] args) 
	{
		String	strMessage 		= " ";			//Pour message de fin
		
		int		iNbr1;							//Premier nombre demander à l'utilisateur
		int		iNbr2;							//Deuxieme nombre demander à l'utilisateur
		int		iMulti 			= 0;			//Résultat de la multiplication
		int		premiereFois	= 0;			//Comparatif pour la premiere fois
		
		iNbr1 = Integer.parseInt(JOptionPane.showInputDialog("Entrez le premier nombre entier à multiplier."));
		iNbr2 = Integer.parseInt(JOptionPane.showInputDialog("Entrez le deuixième nombre entier à multiplier."));
		
		if (iNbr1 < iNbr2)
			{
				for (int ctr = 1; ctr <= iNbr1; ctr++)
				{
					if (premiereFois == 0)
						{
							iMulti 		+= iNbr2;
							strMessage 	+= iNbr2;
							premiereFois++;
							
						}
					else
						{
							iMulti += iNbr2;
							
							strMessage += " + " + iNbr2;
						}	
				}
			}
		else
			{
				for (int ctr = 1; ctr <= iNbr2; ctr++)
					{
						if (premiereFois == 0)
							{
								iMulti 		+= iNbr1;
								strMessage 	+= iNbr1;
								premiereFois++;
								
							}
						else
							{
								iMulti += iNbr1;
								
								strMessage += " + " + iNbr1;
							}	
					}
			}
		
		strMessage += " = " + iMulti;
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		System.exit(0);
		
	}

}
