package pkTab;

import javax.swing.JOptionPane;

/***********************************************************************

Le fichier:			TabNo1.java

Projet:				Laboratoire sur les tableaux

Objectifs:			Donner les informations souhaitées à l'utilisateur par rapport aux employés et leur jour de congé

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2022-10-24

***********************************************************************/

public class TabNo1 
{

	public static void main(String[] args) 
	{
		final	int		CONGE				= 10;														//Constante du nombre de jours pour être comptabilisé.
		final	int		HUIT_JRS			= 8;														//Constante du nombre de jours à comparer.
		final	int		CONTINU				= 0;														//Constant pour répéter le while.
		
				String	strTabNom[]			= {"Benoit", "Alice", "Daniel", "Emile", "Julien"};			//Nom des employés.
				String	strNomMaxConge		= "";														//Nom de l'employé avec le plus de congés.
				String	strMessageMaxConge	= "";														//Message pour afficher le nom de l'employé avec le plus de jours de congé.
				String	strMessage8Jrs		= "Les employés avec 8 jours accumulés sont:";				//Message pour afficher les employés avec 8 jours de congé.
				String	strMessage			= "";														//Message pour savoir si l'employé fait parti du personnel.
						
				int		iTabNum[]			= {20, 10, 40, 50, 80};										//Numéro des employés.
				int		iTabConge[]			= {18, 8, 10, 11, 8};										//Nombre de jours de congé des employés.
				int		iCtr;																			//Compteur pour les boucles.
				int		iConge 				= 0;														//Variable du nombre d'employés ayant 10 jours de congé ou plus.
				int		iMoyConge			= 0;														//Variable pour calculer la moyenne des jours de congé.
				int		iMoyCongeMoins10	= 0;														//Variable pour calculer la moyenne des jours de congé des employés avec moins que 10 jours de congé.
				int		iMaxConge			= 0;														//Variable pour savoir qui a le plus de jours de congé.
				int		iNumMaxConge		= 0;														//Numéro de l'employer avec le plus de jours de congé.
				int		iMinConge			= Integer.MAX_VALUE;										//Variable pour savoir qui a le moins de jours de congé.
				int		iEtend;																			//Variable pour calculer l'étendu des congés.
				int		iNum;																			//Variable pour convertir le numéro de l'employé demander.
				int		iContinue;																		//Variable pour continuer ou arrêter le while.
		
		/***********************************************************************
		Message de bienvenue.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Bienvenue, cette application répondra à vos questions concernant les congés de vos employés.");
		
		/***********************************************************************
		Compte le nombre d'employéé avec 10 jours de congé ou plus.
		Additionne les jours de congé des employés.
		Additionne les jours de congé des employés ayant accumulé moins de 10 jours.
		Sélectionne l'employé avec le plus de journées maladie accumulées.
		Sélectionne les employés avec 8 jours de maladie accumulés.
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
		
		strMessageMaxConge += "L'employé numéro " + iNumMaxConge + " du nom de " + strNomMaxConge + " a le plus de journées maladie accumulées.";
		
		/***********************************************************************
		Affiche les messages de la première boucle.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "Le nombre d'employés ayant 10 jours de congé ou plus est de " + iConge + ".");
		JOptionPane.showMessageDialog(null, "La moyenne des jours de congé pour tous les employés est de " + iMoyConge);
		JOptionPane.showMessageDialog(null, "La moyenne des jours de congé pour les employés ayant accumulués moins de 10 jours est de " + iMoyCongeMoins10 + ".");
		JOptionPane.showMessageDialog(null, strMessageMaxConge);
		JOptionPane.showMessageDialog(null, "L'étendu des jours de congé est de " + iEtend + ".");
		JOptionPane.showMessageDialog(null, strMessage8Jrs);
		
		
		
		iNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez le numéro d'employé pour savoir son nombre de journées maladie accumulées.", "00"));
		
		/***********************************************************************
		Compare avec les nombres du tableau.
		Ajoute le nom et le nombre de congés si correspondance.
		***********************************************************************/
		for (iCtr = 0 ; iCtr < iTabNum.length ; iCtr++)
		{
			if (iTabNum[iCtr] == iNum)
			{
				strMessage 	+= strTabNom[iCtr] + " a accumulé " + iTabConge[iCtr] + " jours de congé";
			}
		}
		
		if (strMessage.length() == 0)
			strMessage += "Aucun numéro correspondant trouver donc il ou elle ne fait pas partie de l'entreprise.";

		JOptionPane.showMessageDialog(null, strMessage);
		
		/***********************************************************************
		Se répète tant que l'utilisateur le désire.
		***********************************************************************/
		do {
			strMessage	= "";
			iNum 		= Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez le numéro d'employé pour savoir s'il fait partie du personnel de l'entreprise.", "00"));
			
			/***********************************************************************
			Compare avec les nombres du tableau.
			Indique si l'employer fait partie de l'entreprise.
			***********************************************************************/
			for (iCtr = 0 ; iCtr < iTabNum.length ; iCtr++)
			{
				if (iTabNum[iCtr] == iNum)
					strMessage	+= "Le numéro correspond à " + strTabNom[iCtr] + " donc il ou elle fait partie de l'entreprise.";
			}
			
			if (strMessage.length() == 0)
				strMessage += "Aucun numéro correspondant trouver donc il ou elle ne fait pas partie de l'entreprise.";

			JOptionPane.showMessageDialog(null, strMessage);
			
			iContinue =     JOptionPane.showConfirmDialog  (null, 
										                   "Désirez-vous vérifier un autre numéro?", "Vérificateur de numéro d'employé", 
										                   	JOptionPane.YES_NO_OPTION);

		} while (iContinue == CONTINU);
		
		
		
		/***********************************************************************
		Message de fin.
		***********************************************************************/
		JOptionPane.showMessageDialog(null, "L'application va terminé, bonne journée.");
		
		System.exit(0);
	}

}
