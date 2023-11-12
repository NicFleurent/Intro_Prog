package pkPour;

import javax.swing.*;

public class PourNo9 
{

	public static void main(String[] args) 
	{
		final	int		I_MAX_AVERT		= 3;				//Nombre d'avertisemment maximal
		final	int		I_MAX_JEU		= 5;				//Nombre d'avertisemment maximal
		final	int		I_MAX_CAL		= 3;				//Nombre de calcul total
		final	int		I_MAX_RAND		= 9;
		
				String	strMenu 		= " ";				//Menu pour choisir addition ou soustraction
				String	strChoix;							//Choix de l'utilisateur
				String	strRep;								//Demande de la réponse à l'utilisateur
				
				char	cChoix;								//Conversion du choix de l'utilisateur
				
				int		ctrMauv 		= 1; 				//Compteur de mauvaise réponse à la grande boucle
				int		ctrBon	 		= 1; 				//Compteur de bonne réponse à la grande boucle
				int 	iNbr1;								//Nombre pour les calcul
				int 	iNbr2;								//Nombre pour les calcul
				int		iRes;								//Nombre pour le résultat du calcul
				int		iRep;								//La réponse à l'équation de l'utilisateur
				int		iStat 			= 0;				//Variable pour comptabilisé la statistique
		
		strMenu += "\nVeuillez choisir une des 2 options suivantes:";
		strMenu += "\nA - Addition";
		strMenu += "\nS - Soustraction";
		
		for ( ; ctrBon <= I_MAX_JEU ; )
			{
				strChoix 	= JOptionPane.showInputDialog(strMenu);
				cChoix		= strChoix.charAt(0);
				iStat		= 0;
			
				if (cChoix == 'a' || cChoix == 'A')
					{
						for (int ctrA = 1 ; ctrA <= I_MAX_CAL ; ctrA++)
							{
								iNbr1 	= 0 + (int) (Math.random() * I_MAX_RAND);
								iNbr2 	= 0 + (int) (Math.random() * I_MAX_RAND);
								iRes	= iNbr1 + iNbr2;
								
								strRep 	= JOptionPane.showInputDialog(iNbr1 + " + " + iNbr2 + " =");
								iRep	= Integer.parseInt(strRep);
								
								if (iRep == iRes)
									{
										JOptionPane.showMessageDialog(null, "Félicitations, vous avez la bonne réponse à l'expression arithmétique.");
										iStat++;
									}
								else
									JOptionPane.showMessageDialog(null, "Désolé, vous n'avez pas la bonne réponse.");
							}
						JOptionPane.showMessageDialog(null, "Vous avez " + iStat + " bonnes réponses ainsi que " + (I_MAX_CAL - iStat) + " mauvaises réponses parmis les " + I_MAX_CAL + " expressions générées.");
						ctrBon++;
					}
				else if (cChoix == 's' || cChoix == 'S')
					{
						for (int ctrS = 1 ; ctrS <= I_MAX_CAL ; ctrS++)
							{
								iNbr1 	= 0 + (int) (Math.random() * I_MAX_RAND);
								iNbr2 	= 0 + (int) (Math.random() * I_MAX_RAND);
								iRes	= iNbr1 - iNbr2;
								
								strRep 	= JOptionPane.showInputDialog(iNbr1 + " - " + iNbr2 + " =");
								iRep	= Integer.parseInt(strRep);
								
								if (iRep == iRes)
									{
										JOptionPane.showMessageDialog(null, "Félicitations, vous avez la bonne réponse à l'expression arithmétique.");
										iStat++;
									}
								else
									JOptionPane.showMessageDialog(null, "Désolé, vous n'avez pas la bonne réponse.");
									
							}
						JOptionPane.showMessageDialog(null, "Vous avez " + iStat + " bonnes réponses ainsi que " + (I_MAX_CAL - iStat) + " mauvaises réponses parmis les " + I_MAX_CAL + " expressions générées.");
						ctrBon++;
					}
				else
					if (ctrMauv <= I_MAX_AVERT)
						{
							JOptionPane.showMessageDialog(null, "Entrez non-valide, s.v.p. indiquez A ou S.");
							ctrMauv++;
						}
					else
						{
							JOptionPane.showMessageDialog(null, "Dû aux multiples erreurs, vous ne pouvez plus utiliser le logiciel pour les 24 prochaines heures. \nLe programme va se terminer.");
							break;
						}	
				
			}
		
		
		
		System.exit(0);

	}

}
