package pkExamenSynthese;

public class ExamenSyntheseNo3 
{

	public static void main(String[] args) 
	{
		final	int		MAX_RES			= 3;
		
				String	strAffichage	= "";
		
				int		iMatA[][]		= {	{3, 2, 5, 4},
											{7, 8, 6, 9},
											{1, 5, 3,2}};
				
				int		iMatB[][]		= {	{8, 3, 4},
											{2, 6, 7},
											{9, 1, 3},
											{4, 5, 2}};
				
				int		iResultat[]	= new int[MAX_RES];
				
		for (int iLigne = 0 ; iLigne < iMatA.length ; iLigne++)
		{
			for(int iCol = 0 ; iCol < iMatA[iLigne].length ; iCol++)
			{
				iResultat[iLigne] += iMatA[iLigne][iCol] * iMatB[iCol][iLigne];
			}
		}
		
		for(int iCtr = 0 ; iCtr < iResultat.length ; iCtr++)
		{
			strAffichage += iResultat[iCtr] + "\n";
		}
		
		System.out.println(strAffichage);
		
		System.exit(0);
		
		/*
		 	89
			120
			52
		 */

	}

}
