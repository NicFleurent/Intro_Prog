package pkQuizTab;

public class QuizTabNo1 
{

	public static void main(String[] args) 
	{
		final	int		BON	= 15;
		final	int		FIN	= 11;
		
				int		iTab[]	= {1, 2, 3, 4, 5, 6, 3, 8, 9, 3, 11, 12};
				
				String	strMessage = "";
		
		for (int iCtr = 0 ; iCtr < iTab.length ; iCtr++)
		{
			if ((iTab[FIN] + iTab[iCtr]) == BON)
			{
				strMessage += "\n" + iTab[FIN] + " + " + iTab[iCtr];
			}
		}
		
		System.out.println(strMessage);
	}

}
