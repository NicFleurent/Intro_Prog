package pkExamenSynthese;

public class ExamenSyntheseNo2 
{

	public static void main(String[] args) 
	{
		final	int		POS_LIGNE		= 0;
		final	int		POS_COL			= 1;
				
				String	strAffichage	= "";
				
				int		iMatNombres[][]	= {	{15, 15, 9},
											{1, 3, 88},
											{1, 6, 66},
											{1, 12, 33},
											{2, 9, 11},
											{2, 14, 55},
											{4, 5, 99},
											{7, 2, 44},
											{12, 12, 77},
											{13, 1, 22}};
				
				int 	iMatInit[][];
				int		iValLigne		= 0;
				int		iValCol			= 0;
				int		iValMat			= 0;
				
		iMatInit = new int[iMatNombres[POS_LIGNE][POS_LIGNE]][iMatNombres[POS_LIGNE][POS_COL]];
		
		for(int iLigne = 0 ; iLigne < iMatNombres.length ; iLigne++)
		{
			if (iLigne != 0)
			{
				for(int iCol = 0 ; iCol < iMatNombres[iLigne].length ; iCol++)
				{
					if(iCol == POS_LIGNE)
						iValLigne 	= iMatNombres[iLigne][iCol];
					else if (iCol == POS_COL)
						iValCol		= iMatNombres[iLigne][iCol];
					else
						iValMat		= iMatNombres[iLigne][iCol];
				}
				
				iMatInit[iValLigne][iValCol] = iValMat;
			}
		}
		
		for (int iLigne = 0 ; iLigne < iMatInit.length ; iLigne++)
		{
			for(int iCol = 0 ; iCol < iMatInit[iLigne].length ; iCol++)
			{
				strAffichage += iMatInit[iLigne][iCol] + "\t";
			}
			
			strAffichage += "\n";
		}
		
		System.out.println(strAffichage);
		
		System.exit(0);

		
		/*
		 	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	88	0	0	66	0	0	0	0	0	33	0	0	
			0	0	0	0	0	0	0	0	0	11	0	0	0	0	55	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	99	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	44	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	77	0	0	
			0	22	0	0	0	0	0	0	0	0	0	0	0	0	0	
			0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	
		 */
	}

}
