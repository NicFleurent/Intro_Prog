package pkPour;

import javax.swing.JOptionPane;

public class PourNo5 
{

	public static void main(String[] args) 
	{
		final	int	I_MULT_MAX 	= 5;					//Constante pour terminer la boucle
		
				int	iNbr1;								//1er nombre
				int	iNbr2;								//2e nombre
				int	iMulti		= 0;					//R�sultat de la multiplication
		
		for (iNbr1 = 1 ; iNbr1 <= I_MULT_MAX ; iNbr1++)
			{
				for (iNbr2 = 1 ; iNbr2 <= I_MULT_MAX ; iNbr2++)
					{
						iMulti = iNbr1 * iNbr2;
						
						JOptionPane.showMessageDialog(null, iNbr1 + " X " + iNbr2 + " = " + iMulti);
					}
			}
				
		System.exit(0);

	}

}
