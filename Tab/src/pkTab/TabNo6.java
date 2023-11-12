package pkTab;

import java.util.Arrays;

import javax.swing.*;

/***********************************************************************

Le fichier:			TabNo6.java

Projet:				Laboratoire sur les tableaux

Objectifs:			G�rer les r�servations d'un avion.

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2022-11-06

***********************************************************************/

public class TabNo6 
{

	public static void main(String[] args) 
	{
		final	int		NON_FUMEUR		= 5;																					//Nombre de places non-fumeur
		final	int		FUMEUR			= 5;																					//Nombre de places fumeur
		final	int		TOTAL			= 10;																					//Nombre de places total
		final	int		LIBRE			= 0;																					//Si�ge libre
		final	int		OCCUPE			= 1;																					//Si�ge occup�
		
				String	strMenu[]		= {	"1. R�server un billet dans la section fumeur.",
											"2. R�server un billet dans la section non-fumeur.",
											"3. Afficher toutes les positions.",
											"4. Recommencer les r�servations.",
											"5. Quitter l'application."};														//Menu principal
				String	strChoixMenu	= "";																					//Choix dans le menu principal
				String	strAffichage	= "";																					//Variable pour afficher des messages
				
				char	cChoixMenu;																								//Conversion du choix du menu
				
				int		iTabRes[]		= new int[TOTAL];																		//Tableau des r�servations
				int		iCtr			= 0;																					//Compteur pour les boucles
				int		iCtrM			= 0;																					//Compteur pour la boucle des messages
				int		iContinu;																								//Permets de valider si l'utilisateur veut continuer
				
				boolean	bPlein			= true;																					//Valide si l'avion est plein
				
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue, cette application permet de g�rer les r�servations de l'avion.");
		
		Arrays.fill(iTabRes, LIBRE);
		
		
		/***********************************************************************
		Boucle qui retourne au menu pricipal.
		***********************************************************************/		
		do {
			strChoixMenu	= (String) JOptionPane.showInputDialog(null,
																"S�lectionner votre choix parmi les options suivantes",
																"Menu principal",
																JOptionPane.QUESTION_MESSAGE,
																null,
																strMenu,
																strMenu[0]);
			cChoixMenu		= strChoixMenu.charAt(0);
			
			switch (cChoixMenu)
			{
			case '1':
				/***********************************************************************
				Valide que l'avion est d�j� plein
				***********************************************************************/
				if (bPlein)
				{
					/***********************************************************************
					Recherche dans les si�ges fumeur et assigne.
					***********************************************************************/
					for (iCtr = 0 ; iCtr < FUMEUR ; iCtr++)
					{
						if (iTabRes[iCtr] == LIBRE)
						{
							iTabRes[iCtr] = OCCUPE;
							break;
						}
						
					}

					/***********************************************************************
					Valide que tous les si�ges fumeur sont occup�s.
					***********************************************************************/
					if (iCtr == FUMEUR)
					{
						iContinu = JOptionPane.showConfirmDialog(	null, 
																	"Les si�ges de la section fumeur sont tous r�serv�s.\nD�sirez-vous r�server un billet dans la section non-fumeur?", 
																	"Suppression d'un �l�ve", 
																	JOptionPane.YES_NO_OPTION);
						if (iContinu == 0)

							/***********************************************************************
							Recherche dans les si�ges non-fumeur et assigne.
							***********************************************************************/
							for (iCtr = FUMEUR ; iCtr < TOTAL ; iCtr++)
							{
								if (iTabRes[iCtr] == LIBRE)
								{
									iTabRes[iCtr] = OCCUPE;
									break;
								}
								
							}
						else
							JOptionPane.showMessageDialog(null, "Le d�part du prochain vol est dans 4 heures.");
					}
					
					/***********************************************************************
					Recherche dans tous les si�ges voir s'il reste des places.
					***********************************************************************/
					for (iCtr = 0 ; iCtr < TOTAL ; iCtr++)
					{
						if (iTabRes[iCtr] == LIBRE)
							break;
					}
					
					if (iCtr == TOTAL)
						{
							bPlein	= false;
							JOptionPane.showMessageDialog(null, "L'avion est plein");
						}
				}
				else
					JOptionPane.showMessageDialog(null, "L'avion est plein");
				
				break;
				
			case '2':
				/***********************************************************************
				Valide que l'avion est d�j� plein
				***********************************************************************/
				if (bPlein)
				{
					/***********************************************************************
					Recherche dans les si�ges non-fumeur et assigne.
					***********************************************************************/
					for (iCtr = FUMEUR ; iCtr < TOTAL ; iCtr++)
					{
						if (iTabRes[iCtr] == LIBRE)
						{
							iTabRes[iCtr] = OCCUPE;
							break;
						}
						
					}

					/***********************************************************************
					Valide que tous les si�ges non-fumeur sont occup�s.
					***********************************************************************/
					if (iCtr == TOTAL)
					{
						iContinu = JOptionPane.showConfirmDialog(	null, 
																	"Les si�ges de la section fumeur sont tous r�serv�s.\nD�sirez-vous r�server un billet dans la section non-fumeur?", 
																	"Suppression d'un �l�ve", 
																	JOptionPane.YES_NO_OPTION);
						if (iContinu == 0)
							/***********************************************************************
							Recherche dans les si�ges fumeur et assigne.
							***********************************************************************/
							for (iCtr = 0 ; iCtr < FUMEUR ; iCtr++)
							{
								if (iTabRes[iCtr] == LIBRE)
								{
									iTabRes[iCtr] = OCCUPE;
									iCtr += NON_FUMEUR;
									break;
								}
								
							}
						else
							JOptionPane.showMessageDialog(null, "Le d�part du prochain vol est dans 4 heures.");
					}
					
					/***********************************************************************
					Recherche dans tous les si�ges voir s'il reste des places.
					***********************************************************************/
					
					for (iCtr = 0 ; iCtr < TOTAL ; iCtr++)
					{
						if (iTabRes[iCtr] == LIBRE)
							break;
					}
					
					if (iCtr == TOTAL)
						{
							bPlein	= false;
							JOptionPane.showMessageDialog(null, "L'avion est plein");
						}
				}
				else
					JOptionPane.showMessageDialog(null, "L'avion est plein");
				break;
			
			case '3':
				/***********************************************************************
				Cr�er le message selon que les si�ges sont libres ou non.
				***********************************************************************/
				strAffichage = "Voici l'occupation des si�ges";
				for (iCtrM = 1 ; iCtrM <= TOTAL ; iCtrM++)
				{
					if (iTabRes[iCtrM -1] == LIBRE)
						strAffichage += "\n" + iCtrM + ": Libre";
					else
						strAffichage += "\n" + iCtrM + ": Occup�";
				}
				JOptionPane.showMessageDialog(null, strAffichage);
				break;
				
			case '4':
				/***********************************************************************
				R�initialise tout.
				***********************************************************************/
				Arrays.fill(iTabRes, LIBRE);
				bPlein = true;
				break;
			}
			
		} while (cChoixMenu != '5');
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va termin�, bonne journ�e.");
		
		System.exit(0);

	}

}
