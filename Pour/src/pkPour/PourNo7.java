package pkPour;

import javax.swing.*;

public class PourNo7 
{

	public static void main(String[] args) 
	{
		final	int	I_NBR_MIN	= 1;			//Nombre minimal
		final	int	I_NBR_MAX	= 500;			//Nombre maximal
		final	int	I_MULTI		= 10;			//Nombre multiple de 10
		final	int	I_CTR_MAX	= 5;
		
				String	strMessage	= " ";		//Message de fin
		
				int iNbr;						//Nombre demander à l'utilisateur
				int	iCar;						//Nombre au carré
				int	iCub;						//Nombre au cube
				int	iCtrBon = 0;				//Compte le nombre de réponse valide
		
		for ( ; iCtrBon < I_CTR_MAX ; )
			{
				iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre entier compris entre 1 et 500 qui n'est pas un multiple de 10."));
				
				if ((iNbr >= I_NBR_MIN) && (iNbr <= I_NBR_MAX) && (iNbr % I_MULTI != 0))
							{
								iCar 		= iNbr * iNbr;
								iCub 		= iCar * iNbr;

								strMessage	= " ";
								strMessage	+= "\nCarré: " + iCar;
								strMessage	+= "\nCube: " + iCub;
								
								JOptionPane.showMessageDialog(null, strMessage);
								
								iCtrBon++;
							}
						
			}
		
		System.exit(0);
		
	}

}
