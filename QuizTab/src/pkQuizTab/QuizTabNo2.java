package pkQuizTab;

public class QuizTabNo2 
{

	public static void main(String[] args) 
	{
		final	int		BON	= 15;
		
				int		iTab[]	= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
				
				String	strMessage = "";
		
		for (int iCtr1 = 0 ; iCtr1 < (iTab.length/2) ; iCtr1++)
		{
			for (int iCtr2 = 0 ; iCtr2 < iTab.length ; iCtr2++)
				if ((iTab[iCtr1] + iTab[iCtr2]) == BON)
					strMessage += "\n" + iTab[iCtr1] + " + " + iTab[iCtr2];
		}
		
		System.out.println(strMessage);

	}

}
