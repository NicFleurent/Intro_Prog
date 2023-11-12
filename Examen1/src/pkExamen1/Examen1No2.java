package pkExamen1;

public class Examen1No2 
{

	public static void main(String[] args) 
	{
		final 	int		NBR_DEP 	= 6;
		final 	int		NBR_FIN 	= 0;
		
				String	strMessage	= "";
		
		for (int iCtr1 = NBR_DEP ; iCtr1 > NBR_FIN ; iCtr1--)
		{
			
			for (int iCtr2 = 1 ; iCtr2 <= iCtr1 ; iCtr2++)
			{
				strMessage += iCtr2 + " ";
			}
			strMessage += "\n";
		}

		System.out.println(strMessage);

		System.exit(0);
		
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

	}

}
