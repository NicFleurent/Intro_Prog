package pkSiMult;

import javax.swing.JOptionPane;

public class SiMultNo1 
{

	public static void main(String[] args) 
	{
		final 	int 	I_ANNEE_4 		= 4;		//Constante pour le calcul (Diviser par 4)
		final 	int 	I_ANNEE_100 	= 100;		//Constante pour le calcul (Diviser par 100)
		final 	int 	I_ANNEE_400 	= 400;		//Constante pour le calcul (Diviser par 400)
		
				String 	strMois;					//Saisie du mois
				String 	strAnnee;					//Saisie de l'année
				
				int		iMois;						//Conversion du mois en caractère
				int		iAnnee;						//Conversion de l'année
				int		iNbrJ = 0;						//Nombre de jour du mois
		
		strMois 	= JOptionPane.showInputDialog("Entrez le mois (Chiffre de 1 à 12).");
		strAnnee 	= JOptionPane.showInputDialog("Entrez l'année.");
		iMois 		= Integer.parseInt(strMois);
		iAnnee 		= Integer.parseInt(strAnnee);
		
		switch (iMois)
			{
			case 1:	case 3:	case 5:	case 7:	case 8: case 10:	case 12:	iNbrJ = 31;				break;
			
			case 2:	if (iAnnee % I_ANNEE_4 == 0)
						if (iAnnee % I_ANNEE_100 == 0)
							if (iAnnee % I_ANNEE_400 == 0)					iNbrJ = 29;
							else											iNbrJ = 28;
						else												iNbrJ = 29;
					else													iNbrJ = 28;				break;
			
			case 4:	case 6:	case 9:	case 11:								iNbrJ = 30;				break;
			default:	JOptionPane.showMessageDialog(null, "Option non valide, entrez un chiffre entre 1 et 12");
			}
		
		if ((iMois > 0) && (iMois < 13))
			switch (iMois)
				{
				case 1: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en janvier " + iAnnee);		break;
				case 2: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en février " + iAnnee);		break;
				case 3: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en mars " + iAnnee);		break;
				case 4: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en avril " + iAnnee);		break;
				case 5: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en mai " + iAnnee);			break;
				case 6: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en juin " + iAnnee);		break;
				case 7: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en juillet " + iAnnee);		break;
				case 8: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en août " + iAnnee);		break;
				case 9: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en septembre " + iAnnee);	break;
				case 10: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en octobre " + iAnnee);		break;
				case 11: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en novembre " + iAnnee);	break;
				default: 	JOptionPane.showMessageDialog(null, "Il y a " + iNbrJ + " jours en décembre " + iAnnee);	break;
				}
		
		
		System.exit(0);

	}

}
