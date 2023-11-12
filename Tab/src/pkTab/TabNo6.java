package pkTab;

import java.util.Arrays;

import javax.swing.*;

/***********************************************************************

Le fichier:			TabNo6.java

Projet:				Laboratoire sur les tableaux

Objectifs:			Gérer les réservations d'un avion.

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-11-06

***********************************************************************/

public class TabNo6 
{

	public static void main(String[] args) 
	{
		final	int		NON_FUMEUR		= 5;																					//Nombre de places non-fumeur
		final	int		FUMEUR			= 5;																					//Nombre de places fumeur
		final	int		TOTAL			= 10;																					//Nombre de places total
		final	int		LIBRE			= 0;																					//Siège libre
		final	int		OCCUPE			= 1;																					//Siège occupé
		
				String	strMenu[]		= {	"1. Réserver un billet dans la section fumeur.",
											"2. Réserver un billet dans la section non-fumeur.",
											"3. Afficher toutes les positions.",
											"4. Recommencer les réservations.",
											"5. Quitter l'application."};														//Menu principal
				String	strChoixMenu	= "";																					//Choix dans le menu principal
				String	strAffichage	= "";																					//Variable pour afficher des messages
				
				char	cChoixMenu;																								//Conversion du choix du menu
				
				int		iTabRes[]		= new int[TOTAL];																		//Tableau des réservations
				int		iCtr			= 0;																					//Compteur pour les boucles
				int		iCtrM			= 0;																					//Compteur pour la boucle des messages
				int		iContinu;																								//Permets de valider si l'utilisateur veut continuer
				
				boolean	bPlein			= true;																					//Valide si l'avion est plein
				
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue, cette application permet de gérer les réservations de l'avion.");
		
		Arrays.fill(iTabRes, LIBRE);
		
		
		/***********************************************************************
		Boucle qui retourne au menu pricipal.
		***********************************************************************/		
		do {
			strChoixMenu	= (String) JOptionPane.showInputDialog(null,
																"Sélectionner votre choix parmi les options suivantes",
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
				Valide que l'avion est déjà plein
				***********************************************************************/
				if (bPlein)
				{
					/***********************************************************************
					Recherche dans les sièges fumeur et assigne.
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
					Valide que tous les sièges fumeur sont occupés.
					***********************************************************************/
					if (iCtr == FUMEUR)
					{
						iContinu = JOptionPane.showConfirmDialog(	null, 
																	"Les sièges de la section fumeur sont tous réservés.\nDésirez-vous réserver un billet dans la section non-fumeur?", 
																	"Suppression d'un élève", 
																	JOptionPane.YES_NO_OPTION);
						if (iContinu == 0)

							/***********************************************************************
							Recherche dans les sièges non-fumeur et assigne.
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
							JOptionPane.showMessageDialog(null, "Le départ du prochain vol est dans 4 heures.");
					}
					
					/***********************************************************************
					Recherche dans tous les sièges voir s'il reste des places.
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
				Valide que l'avion est déjà plein
				***********************************************************************/
				if (bPlein)
				{
					/***********************************************************************
					Recherche dans les sièges non-fumeur et assigne.
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
					Valide que tous les sièges non-fumeur sont occupés.
					***********************************************************************/
					if (iCtr == TOTAL)
					{
						iContinu = JOptionPane.showConfirmDialog(	null, 
																	"Les sièges de la section fumeur sont tous réservés.\nDésirez-vous réserver un billet dans la section non-fumeur?", 
																	"Suppression d'un élève", 
																	JOptionPane.YES_NO_OPTION);
						if (iContinu == 0)
							/***********************************************************************
							Recherche dans les sièges fumeur et assigne.
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
							JOptionPane.showMessageDialog(null, "Le départ du prochain vol est dans 4 heures.");
					}
					
					/***********************************************************************
					Recherche dans tous les sièges voir s'il reste des places.
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
				Créer le message selon que les sièges sont libres ou non.
				***********************************************************************/
				strAffichage = "Voici l'occupation des sièges";
				for (iCtrM = 1 ; iCtrM <= TOTAL ; iCtrM++)
				{
					if (iTabRes[iCtrM -1] == LIBRE)
						strAffichage += "\n" + iCtrM + ": Libre";
					else
						strAffichage += "\n" + iCtrM + ": Occupé";
				}
				JOptionPane.showMessageDialog(null, strAffichage);
				break;
				
			case '4':
				/***********************************************************************
				Réinitialise tout.
				***********************************************************************/
				Arrays.fill(iTabRes, LIBRE);
				bPlein = true;
				break;
			}
			
		} while (cChoixMenu != '5');
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);

	}

}
