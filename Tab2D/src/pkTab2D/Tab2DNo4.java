package pkTab2D;

import javax.swing.*;

/***********************************************************************

Le fichier:			Tab2DNo4.java

Projet:				Laboratoire sur les tableaux 2D

Objectifs:			Addition des lignes et colonnes et multiplication dans 2 matrices

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-11-13

***********************************************************************/

public class Tab2DNo4 
{

	public static void main(String[] args) 
	{
		final	int		LONG_VECT	= 3;																		//Longueur du vecteur de résultat
		final	int		VIDE		= 0;																		//Remet la variable à 0
		
				int		iMatA[][]	= {	{1, 1, 1, 1},
										{2, 2, 2, 2},
										{3, 3, 3, 3}};															//Matrice A
				
				int		iMatB[][]	= {	{1, 2, 3},
										{1, 2, 3},
										{1, 2, 3},
										{1, 2, 3}};																//Matrice B
				
				int		iVectAB[]	= new int[LONG_VECT];														//Vecteur AB
				
				int		iTotA		= VIDE;																		//Total de la ligne de la matrice A
				int		iTotB		= VIDE;																		//Total de la colonne de la matrice b
				
				String	strMessage	= "";																		//Message
				String	strMatA		= "";																		//Message
				String	strMatB		= "";																		//Message
				String	strVectAB	= "";																		//Message
				
		/***********************************************************************
		Message de bienvenue
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue dans l'application.");
		
		/***********************************************************************
		Calcul le vecteur
		Créer l'affichage du vecteur
		***********************************************************************/
		for(int iVect = 0 ; iVect < iVectAB.length ; iVect++)
		{
			iTotA = iTotB = VIDE;
			
			/***********************************************************************
			Calcul le total de chaque ligne de la matrice A
			Créer l'affichage de la matrice A
			***********************************************************************/
			for(int iCol = 0 ; iCol < iMatA[iVect].length ; iCol++)
			{
				iTotA 	+= iMatA[iVect][iCol];
				strMatA	+= iMatA[iVect][iCol] + " ";
			}
			
			/***********************************************************************
			Calcul le total de chaque colonne de la matrice B
			***********************************************************************/
			for(int iLigne = 0 ; iLigne < iMatB.length ; iLigne++)
				iTotB 	+= iMatB[iLigne][iVect];

			/***********************************************************************
			Créer l'affichage de la matrice B
			***********************************************************************/
			for(int iCol = 0 ; iCol < iMatB[iVect].length ; iCol++)
				strMatB += iMatB[iVect][iCol] + " ";
			
			iVectAB[iVect] 	= iTotA * iTotB;
			
			strVectAB 		+= iVectAB[iVect] + " ";
			strMatA			+= "\n";
			strMatB += "\n";
		}
			
		
		strMessage += strMatA + "\n" + strMatB + "\n" + strVectAB;
		
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);

	}

}
