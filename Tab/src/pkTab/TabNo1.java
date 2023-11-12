package pkTab;

import javax.swing.JOptionPane;

/***********************************************************************

Le fichier:			TabNo1.java

Projet:				Laboratoire sur les tableaux

Objectifs:			Donner les informations souhait�es � l'utilisateur par rapport aux employ�s et leur jour de cong�

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2022-10-24

***********************************************************************/

public class TabNo1 
{

	public static void main(String[] args) 
	{
		final	int		CONGE				= 10;														//Constante du nombre de jours pour �tre comptabilis�.
		final	int		HUIT_JRS			= 8;														//Constante du nombre de jours � comparer.
		final	int		CONTINU				= 0;														//Constant pour r�p�ter le while.
		
				String	strTabNom[]			= {"Benoit", "Alice", "Daniel", "Emile", "Julien"};			//Nom des employ�s.
				String	strNomMaxConge		= "";														//Nom de l'employ� avec le plus de cong�s.
				String	strMessageMaxConge	= "";														//Message pour afficher le nom de l'employ� avec le plus de jours de cong�.
				String	strMessage8Jrs		= "Les employ�s avec 8 jours accumul�s sont:";				//Message pour afficher les employ�s avec 8 jours de cong�.
				String	strMessage			= "";														//Message pour savoir si l'employ� fait parti du personnel.
						
				int		iTabNum[]			= {20, 10, 40, 50, 80};										//Num�ro des employ�s.
				int		iTabConge[]			= {18, 8, 10, 11, 8};										//Nombre de jours de cong� des employ�s.
				int		iCtr;																			//Compteur pour les boucles.
				int		iConge 				= 0;														//Variable du nombre d'employ�s ayant 10 jours de cong� ou plus.
				int		iMoyConge			= 0;														//Variable pour calculer la moyenne des jours de cong�.
				int		iMoyCongeMoins10	= 0;														//Variable pour calculer la moyenne des jours de cong� des employ�s avec moins que 10 jours de cong�.
				int		iMaxConge			= 0;														//Variable pour savoir qui a le plus de jours de cong�.
				int		iNumMaxConge		= 0;														//Num�ro de l'employer avec le plus de jours de cong�.
				int		iMinConge			= Integer.MAX_VALUE;										//Variable pour savoir qui a le moins de jours de cong�.
				int		iEtend;																			//Variable pour calculer l'�tendu des cong�s.
				int		iNum;																			//Variable pour convertir le num�ro de l'employ� demander.
				int		iContinue;																		//Variable pour continuer ou arr�ter le while.
		
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue, cette application r�pondra � vos questions concernant les cong�s de vos employ�s.");
		
		/***********************************************************************
		Compte le nombre d'employ�� avec 10 jours de cong� ou plus.
		Additionne les jours de cong� des employ�s.
		Additionne les jours de cong� des employ�s ayant accumul� moins de 10 jours.
		S�lectionne l'employ� avec le plus de journ�es maladie accumul�es.
		S�lectionne les employ�s avec 8 jours de maladie accumul�s.
		***********************************************************************/	
		for (iCtr = 0 ; iCtr < iTabConge.length ; iCtr++)
		{
			if (iTabConge[iCtr] >= CONGE)
				iConge++;
			
			iMoyConge += iTabConge[iCtr];
			
			if (iTabConge[iCtr] < CONGE)
				iMoyCongeMoins10 += iTabConge[iCtr];
			
			if (iTabConge[iCtr] > iMaxConge)
			{
				iMaxConge 		= iTabConge[iCtr];
				strNomMaxConge	= strTabNom[iCtr];
				iNumMaxConge	= iTabNum[iCtr];
			}
			
			if (iTabConge[iCtr] < iMinConge)
				iMinConge		= iTabConge[iCtr];
			
			if (iTabConge[iCtr] == HUIT_JRS)
			{
				strMessage8Jrs += "\n" + iTabNum[iCtr] + " " + strTabNom[iCtr];
			}
				
		}
		
		iMoyConge			/= iTabConge.length;
		iMoyCongeMoins10	/= iTabConge.length - iConge;
		iEtend				= iMaxConge - iMinConge;
		
		strMessageMaxConge += "L'employ� num�ro " + iNumMaxConge + " du nom de " + strNomMaxConge + " a le plus de journ�es maladie accumul�es.";
		
		/***********************************************************************
		Affiche les messages de la premi�re boucle.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Le nombre d'employ�s ayant 10 jours de cong� ou plus est de " + iConge + ".");
		JOptionPane.showMessageDialog(null, "La moyenne des jours de cong� pour tous les employ�s est de " + iMoyConge);
		JOptionPane.showMessageDialog(null, "La moyenne des jours de cong� pour les employ�s ayant accumulu�s moins de 10 jours est de " + iMoyCongeMoins10 + ".");
		JOptionPane.showMessageDialog(null, strMessageMaxConge);
		JOptionPane.showMessageDialog(null, "L'�tendu des jours de cong� est de " + iEtend + ".");
		JOptionPane.showMessageDialog(null, strMessage8Jrs);
		
		
		
		iNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez le num�ro d'employ� pour savoir son nombre de journ�es maladie accumul�es.", "00"));
		
		/***********************************************************************
		Compare avec les nombres du tableau.
		Ajoute le nom et le nombre de cong�s si correspondance.
		***********************************************************************/
		for (iCtr = 0 ; iCtr < iTabNum.length ; iCtr++)
		{
			if (iTabNum[iCtr] == iNum)
			{
				strMessage 	+= strTabNom[iCtr] + " a accumul� " + iTabConge[iCtr] + " jours de cong�";
			}
		}
		
		if (strMessage.length() == 0)
			strMessage += "Aucun num�ro correspondant trouver donc il ou elle ne fait pas partie de l'entreprise.";

		JOptionPane.showMessageDialog(null, strMessage);
		
		/***********************************************************************
		Se r�p�te tant que l'utilisateur le d�sire.
		***********************************************************************/
		do {
			strMessage	= "";
			iNum 		= Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez le num�ro d'employ� pour savoir s'il fait partie du personnel de l'entreprise.", "00"));
			
			/***********************************************************************
			Compare avec les nombres du tableau.
			Indique si l'employer fait partie de l'entreprise.
			***********************************************************************/
			for (iCtr = 0 ; iCtr < iTabNum.length ; iCtr++)
			{
				if (iTabNum[iCtr] == iNum)
					strMessage	+= "Le num�ro correspond � " + strTabNom[iCtr] + " donc il ou elle fait partie de l'entreprise.";
			}
			
			if (strMessage.length() == 0)
				strMessage += "Aucun num�ro correspondant trouver donc il ou elle ne fait pas partie de l'entreprise.";

			JOptionPane.showMessageDialog(null, strMessage);
			
			iContinue =     JOptionPane.showConfirmDialog  (null, 
										                   "D�sirez-vous v�rifier un autre num�ro?", "V�rificateur de num�ro d'employ�", 
										                   	JOptionPane.YES_NO_OPTION);

		} while (iContinue == CONTINU);
		
		
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va termin�, bonne journ�e.");
		
		System.exit(0);
	}

}
