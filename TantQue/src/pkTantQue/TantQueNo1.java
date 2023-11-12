package pkTantQue;

import javax.swing.*;

public class TantQueNo1 
{

	public static void main(String[] args) 
	{
		String	strOperation 	= " ";
		
		int		iMenu 			= 0;
		String	strMenu[] 		= {"+", "-", "*", "/", "="};
		
		int		iNbr 			= 0;
		int		iRes 			= 0;
		int		iContinu 		= 0;
		
		
		while (iContinu == 0)
		{
			strOperation 	= " ";
			iNbr 			= Integer.parseInt(JOptionPane.showInputDialog(null, strOperation, "Entrez un nombre entier."));
			strOperation 	+= iNbr;
			iRes			= iNbr;
			
			do {
			
			iMenu = JOptionPane.showOptionDialog(
					null, 
					"Sélectionnez une opération.", 
					"Calculatrice", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null, 
					strMenu, 
					strMenu[0]);
			
			switch (iMenu)
			{
			case 0: 
					strOperation 	+= " + ";
					iNbr 			= Integer.parseInt(JOptionPane.showInputDialog(null, strOperation, "Entrez un nombre entier."));
					strOperation 	+= iNbr;
					iRes			+= iNbr;
					break;
			case 1: 
					strOperation 	+= " - ";
					iNbr 			= Integer.parseInt(JOptionPane.showInputDialog(null, strOperation, "Entrez un nombre entier."));
					strOperation 	+= iNbr;
					iRes			-= iNbr;
					break;
			case 2: 
					strOperation 	+= " * ";
					iNbr 			= Integer.parseInt(JOptionPane.showInputDialog(null, strOperation, "Entrez un nombre entier."));
					strOperation 	+= iNbr;
					iRes			*= iNbr;
					break;
			case 3: 
					strOperation 	+= " / ";
					iNbr 			= Integer.parseInt(JOptionPane.showInputDialog(null, strOperation, "Entrez un nombre entier."));
					while (iNbr == 0)
						iNbr 			= Integer.parseInt(JOptionPane.showInputDialog(null, "On ne peut pas diviser par 0, s.v.p. utilisez un autre nombre.\n" +strOperation, "Entrez un nombre entier."));
					strOperation 	+= iNbr;
					iRes			/= iNbr;
					break;
			case 4: 
					strOperation	+= " = " + iRes;
			}
			
			} while (iMenu != 4);
			
			JOptionPane.showMessageDialog(null, strOperation);
			
			iContinu = JOptionPane.showConfirmDialog(null, "Désirez-vous faire une autre opération?", "Calculatrice", JOptionPane.YES_NO_OPTION);
			
		}

	}

}
