package pkTab2D;

import javax.swing.JOptionPane;

/***********************************************************************

Le fichier:			Tab2DNo1.java

Projet:				Laboratoire sur les tableaux 2D

Objectifs:			Interchanger les lignes et les colonnes des matrices.

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-11-10

***********************************************************************/

public class Tab2DNo1 
{

	public static void main(String[] args) 
	{
		final	int		LIGNE		= 5;																				//Constante du nombre de lignes de la matrice
		final	int		COLONNE		= 5;																				//Constante du nombre de colonnes de la matrice
		
				int		iMatA[][]	= {	{1, 1, 1, 1, 1},
										{2, 2, 2, 2, 2},
										{3, 3, 3, 3, 3},
										{4, 4, 4, 4, 4},
										{5, 5, 5, 5, 5}};																//Matrice A
				
				int		iMatB[][]	= new int [LIGNE][COLONNE];															//Matrice B
				String	strMessage	= "";																				//Message
		
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue dans l'application.");
		
		/***********************************************************************
		Inverse les lignes et colonnes de la matrice A vers la B
		***********************************************************************/
		for (int iCtrLigne = 0 ; iCtrLigne < iMatB.length ; iCtrLigne++)
			for (int iCtrCol = 0 ; iCtrCol < iMatB[iCtrLigne].length ; iCtrCol++)
				iMatB[iCtrLigne][iCtrCol] = iMatA[iCtrCol][iCtrLigne];
		
		/***********************************************************************
		Affiche la première matrice
		***********************************************************************/
		for (int iCtrLigne = 0 ; iCtrLigne < iMatA.length ; iCtrLigne++)
		{
			strMessage += "\n";
			for (int iCtrCol = 0 ; iCtrCol < iMatA[iCtrLigne].length ; iCtrCol++)
				strMessage += iMatA[iCtrLigne][iCtrCol] + " ";
		}
		
		/***********************************************************************
		Affiche la deuxième matrice
		***********************************************************************/
		strMessage += "\n";
		
		for (int iCtrLigne = 0 ; iCtrLigne < iMatB.length ; iCtrLigne++)
		{
			strMessage += "\n";
			for (int iCtrCol = 0 ; iCtrCol < iMatB[iCtrLigne].length ; iCtrCol++)
				strMessage += iMatB[iCtrLigne][iCtrCol] + " ";
		}
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);

	}

}
