package pkPour;

import javax.swing.JOptionPane;

public class PourNo1 
{

	public static void main(String[] args) 
	{
		final	int	I_PAL_1_DEP		= 0;				//Constante de la fin de la premiere boucle
		final	int	I_PAL_1_FIN		= 20;				//Constante de la fin de la premiere boucle
		final	int	I_PAL_2_DEP		= 21;				//Constante de la fin de la premiere boucle
		final	int	I_PAL_2_FIN		= 50;				//Constante de la fin de la premiere boucle
		final	int	I_PAL_3_DEP		= 51;				//Constante de la fin de la premiere boucle
		final	int	I_PAL_3_FIN		= 100;				//Constante de la fin de la premiere boucle
		final	int	I_CONST_PAIRE	= 2;				//Constante pour déterminé si c'est pair ou impair
		
				int	iNbr;
				int	iSomme = 0;
		
		for (iNbr = I_PAL_1_DEP ; iNbr <= I_PAL_1_FIN ; iNbr++)
			iSomme += iNbr;
		
		JOptionPane.showMessageDialog(null, "La somme des nombre entier de 0 à 20 est " + iSomme);
		
		for (iNbr = I_PAL_2_DEP, iSomme = 0 ; iNbr <= I_PAL_2_FIN ; iNbr++)
			if (iNbr % I_CONST_PAIRE == 0)
				iSomme += iNbr;
		
		JOptionPane.showMessageDialog(null, "La somme des nombre entier de 21 à 50 est " + iSomme);
		
		for (iNbr = I_PAL_3_DEP, iSomme = 0 ; iNbr <= I_PAL_3_FIN ; iNbr++)
			if (iNbr % I_CONST_PAIRE != 0)
				iSomme += iNbr;
		
		JOptionPane.showMessageDialog(null, "La somme des nombre entier de 51 à 100 est " + iSomme);
		
		System.exit(0);
	}

}
