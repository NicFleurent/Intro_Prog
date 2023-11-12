package pkSi;

import javax.swing.JOptionPane;

public class SiNo1 
{

	public static void main(String[] args) 
	{
		final	int		HAND_HAB 	= 81;			//Handicap habituel
		final	int		HAND_PAR 	= 72;			//Handicap parcours
		final	int		NBR_PARTIES = 5;			//Nombre de partie
		
				String	strPointPar1;				//Import des points de la 1ere parties
				String	strPointPar2;				//Import des points de la 2e parties
				String	strPointPar3;				//Import des points de la 3e parties
				String	strPointPar4;				//Import des points de la 4e parties
				String	strPointPar5;				//Import des points de la 5e parties
				String	strResultat = " ";			//Sert à l'affichage
				
				int		iPointPar1;					//Conversion 1ere partie
				int		iPointPar2;					//Conversion 2e partie
				int		iPointPar3;					//Conversion 3e partie
				int		iPointPar4;					//Conversion 4e partie
				int		iPointPar5;					//Conversion 5e partie
				int		iHand;						//Handicap de l'été
				int		iHandHab;					//Handicap habituel
				
		strPointPar1	= JOptionPane.showInputDialog("Entrez le pointage de la première partie.");
		strPointPar2	= JOptionPane.showInputDialog("Entrez le pointage de la deuxième partie.");
		strPointPar3	= JOptionPane.showInputDialog("Entrez le pointage de la troisième partie.");
		strPointPar4	= JOptionPane.showInputDialog("Entrez le pointage de la quatrième partie.");
		strPointPar5	= JOptionPane.showInputDialog("Entrez le pointage de la cinquième partie.");
		iPointPar1		= Integer.parseInt(strPointPar1);
		iPointPar2		= Integer.parseInt(strPointPar2);
		iPointPar3		= Integer.parseInt(strPointPar3);
		iPointPar4		= Integer.parseInt(strPointPar4);
		iPointPar5		= Integer.parseInt(strPointPar5);
		
		iHand = ((iPointPar1 + iPointPar2 + iPointPar3 + iPointPar4 + iPointPar5) / NBR_PARTIES ) - HAND_PAR;
		iHandHab = HAND_HAB - HAND_PAR;
		
		if (iHand < iHandHab)
			{
				strResultat += "\nVotre handicap est de " + iHand + " coups";
				strResultat += "\nVous vous êtes améliorés!";
				
				JOptionPane.showMessageDialog(null, strResultat);
			}
		else if (iHand == iHandHab)
			{
				strResultat += "\nVotre handicap est de " + iHand + " coups";
				strResultat += "\nVous vous êtes maintenu";
				
				JOptionPane.showMessageDialog(null, strResultat);
			}
		else if (iHand > iHandHab)
			{
				strResultat += "\nVotre handicap est de " + iHand + " coups";
				strResultat += "\nVous avez régressé";
				
				JOptionPane.showMessageDialog(null, strResultat);
			}
		
		System.exit(0);

	}

}
