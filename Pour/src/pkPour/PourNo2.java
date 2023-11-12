package pkPour;

import javax.swing.JOptionPane;

public class PourNo2 
{

	public static void main(String[] args) 
	{
		final	int	I_NBR_FINAL	= 100;				//Constante pour terminer la boucle
		final	int	I_NBR_RESTE	= 3;				//Constante pour calculer le reste
		
				int iNbr 		= 0;
				int iSomme 		= 0;
		
		for( ; iNbr <= I_NBR_FINAL ; iNbr++)
			if (iNbr % I_NBR_RESTE == 0)
				iSomme += iNbr;
		
		JOptionPane.showMessageDialog(null, "La somme des nombres entier multiple de 3 plus petit que 100 est " + iSomme);
		
		System.exit(0);

	}

}
