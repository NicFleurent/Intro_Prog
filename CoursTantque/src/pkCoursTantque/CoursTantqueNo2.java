package pkCoursTantque;

import javax.swing.JOptionPane;

public class CoursTantqueNo2 {

	public static void main(String[] args) 
	{
		String	strMessage = " ";
		int ctr;
		int iNbr;
		
		ctr = 1;
		
		while (ctr <= 5)
		{
			iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre"));
			strMessage += "\nNombre no " + ctr + ": " + iNbr;
			ctr++;
		}
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		System.exit(0);
	}

}
