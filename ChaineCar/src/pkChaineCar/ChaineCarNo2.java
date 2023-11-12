package pkChaineCar;

import javax.swing.*;

public class ChaineCarNo2 
{

	public static void main(String[] args) 
	{
		final	int		I_LIM_MIN	= 1;
		final	int		I_LIM_MAX	= 999;
		final	int		I_RETOUR	= 10;
				
				int		iNbr, iLong;
				double	dNbr1, dNbr2, dNbr3;
				
				char	cNbr1, cNbr2, cNbr3;
		
				String	strNbr		= " ";
				String	strMessage	= "Les nombres Armstrong sont:\n";
		
		for (iNbr = I_LIM_MIN ; iNbr <= I_LIM_MAX ; iNbr++)
		{
			if (iNbr == I_RETOUR)
				strMessage += "\n";
			
			if (iNbr >= 10)
			{
				strNbr	= String.valueOf(iNbr);
				iLong	= strNbr.length();
				
				switch (iLong)
				{
				case 2:
					cNbr1 = strNbr.charAt(0);
					dNbr1 = (double) Character.getNumericValue(cNbr1);
					dNbr1 = Math.pow(dNbr1, (double) iLong);
					
					cNbr2 = strNbr.charAt(1);
					dNbr2 = (double) Character.getNumericValue(cNbr2);
					dNbr2 = Math.pow(dNbr2, (double) iLong);
					
					if ((double) iNbr == (dNbr1 + dNbr2))
					{
						strMessage += iNbr + " ";
					}
					
					break;
				
				case 3:
					cNbr1 = strNbr.charAt(0);
					dNbr1 = (double) Character.getNumericValue(cNbr1);
					dNbr1 = Math.pow(dNbr1, (double) iLong);
					
					cNbr2 = strNbr.charAt(1);
					dNbr2 = (double) Character.getNumericValue(cNbr2);
					dNbr2 = Math.pow(dNbr2, (double) iLong);
					
					cNbr3 = strNbr.charAt(2);
					dNbr3 = (double) Character.getNumericValue(cNbr3);
					dNbr3 = Math.pow(dNbr3, (double) iLong);
					
					if ((double) iNbr == (dNbr1 + dNbr2 + dNbr3))
					{
						strMessage += iNbr + " ";
					}
					
					break;
				}
			}
			else
				strMessage += iNbr + " ";
		}
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		System.exit(0);

	}

}
