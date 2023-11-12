package pkTab2D;

import javax.swing.JOptionPane;

/***********************************************************************

Le fichier:			Tab2DNo2.java

Projet:				Laboratoire sur les tableaux 2D

Objectifs:			Convertis un vecteur en matrice

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-11-10

***********************************************************************/

public class Tab2DNo2 
{

	public static void main(String[] args) 
	{
		final	int		LIGNE		= 3;																				//Constante du nombre de lignes de la matrice
		final	int		COLONNE		= 3;																				//Constante du nombre de colonnes de la matrice
		
				int		iVect[]		= {10, 20, 30, 40, 50, 60, 70, 80, 90};												//Matrice A
				int		iMat[][]	= new int [LIGNE][COLONNE];															//Compteur
				
				String	strMessage	= "";																				//Message
				
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue dans l'application.");
		
		/***********************************************************************
		Convertis le vecteur en matrice
		***********************************************************************/
		for (int iCtrLigne = 0 ; iCtrLigne < iMat.length ; iCtrLigne++)
			for (int iCtrCol = 0 ; iCtrCol < iMat[iCtrLigne].length ; iCtrCol++)
					iMat[iCtrLigne][iCtrCol] = iVect[(iCtrLigne * iMat.length) + iCtrCol];
		
		/***********************************************************************
		Affiche le vecteur
		***********************************************************************/
		for (int iCtr = 0 ; iCtr < iVect.length ; iCtr++)
				strMessage += iVect[iCtr] + " ";
		
		/***********************************************************************
		Affiche la matrice
		***********************************************************************/
		strMessage += "\n";
		
		for (int iCtrLigne = 0 ; iCtrLigne < iMat.length ; iCtrLigne++)
		{
			strMessage += "\n";
			for (int iCtrCol = 0 ; iCtrCol < iMat[iCtrLigne].length ; iCtrCol++)
				strMessage += iMat[iCtrLigne][iCtrCol] + " ";
		}
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);

	}

}
