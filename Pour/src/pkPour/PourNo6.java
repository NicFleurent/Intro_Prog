package pkPour;

import javax.swing.JOptionPane;

public class PourNo6 
{

	public static void main(String[] args) 
	{
		final	int	I_MULT_MAX 	= 9;					//Constante pour terminer la boucle
		
				int	iNbr1;								//1er nombre
				int	iNbr2;								//2e nombre
				int	iMulti		= 0;					//Résultat de la multiplication

		iNbr1 = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre dont vous voulez la table de multiplication."));
				
		for (iNbr2 = 1 ; iNbr2 <= I_MULT_MAX ; iNbr2++)
			{
				iMulti = iNbr1 * iNbr2;
				
				JOptionPane.showMessageDialog(null, iNbr1 + " X " + iNbr2 + " = " + iMulti);
			}
		
		System.exit(0);


	}

}
