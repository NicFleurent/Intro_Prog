package pkExamenSynthese;

public class ExamenSyntheseNo1 
{

	public static void main(String[] args) 
	{
		final	int		VIDE				= 0;
				int		iTab[]				= {1, 8, 1, 24, 8, 4, 1, 28, 23, 24};
				int		iTabElement[];
				int		iTabCompteur[];
				
				String	strAffichage		= "";
		
		iTabElement 	= new int[iTab.length];
		iTabCompteur 	= new int[iTab.length];
		
		for(int iCtr = 0 ; iCtr < iTab.length ; iCtr++)
		{
			for(int iCtr2 = 0 ; iCtr2 < iTabElement.length ; iCtr2++)
			{
				if (iTabElement[iCtr2] == VIDE)
				{
					iTabElement[iCtr2] 		= iTab[iCtr];
					iTabCompteur[iCtr2]++;
					break;
					
				}
				else if (iTabElement[iCtr2] == iTab[iCtr])
				{
					iTabCompteur[iCtr2]++;
					break;
				}
			}
		}
		
		for (int iCtr = 0 ; iCtr < iTab.length ; iCtr++)
		{
			for(int iCtr2 = 0 ; iCtr2 < iTabElement.length ; iCtr2++)
			{
				if (iTabElement[iCtr2] == iTab[iCtr])
				{
					strAffichage += "Élément " + iTabElement[iCtr2] + " - " + iTabCompteur[iCtr2] + " fois\n";
					break;
				}
			}
		}
		
		System.out.println(strAffichage);
		
		System.exit(0);
		
		/*
		 	Élément 1 - 3 fois
			Élément 8 - 2 fois
			Élément 1 - 3 fois
			Élément 24 - 2 fois
			Élément 8 - 2 fois
			Élément 4 - 1 fois
			Élément 1 - 3 fois
			Élément 28 - 1 fois
			Élément 23 - 1 fois
			Élément 24 - 2 fois
		 */

	}

}
