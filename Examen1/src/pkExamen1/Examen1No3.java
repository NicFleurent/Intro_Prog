package pkExamen1;

import javax.swing.*;

public class Examen1No3 
{

	public static void main(String[] args) 
	{
		final	int		NBR_PAIRE		= 2;
		final	int		NBR_SAISIE		= 5;
		
				String	strMessage		= "";
				
				int		iNbr1, iNbr2;
				int		iSommePair, iProdImpair;
				int 	iSommePairTot	= 0;
				int		iSommeImpairTot	= 0;
				int		iSommeReste		= 0;
		
		for (int iCtr = 1 ; iCtr <= NBR_SAISIE ; iCtr++)
		{
			iNbr1 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un premier nombre entier."));
			iNbr2 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un deuxième nombre entier."));
			
			if ((iNbr1 % NBR_PAIRE == 0) && (iNbr2 % NBR_PAIRE == 0))
			{
				iSommePair 		= iNbr1 + iNbr2;
				JOptionPane.showMessageDialog(null, "La somme des nombres " + iNbr1 + " et " + iNbr2 + " est de " + iSommePair);
				iSommePairTot	+= iSommePair;
				
			}
			
			else if ((iNbr1 % NBR_PAIRE != 0) && (iNbr2 % NBR_PAIRE != 0))
			{
				iProdImpair 	= iNbr1 * iNbr2;
				JOptionPane.showMessageDialog(null, "Le produit des nombres " + iNbr1 + " et " + iNbr2 + " est de " + iProdImpair);
				iSommeImpairTot	+= iProdImpair;
			}
			
			else
				iSommeReste 	+= iNbr1 + iNbr2;
		}
		
		strMessage += "La somme de toutes les sommes est de : " + iSommePairTot + " \n";
		strMessage += "La somme de tous les produits est de : " + iSommeImpairTot + " \n";
		strMessage += "La somme de tous les autres nombres est de est de : " + iSommeReste + " \n";
		
		System.out.println(strMessage);
		
		System.exit(0);
		
//		La somme de toutes les sommes est de : 12 
//		La somme de tous les produits est de : 1 
//		La somme de tous les autres nombres est de est de : 14 

	}

}
