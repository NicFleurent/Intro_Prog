package pkTab2D;

import javax.swing.*;

/***********************************************************************

Le fichier:			Tab2DNo5.java

Projet:				Laboratoire sur les tableaux 2D

Objectifs:			Multiplication d'un vecteur avec une matrice

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2022-11-13

***********************************************************************/

public class Tab2DNo5 
{

	public static void main(String[] args) 
	{
		final	int		LIGNE		= 5;									//Nombre de lignes de la matrice r�sultante
		final	int		COL			= 3;									//Nombre de colonnes de la matrice r�sultante

				int		iVect[]		= {5, 2, 4, 3, 2};						//Vecteur
				int		iMat[][]	= {	{10, 15, 20},
										{30, 20, 10}, 
										{10, 15, 20},
										{30, 20, 20},
										{10, 20, 10}};						//Matrice A
				
				int		iMatRes[][]	=	new	int[LIGNE][COL];				//Matrice r�sultante
				
				String	strVect		= "";									//Message Vecteur
				String	strMat		= "";									//Message Matrice d�part
				String	strMatRes	= "";									//Message Matrice r�sultante
				String	strMessage	= "";									//Message final
				
		/***********************************************************************
		Message de bienvenue
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue dans l'application.");
		
		/***********************************************************************
		Calcul la matrice r�sultante
		Pr�pare les messages pour le message final
		***********************************************************************/
		for (int iLigne = 0 ; iLigne < LIGNE ; iLigne++)
		{
			for (int iCol = 0 ; iCol < COL ; iCol++)
			{
				iMatRes[iLigne][iCol] 	= iMat[iLigne][iCol] * iVect[iLigne];
				strMat					+= iMat[iLigne][iCol] + " ";
				strMatRes				+= iMatRes[iLigne][iCol] + " ";
			}
			
			strVect 	+= iVect[iLigne] + "\n";
			strMat		+= "\n";
			strMatRes	+= "\n";
		}
		
		strMessage = strVect + "\n" + strMat + "\n" + strMatRes;
		
		JOptionPane.showMessageDialog(null, strMessage);
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va termin�, bonne journ�e.");
		
		System.exit(0);
				
	}

}
