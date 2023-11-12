package pkCoursTantque;

import javax.swing.*;

public class CoursTantqueNo5 
{

	public static void main(String[] args) 
	{
		int iNbr;
		String strMessage = " ";
		
		for(int ctr = 1; ctr <=5 ; ctr++)
		{
			iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre en 10 et 100"));
			
			while (!((iNbr >= 10) && (iNbr <= 100)))
				{
					iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre entre 10 et 100"));
				}
		strMessage += iNbr + " ";
		}
		JOptionPane.showMessageDialog(null, strMessage);
	}

}
