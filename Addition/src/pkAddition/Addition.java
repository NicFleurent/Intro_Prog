package pkAddition;

import javax.swing.JOptionPane;

public class Addition 
{

	public static void main(String[] args) 
	{

		String	strNbr1;	//Premier nombre
		String	strNbr2;	//Deuxi�me nombre
		int		iNbr1;		//Premier nombre � additioner
		int		iNbr2;		//Deuxi�me nombre � additionner
		int		iSomme;		//R�sultat de la somme
		
		strNbr1 = JOptionPane.showInputDialog("Entrez un nombre");
		strNbr2 = JOptionPane.showInputDialog("Entrez un nombre");
		
		iNbr1 = Integer.parseInt(strNbr1);
		iNbr2 = Integer.parseInt(strNbr2);
		
		iSomme = iNbr1 + iNbr2;
		
		JOptionPane.showMessageDialog(null, "La somme est de: " + iSomme, "Resultats", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}

}
