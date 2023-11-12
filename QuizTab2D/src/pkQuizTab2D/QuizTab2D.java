package pkQuizTab2D;

import javax.swing.JOptionPane;

/***********************************************************************

Le fichier:			QuizTab2D.java

Projet:				Laboratoire sur les tableaux 2D

Objectifs:			Comparer les scores à la normale

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-11-14

***********************************************************************/

public class QuizTab2D 
{

	public static void main(String[] args) 
	{
		final	int		AGE_MIN			= 12;										//Age minimum du joueur
		final	int		AGE_MAX			= 17;										//Age maximum du joueur
		
				int		iMatNorm[][]	= {	{6, 5, 5, 4, 4, 4},
											{5, 4, 4, 4, 4, 4},
											{6, 5, 5, 4, 4, 4},
											{5, 4, 5, 4, 3, 3},
											{4, 3, 3, 3, 3, 3},
											{6, 6, 5, 4, 3, 2},
											{5, 4, 4, 4, 4, 3},
											{4, 3, 3, 3, 3, 3},
											{5, 4, 4, 3, 3, 3}};					//Matrice des normales de parcours
				
				int		iAge;														//Âge du joueur
				int		iAgeMat;
				int		iScore;														//Score du joueur
				int		iContinue;													//Permet de continuer dans l'application ou de la quitter
				
				String	strNom;														//Nom du joueur
				String	strAffichage	= "";										//Affichage du message final
				

		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue cette application qui compare vos score à la normale.");
		
		/***********************************************************************
		Répète tant que l'utilisateur le veut
		***********************************************************************/
		do {
			
			strNom 	= JOptionPane.showInputDialog("Entrer le nom du joueur");
			iAge	= Integer.parseInt(JOptionPane.showInputDialog(null, "Entrer l'âge du joueur", "Entre " + AGE_MIN + " et " + AGE_MAX + " ans"));

			/***********************************************************************
			Vérifi que l'âge est valide
			***********************************************************************/
			if((iAge >= AGE_MIN) && (iAge <= AGE_MAX))
			{
				strAffichage 	= strNom + " a " + iAge + " ans.";
				
				iAgeMat			= iAge - AGE_MIN;
				
				/***********************************************************************
				Demande le score
				Compare le score
				Prépare l'affichage final
				***********************************************************************/
				for(int iTrou = 0 ; iTrou < iMatNorm.length ; iTrou++)
				{
					iScore	= Integer.parseInt(JOptionPane.showInputDialog("Entrer le score du trou #" + (iTrou + 1)));
					
					if(iScore > iMatNorm[iTrou][iAgeMat])
						strAffichage += "\nTrou " + (iTrou + 1) + ": score " + iScore + " - au-dessus de la normale";
					else if (iScore < iMatNorm[iTrou][iAgeMat])
						strAffichage += "\nTrou " + (iTrou + 1) + ": score " + iScore + " - sous la normale";
					else
						strAffichage += "\nTrou " + (iTrou + 1) + ": score " + iScore + " - normale";
				}
				
				JOptionPane.showMessageDialog(null, strAffichage);	
			}
			else
				JOptionPane.showMessageDialog(null, "S.v.p. entrer un âge valide, soit entre 12 et 17 ans");
			
			/***********************************************************************
			Créer le bouton pour continuer
			***********************************************************************/
			iContinue = JOptionPane.showConfirmDialog(	null, 
									                    "Désirez-vous saisir les performances d'un autre joueur? ",  
									                    "Comparateur de score", 
									                     JOptionPane.YES_NO_OPTION);

		} while (iContinue == 0);
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);

	}

}
