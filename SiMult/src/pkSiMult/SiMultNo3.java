package pkSiMult;

import javax.swing.*;

public class SiMultNo3 
{

	public static void main(String[] args) 
	{
		final	int		I_NBR_A = 10;		//Nombre de volume que les adultes peuvent emprunter
		final	int		I_NBR_E = 15;		//Nombre de volume que les enfants peuvent emprunter
		final	int		I_NBR_I = 5;     	//Nombre de volume que les ain�s peuvent emprunter
		final	int		I_DUR_A = 20;		//Dur�e d'emprunt des adultes
		final	int		I_DUR_E = 45;		//Dur�e d'emprunt des enfants
		final	int		I_DUR_I = 30;		//Dur�e d'emprunt des ain�s
		
				String	strNum;				//Num�ro de l'usag�
				String	strCat;				//Cat�gorie de l'usag�
				String	strPossession;		//Livre en possesion de l'usag�
				String	strEmprunt;			//Livre que l'usag� veut emprunter
				String	strMessage = " ";	//Variable pour le message de fin
				
				double	dPossession;		//Conversion livre en possession de l'usag�
				double	dEmprunt;			//Conversion livre que l'usager veut emprunter
				
				char	cCat;				//Conversion de la cat�gorie
		
		strNum 			= JOptionPane.showInputDialog("Entrez votre num�ro.");
		strCat 			= JOptionPane.showInputDialog("Entrez la cat�gorie de l'abonn� (A = adulte, I = ain�, E = enfant.");
		strPossession 	= JOptionPane.showInputDialog("Entrez le nombre de livre que l'abonn� a d�j� en sa possession.");
		strEmprunt 		= JOptionPane.showInputDialog("Entrez le nombre de livre que l'abonn� d�sire emprunter.");
		cCat			= strCat.charAt(0);
		dPossession		= Double.parseDouble(strPossession);
		dEmprunt		= Double.parseDouble(strEmprunt);
		
		switch (cCat)
			{
			case 'A':	case 'a':	if ((dPossession + dEmprunt) <= I_NBR_A)
										{
											strMessage += "L'abonn� n� " + strNum + " peut emprunter les volumes pour " + I_DUR_A + " jours";
											JOptionPane.showMessageDialog(null, strMessage);
										} 
									else
										{
											strMessage += "L'abonn� n� " + strNum + " ne peut pas emprunter de volumes pour le moment.";
											JOptionPane.showMessageDialog(null, strMessage);
										}
			break;						
			case 'I':	case 'i':	if ((dPossession + dEmprunt) <= I_NBR_I)
										{
											strMessage += "L'abonn� n� " + strNum + " peut emprunter les volumes pour " + I_DUR_I + " jours";
											JOptionPane.showMessageDialog(null, strMessage);
										} 
									else
										{
											strMessage += "L'abonn� n� " + strNum + " ne peut pas emprunter de volumes pour le moment.";
											JOptionPane.showMessageDialog(null, strMessage);
										}
			break;
			case 'E':	case 'e':	if ((dPossession + dEmprunt) <= I_NBR_E)
										{
											strMessage += "L'abonn� n� " + strNum + " peut emprunter les volumes pour " + I_DUR_E + " jours";
											JOptionPane.showMessageDialog(null, strMessage);
										} 
									else
										{
											strMessage += "L'abonn� n� " + strNum + " ne peut pas emprunter de volumes pour le moment.";
											JOptionPane.showMessageDialog(null, strMessage);
										}
			break;
			default:				JOptionPane.showMessageDialog(null, "Cat�gorie non valide, s.v.p. entrez A pour adulte, I pour ain� ou E pour enfant.");
			}

	}

}
