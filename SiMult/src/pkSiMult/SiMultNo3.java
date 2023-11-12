package pkSiMult;

import javax.swing.*;

public class SiMultNo3 
{

	public static void main(String[] args) 
	{
		final	int		I_NBR_A = 10;		//Nombre de volume que les adultes peuvent emprunter
		final	int		I_NBR_E = 15;		//Nombre de volume que les enfants peuvent emprunter
		final	int		I_NBR_I = 5;     	//Nombre de volume que les ainés peuvent emprunter
		final	int		I_DUR_A = 20;		//Durée d'emprunt des adultes
		final	int		I_DUR_E = 45;		//Durée d'emprunt des enfants
		final	int		I_DUR_I = 30;		//Durée d'emprunt des ainés
		
				String	strNum;				//Numéro de l'usagé
				String	strCat;				//Catégorie de l'usagé
				String	strPossession;		//Livre en possesion de l'usagé
				String	strEmprunt;			//Livre que l'usagé veut emprunter
				String	strMessage = " ";	//Variable pour le message de fin
				
				double	dPossession;		//Conversion livre en possession de l'usagé
				double	dEmprunt;			//Conversion livre que l'usager veut emprunter
				
				char	cCat;				//Conversion de la catégorie
		
		strNum 			= JOptionPane.showInputDialog("Entrez votre numéro.");
		strCat 			= JOptionPane.showInputDialog("Entrez la catégorie de l'abonné (A = adulte, I = ainé, E = enfant.");
		strPossession 	= JOptionPane.showInputDialog("Entrez le nombre de livre que l'abonné a déjà en sa possession.");
		strEmprunt 		= JOptionPane.showInputDialog("Entrez le nombre de livre que l'abonné désire emprunter.");
		cCat			= strCat.charAt(0);
		dPossession		= Double.parseDouble(strPossession);
		dEmprunt		= Double.parseDouble(strEmprunt);
		
		switch (cCat)
			{
			case 'A':	case 'a':	if ((dPossession + dEmprunt) <= I_NBR_A)
										{
											strMessage += "L'abonné n° " + strNum + " peut emprunter les volumes pour " + I_DUR_A + " jours";
											JOptionPane.showMessageDialog(null, strMessage);
										} 
									else
										{
											strMessage += "L'abonné n° " + strNum + " ne peut pas emprunter de volumes pour le moment.";
											JOptionPane.showMessageDialog(null, strMessage);
										}
			break;						
			case 'I':	case 'i':	if ((dPossession + dEmprunt) <= I_NBR_I)
										{
											strMessage += "L'abonné n° " + strNum + " peut emprunter les volumes pour " + I_DUR_I + " jours";
											JOptionPane.showMessageDialog(null, strMessage);
										} 
									else
										{
											strMessage += "L'abonné n° " + strNum + " ne peut pas emprunter de volumes pour le moment.";
											JOptionPane.showMessageDialog(null, strMessage);
										}
			break;
			case 'E':	case 'e':	if ((dPossession + dEmprunt) <= I_NBR_E)
										{
											strMessage += "L'abonné n° " + strNum + " peut emprunter les volumes pour " + I_DUR_E + " jours";
											JOptionPane.showMessageDialog(null, strMessage);
										} 
									else
										{
											strMessage += "L'abonné n° " + strNum + " ne peut pas emprunter de volumes pour le moment.";
											JOptionPane.showMessageDialog(null, strMessage);
										}
			break;
			default:				JOptionPane.showMessageDialog(null, "Catégorie non valide, s.v.p. entrez A pour adulte, I pour ainé ou E pour enfant.");
			}

	}

}
