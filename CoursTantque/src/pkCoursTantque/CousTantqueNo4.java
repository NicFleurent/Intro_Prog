package pkCoursTantque;

import javax.swing.JOptionPane;

public class CousTantqueNo4 
{

	public static void main(String[] args) 
	{
		int iNbr;
		
		iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre entre 10 et 100"));
		
		while (!((iNbr >= 10) && (iNbr <= 100)))
				{
					iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre entre 10 et 100"));
				}
		JOptionPane.showMessageDialog(null, "Le nombre est: " + iNbr);
		
		System.exit(0);
	}

}
