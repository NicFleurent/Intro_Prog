package pkAddition;

import javax.swing.JOptionPane;

public class Addition 
{

	public static void main(String[] args) 
	{

		String	strNbr1;	//Premier nombre
		String	strNbr2;	//Deuxième nombre
		int		iNbr1;		//Premier nombre à additioner
		int		iNbr2;		//Deuxième nombre à additionner
		int		iSomme;		//Résultat de la somme
		
		strNbr1 = JOptionPane.showInputDialog("Entrez un nombre");
		strNbr2 = JOptionPane.showInputDialog("Entrez un nombre");
		
		iNbr1 = Integer.parseInt(strNbr1);
		iNbr2 = Integer.parseInt(strNbr2);
		
		iSomme = iNbr1 + iNbr2;
		
		JOptionPane.showMessageDialog(null, "La somme est de: " + iSomme, "Resultats", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}

}
