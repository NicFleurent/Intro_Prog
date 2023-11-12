package pkQuizSem7;

import javax.swing.*;

public class QuizSem7No2 
{

	public static void main(String[] args) 
	{
		String	strMessage	= "";
		
		for (int iCtr1 = 1 ; iCtr1 <= 7 ; iCtr1++)
		{
			
			for (int iCtr2 = 1 ; iCtr2 < iCtr1 ; iCtr2++)
			{
				strMessage += iCtr2 + " ";
			}
			strMessage += "\n";
		}
		
//		for (int iCtr = 1 ; iCtr <= 6 ; iCtr++)
//		{
//			strNbr	= String.valueOf(iCtr);
//			cNbr	= strNbr.charAt(0);
//			strNbrFinal	+= cNbr + " ";
//			
//			strMessage	+= strNbrFinal + "\n";
//		}
		
		JOptionPane.showMessageDialog(null, strMessage);

		System.exit(0);
	}

}
