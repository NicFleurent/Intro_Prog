package pkCoursTantque;

import javax.swing.JOptionPane;

public class CoursTantqueNo3 
{

	public static void main(String[] args) 
	{
		int iNbr, iSomme = 0, iCtr = 0, iMoy;
		
		iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre entier (999 pour terminé)"));
		
		while (iNbr != 999)
		{
			iSomme += iNbr;	
			iCtr++;
			iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre entier (999 pour terminé)"));
		}
		
		iMoy = iSomme / iCtr;
		JOptionPane.showMessageDialog(null, "La somme est " + iMoy);

	}

}
