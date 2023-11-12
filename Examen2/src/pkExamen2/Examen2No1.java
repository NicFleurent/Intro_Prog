package pkExamen2;

import javax.swing.JOptionPane;

public class Examen2No1 
{

	public static void main(String[] args) 
	{
		final	int		LONG_TAB		= 7;
		final	int		VIDE			= 0;
		
				String	strAffichage	= "";
		
				int		iTabEnsemble1[]	= {2, 15, 14, 15, 10, 20, 18};
				int		iTabEnsemble2[]	= {9, 18, 19, 14, 15, 2, 15};
				int		iTabInter[]		= new int[LONG_TAB];
				
				boolean	bExistant		= false;
				boolean	bPremiereFois	= true;
			
		for(int iCtr1 = 0 ; iCtr1 < iTabEnsemble1.length ; iCtr1++)
		{
			for(int iCtr2 = 0 ; iCtr2 < iTabEnsemble2.length ; iCtr2++)
			{
				bExistant = false;
				
				if (iTabEnsemble1[iCtr1] == iTabEnsemble2[iCtr2])
				{
					for (int iCtr3 = 0 ; iCtr3 < iTabInter.length ; iCtr3++)
					{
						if (iTabInter[iCtr3] == iTabEnsemble2[iCtr2])
						{
							bExistant = true;
						}
					}
					
					if(!bExistant)
					{
						for (int iCtr3 = 0 ; iCtr3 < iTabInter.length ; iCtr3++)
						{
							if (iTabInter[iCtr3] == VIDE)
							{
								iTabInter[iCtr3] = iTabEnsemble2[iCtr2];
								break;
							}
						}
					}
				}
			}
		}
	
		for (int iCtr3 = 0 ; iCtr3 < iTabInter.length ; iCtr3++)
		{
			if(bPremiereFois)
			{
				strAffichage 	+= iTabInter[iCtr3];
				bPremiereFois	= false;
				continue;
			}
			
			if(iTabInter[iCtr3] != VIDE)
				strAffichage += ", " + iTabInter[iCtr3];
		}
		
		JOptionPane.showMessageDialog(null, "L'intersection entre les 2 ensembles est:\n" + strAffichage);
		
		System.exit(0);

	}

}
