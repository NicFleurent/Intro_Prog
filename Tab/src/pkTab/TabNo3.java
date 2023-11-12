package pkTab;

import java.text.*;
import java.util.Arrays;
import javax.swing.*;

/***********************************************************************

Le fichier:			TabNo3.java

Projet:				Laboratoire sur les tableaux

Objectifs:			Permets la compilation des votes des élections municipales.

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-10-30

***********************************************************************/

public class TabNo3 
{

	public static void main(String[] args) 
	{
		final	int		NBR_BUREAU			= 5;										//Nombre de bureaux de scrutin.
		final	int		NBR_CANDIDAT		= 6;										//Nombre de candidats.
		final	int		VIDE				= 0;										//Constante pour remettre les données à 0.
				
				String	strTabCandidat[]	= {	"Monique Lagacé",
												"Myriam Laposte",
												"Julien Lafrenière",
												"Alex Beaubien",
												"Jules Laliberté",
												"Diane Montplaisir"};					//Tableau des candidats.
				
				String	strMenu[]			= {	"Compilation des votes",
												"Gagnant de l'élection",
												"Pourcentage des votes",
												"Quitter"};								//Tableau du menu.
				String	strChoixMenu		= "";										//Menu
				String	strCompil			= "";										//Variable pour afficher la compilation.
				String	strPourcent			= "";										//Variable pour afficher le pourcentage.
				
				char	cChoixMenu;
				
				int		iVote				= 0;										//Nombre de votes.
				int		iCtr1;															//Compteur de boucle.
				int		iCtr2;															//Compteur de boucle.
				int		iGagnant			= 0;										//Variable pour isoler le gagnant.

				double	dTabVote[]			= new double[NBR_CANDIDAT];					//Tableau cumulatif des votes.
				double	dTotalVote			= 0;										//Total du nombre de votes.
				double	dMaxVote			= 0;										//Variable pour trouver le candidat avec le plus de votes.
				double	dPourcentVote		= 0;										//Pourcentage des votes.
				
		NumberFormat	pourcent			= NumberFormat.getPercentInstance();
		DecimalFormat	zero				= new DecimalFormat("0");
		
		JOptionPane.showMessageDialog(null, "Bienvenue, cette application permet de comptabiliser les votes.");
				
		/***********************************************************************
		S'assure que toutes les données du tableau sont à zéro.
		***********************************************************************/
		Arrays.fill(dTabVote, VIDE);
		
		JOptionPane.showMessageDialog(null, "Tout d'abord, veuillez entrer le nombre de votes pour chaque candidat dans chaque bureau de vote.");
		
		/***********************************************************************
		Cette double boucle permet la saisie des votes de tous les bureaux pour tous les candidats.
		***********************************************************************/
		for (iCtr1 = 1 ; iCtr1 <= NBR_BUREAU ; iCtr1++)
		{
			for (iCtr2 = 0 ; iCtr2 < NBR_CANDIDAT ; iCtr2++)
			{
				iVote			= Integer.parseInt(JOptionPane.showInputDialog("Concernant le bureau de scrutin numéro " + iCtr1 + ", le nombre de votes pour " + strTabCandidat[iCtr2] + " est:"));
				
				dTabVote[iCtr2] += iVote;
				
				dTotalVote		+= iVote;
			}
		}
		
		do {
			/***********************************************************************
			Menu déroulant
			***********************************************************************/
			strChoixMenu = (String) JOptionPane.showInputDialog(null,
																"Sélectionnez votre choix parmi les options suivantes:",
																"Menu principal",
																JOptionPane.QUESTION_MESSAGE,
																null,
																strMenu,
																strMenu[0]);
			
			cChoixMenu	= strChoixMenu.charAt(0);
			
			switch (cChoixMenu)
			{
			case 'C':
				strCompil = "Voici la compilation des votes par candidats:";
				
				/***********************************************************************
				Créer le message de la compilation.
				***********************************************************************/
				for (iCtr1 = 0 ; iCtr1 < NBR_CANDIDAT ; iCtr1++)
					strCompil += "\n" + strTabCandidat[iCtr1] + ": " + zero.format(dTabVote[iCtr1]) + " votes";
				
				JOptionPane.showMessageDialog(null, strCompil);
				break;
				
			case 'G':
				/***********************************************************************
				Extrais le gagnant du tableau
				***********************************************************************/
				for (iCtr1 = 0 ; iCtr1 < NBR_CANDIDAT ; iCtr1++)
					if (dTabVote[iCtr1] > dMaxVote)
					{
						dMaxVote 	= dTabVote[iCtr1];
						iGagnant	= iCtr1;
					}
				
				JOptionPane.showMessageDialog(null, "Le gagnant des élections est " + strTabCandidat[iGagnant] + " avec " + zero.format(dTabVote[iGagnant]) + " votes.");
				break;
				
			case 'P':
				strPourcent = "Voici le pourcentage des votes par candidats:";
				
				/***********************************************************************
				Calcul et créer le message des pourcentages.
				***********************************************************************/
				for (iCtr1 = 0 ; iCtr1 < NBR_CANDIDAT ; iCtr1++)
					{
						dPourcentVote	= dTabVote[iCtr1] / dTotalVote;
						strPourcent 	+= "\n" + strTabCandidat[iCtr1] + ": " + pourcent.format(dPourcentVote);
					}
				
				JOptionPane.showMessageDialog(null, strPourcent);
				break;
			}
			
		} while (cChoixMenu != 'Q');
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);
		
	}

}
