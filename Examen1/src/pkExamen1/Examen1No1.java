package pkExamen1;

public class Examen1No1 
{

	public static void main(String[] args) 
	{
		final	int		NBR_DEP	= 1;
		final	int		NBR_FIN	= 500;
		
				String	strMessage	= "Les nombres parfait entre 1 et 500 sont:\n";
		
				int		iNbr	= 0;
				int		iCtr;
				int		iSomme;
		
		for (iNbr = NBR_DEP ; iNbr <= NBR_FIN ; iNbr++)
		{
			iSomme = 0;
			
			for(iCtr = 1 ; iCtr < iNbr; iCtr++)
				{
				if (iNbr % iCtr == 0)
					iSomme += iCtr;
				}
			
			if (iSomme == iNbr)
				strMessage += iSomme + "\n";
		}
		
		System.out.println(strMessage);
		
		System.exit(0);
		
//		Les nombres parfait entre 1 et 500 sont:
//		6
//		28
//		496

	}

}
