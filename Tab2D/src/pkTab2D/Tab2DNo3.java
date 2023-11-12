package pkTab2D;

import javax.swing.*;

/***********************************************************************

Le fichier:			Tab2DNo3.java

Projet:				Laboratoire sur les tableaux 2D

Objectifs:			Addition des lignes et colonnes d'une matrice

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-11-12

***********************************************************************/

public class Tab2DNo3 
{

	public static void main(String[] args) 
	{
		final	int		LIGNE		= 3;																//Nombre de lignes
		final	int		COL			= 5;																//Nombre de colonnes
		
				int		iMatA[][]	= new int[LIGNE][COL];												//Matrice A
				
				int		iTotLigne[]	= new int[LIGNE];													//Vecteur Ligne
				int		iTotCol[]	= new int[COL];														//Vecteur Colonne
				
				String	strMessage		= "";															//Affichage
				
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue dans l'application.");
				
		strMessage += "Matrice A\t\t\t\t\tTotal de ligne\n";

		/***********************************************************************
		Li les nombres de l'utilisateur
		Rempli la matrice A
		Calcul la somme de chaque ligne
		***********************************************************************/
		for (int iLigne = 0 ; iLigne < LIGNE ; iLigne++)
		{
			for(int iCol = 0 ; iCol < COL ; iCol++)
			{
				iMatA[iLigne][iCol] = Integer.parseInt(JOptionPane.showInputDialog("Entrer le nombre à la ligne " + (iLigne + 1) + " et la colonne " + (iCol + 1)));
				strMessage				+= iMatA[iLigne][iCol] + "\t";
				iTotLigne[iLigne]	+= iMatA[iLigne][iCol];
			}
			
			strMessage += iTotLigne[iLigne] + "\n";
		}
		
		strMessage += "Total des colonnes\n";

		/***********************************************************************
		Calcul la somme de chaque colonne
		***********************************************************************/
		for (int iCol = 0 ; iCol < COL ; iCol++)
		{
			for(int iLigne = 0 ; iLigne < LIGNE ; iLigne++)
			{
				iTotCol[iCol] += iMatA[iLigne][iCol];
			}
			
			strMessage += iTotCol[iCol] + "\t";
		}
		
		JOptionPane.showMessageDialog(null, new JTextArea(strMessage));
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);

	}

}
