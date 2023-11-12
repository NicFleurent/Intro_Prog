package pkTab;

import javax.swing.*;
import java.text.*;
import java.util.Arrays;

/***********************************************************************

Le fichier:			TabNo2.java

Projet:				Laboratoire sur les tableaux

Objectifs:			Permets la saie des notes et le calcul des moyennes

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-10-25

***********************************************************************/

public class TabNo2 
{

	public static void main(String[] args) 
	{
		final	int				MAX_NOTE		= 20;																//Constante du maximum de note à mettre dans le tableau.
		final	int				PONDERATION		= 72;																//Pondération de l'évaluation.
		final	int				POURCENT		= 100;																//Constante pour calculer le pourcentage.
		final	int				MAX_FREQ		= 10;																//Nombre de fréquence.
		final	int				VIDE			= 0;
				
				int				iTabNote[] 		= new int [MAX_FREQ];												//Tableau des 20 notes.
				int				iIndice			= 0;																//Indice pour naviguer dans le tableau.
				int				iCtr;																				//Compteur pour les boucles.
				
				double			dNote			= 0;																//Note à mettre dans le tableau.
				double			dMoy			= 0;																//Moyenne des notes.
				double			dEtend			= 0;																//Étendu des notes.
				double			dNoteMax		= 0;																//Note la plus haute.
				double			dNoteMin		= Double.MAX_VALUE;													//Note la plus basse.
				
				String			strMenu[]		= {	"Saisir les notes.",
													"Moyenne et étendue des notes sur 100.",
													"Tableau des fréquences des notes sur 100.",
													"Recommencer",
													"Quitter"};														//Option du menu à liste déroulante.
				String			strChoixMenu;																		//Variable pour afficher le menu.
				String			strMoyEtend		= "";																//Variable pour les moyennes et étendues.
				String			strTabFreq		= "";																//Variable pour afficher le tableau des fréquences.
					
				char			cChoixMenu		= ' ';																//Conversion du choix dans le menu.
				
				DecimalFormat	zeroChiffre		= new DecimalFormat("0");
		
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue dans ce programme de calcul des notes.");
		
		do {
			
			strChoixMenu	= (String) JOptionPane.showInputDialog(null,
																"Sélectionner votre choix parmi les options suivantes:",
																"Menu principal",
																JOptionPane.QUESTION_MESSAGE,
																null,
																strMenu,
																strMenu[0]);
			
			cChoixMenu		= strChoixMenu.charAt(0);
			
			switch (cChoixMenu)
			{
			case 'S': 
				/***********************************************************************
				Permets-la saisie des notes dans le tableau.
				Calcul la somme pour préparer la moyenne.
				Extrais la note la plus basse et la plus haute pour l'étendue.
				***********************************************************************/
				for (iCtr = 0 ; iCtr < MAX_NOTE ; )
				{
					dNote = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez une note /" + PONDERATION));
					
					if (dNote <= PONDERATION)
					{
						dNote	*= POURCENT;
						dNote	/= PONDERATION;
						
						if (dNote == POURCENT)
							iIndice = MAX_FREQ - 1;
						else
							iIndice = (int) dNote / MAX_FREQ;
						
						iTabNote[iIndice]++;
						
						dMoy	+= dNote;
						
						if (dNote < dNoteMin)
							dNoteMin = dNote;
						
						if (dNote > dNoteMax)
							dNoteMax = dNote;
						
						iCtr++;
					}
				}
				
				dMoy	/= MAX_NOTE;
				dEtend	= Math.ceil(dNoteMax - dNoteMin);
				break;
				
			case 'M':
				strMoyEtend = "";
				strMoyEtend	+= "La moyenne des notes /100 est : " + zeroChiffre.format(dMoy) + "\n";
				strMoyEtend	+= "L'étendue des notes /100 est : " + zeroChiffre.format(dEtend);
				JOptionPane.showMessageDialog(null, strMoyEtend);
				break;
				
			case 'T':
				strTabFreq = "";
				strTabFreq += "Indice   Fréquence  Symboles";
				
				/***********************************************************************
				Ajoute une nouvelle ligne avec l'indice et la fréquence.
				***********************************************************************/
				for (iCtr = 0 ; iCtr < MAX_FREQ ; iCtr++)
				{
					strTabFreq	+= "\n      " + iCtr;
					strTabFreq	+= "             " + iTabNote[iCtr] + "                    ";
					
					/***********************************************************************
					Ajoute les étoiles à la fin de la ligne.
					***********************************************************************/
					for (int iCtr2 = 1 ; iCtr2 <= iTabNote[iCtr] ; iCtr2++)
					{
						strTabFreq += "* ";
					}
					
				}
				
				JOptionPane.showMessageDialog(null, strTabFreq);
				break;
			
			case 'R':
				/***********************************************************************
				Remets toutes les données du tableau à zéro.
				***********************************************************************/
				Arrays.fill(iTabNote, VIDE);
				dNoteMin 	= Double.MAX_VALUE;
				dNoteMax 	= VIDE;
				dMoy		= VIDE;
				dEtend		= VIDE;
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
