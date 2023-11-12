package pkQuizSem7;

import javax.swing.*;

public class QuizSem7No1 
{

	public static void main(String[] args) 
	{
		
		String	strMessage	= " ";
		
		for (int iCtr1 = 7 ; iCtr1 > 0 ; iCtr1--)
		{
			strMessage += "\n";
			for (int iCtr2 = 1 ; iCtr2 < iCtr1 ; iCtr2++)
			{
				strMessage += "* ";
			}
		}
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		System.exit(0);
	}

}
