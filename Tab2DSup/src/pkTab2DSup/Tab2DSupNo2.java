package pkTab2DSup;

import java.util.Arrays;

import javax.swing.*;

public class Tab2DSupNo2 
{

	public static void main(String[] args) 
	{
		final	int		ETU				= 5;																			//Nombre maximal d'�tudiant
		final	int		QUESTION		= 15;																			//nombre maximal de question
		final	int		VAL_A			= 1;																			//Valeur de a
		final	int		VAL_B			= 3;																			//Valeur de b
		final	int		VAL_C			= 4;																			//Valeur de c
		final	int		VAL_D			= 0;																			//Valeur de d
		final	int		VAL_E			= 2;																			//Valeur de e
		final	int		CAT_1			= 15;																			//1ere cat�gorie
		final	int		CAT_2			= 30;																			//2e cat�gorie
		final	int		CAT_3			= 45;																			//3e cat�gorie
		final	int		MAX_CAT			= 4;																			//Nombre de choix de r�ponse
		final	int		CHOIX_REP		= 5;																			//Nombre de choix de r�ponse
		final	int		POS_A			= 0;																			//Position rep A
		final	int		POS_B			= 1;																			//Position rep b
		final	int		POS_C			= 2;																			//Position rep c
		final	int		POS_D			= 3;																			//Position rep d
		final	int		POS_E			= 4;																			//Position rep e
		
				String	strQuestion;																					//Input pour chaque question
				String	strRepMax		= "";																			//Affichage des maximum de r�ponse
				
				char	cQuestion[][]	= new char[ETU][QUESTION];														//Questionnaire
				
				int		iEtu;																							//�tudiant �r�pondant au questionnaire
				int		iQuestion;																						//Question � laquelle il r�pond
				int		iCat;																							//Cat�gorie de l'�tudiant
				int		iContinue;																						//Pour continuer la saisie
				int		iCtr[]			= new int[CHOIX_REP];															//Compteur de choix de r�ponse
				int		iCtrMax = 0;
				int		iCtrTot[]		= new int[CHOIX_REP];															//Compteur de choix de r�ponse
				int		iCtrCat[]		= new int[MAX_CAT];																//Compteur de choix de r�ponse
				int		iCtrTotMax = 0;
				int		iCtrCatMax = 0;
				int		iLettreMax = 0;
				
		for (iEtu = 0 ; iEtu < ETU ; iEtu++)
		{
			iCat = 0;
			
			for (iQuestion = 0 ; iQuestion < QUESTION ; iQuestion++)
			{
				do {
					strQuestion = JOptionPane.showInputDialog("R�pondre par a, b, c, d ou e � la question " + (iQuestion + 1));
					cQuestion[iEtu][iQuestion]	= strQuestion.charAt(0);
					
					switch (cQuestion[iEtu][iQuestion])
					{
					case 'A': case 'a':
										iCat += VAL_A;
										iCtrTot[POS_A]++;
										break;
					case 'B': case 'b':
										iCat += VAL_B;
										iCtrTot[POS_B]++;
										break;
					case 'C': case 'c':
										iCat += VAL_C;
										iCtrTot[POS_C]++;
										break;
					case 'D': case 'd':
										iCat += VAL_D;
										iCtrTot[POS_D]++;
										break;
					case 'E': case 'e':
										iCat += VAL_E;
										iCtrTot[POS_E]++;
										break;
					default: 			
										cQuestion[iEtu][iQuestion] = 'z';
										JOptionPane.showMessageDialog(null, "Saisie incorrecte, s.v.p. saisir une lettre parmi a, b, c, d ou e");
					}
					
				} while (cQuestion[iEtu][iQuestion] == 'z');
			}
			
			if (iCat <= CAT_1)
			{
				JOptionPane.showMessageDialog(null, "L'�tudiant " + (iEtu + 1) + " est une personne tr�s dynamique.");
				iCtrCat[POS_A]++;
			}
			else if (iCat <= CAT_2)
			{
				JOptionPane.showMessageDialog(null, "L'�tudiant " + (iEtu + 1) + " est une personne ayant beaucoup d'initiative.");
				iCtrCat[POS_B]++;
			}
			else if (iCat <= CAT_3)
			{
				JOptionPane.showMessageDialog(null, "L'�tudiant " + (iEtu + 1) + " est une personne aimant le travail d'�quipe.");
				iCtrCat[POS_C]++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "L'�tudiant " + (iEtu + 1) + " est une personne ordonn�e.");
				iCtrCat[POS_D]++;
			}
			
			iContinue = JOptionPane.showConfirmDialog  (null, 
														"D�sirez-vous faire le sondage avec un autre �tudiant? ",  
														"Sondage psychologique", 
														JOptionPane.YES_NO_OPTION);
			
			if (iContinue == 1)
				break;

		}
		
		for (iQuestion = 0 ; iQuestion < cQuestion[0].length ; iQuestion++)
		{
			Arrays.fill(iCtr, 0);
			iCtrMax = 0;
			
			for(iEtu = 0 ; iEtu < cQuestion.length ; iEtu++)
			{
				switch (cQuestion[iEtu][iQuestion])
				{
				case 'A': case 'a':
									iCtr[POS_A]++;
									break;
				case 'B': case 'b':
									iCtr[POS_B]++;
									break;
				case 'C': case 'c':
									iCtr[POS_C]++;
									break;
				case 'D': case 'd':
									iCtr[POS_D]++;
									break;
				case 'E': case 'e':
									iCtr[POS_E]++;
									break;
				}
			}
			
			for(int iCtr1 = 0 ; iCtr1 < iCtr.length ; iCtr1++)
			{
				if(iCtr[iCtr1] > iCtrMax)
				{
					iCtrMax 	= iCtr[iCtr1];
					iLettreMax	= iCtr1;
				}
			}
			
			switch(iLettreMax)
			{
			case 0: strRepMax += "Le choix A est la r�ponse la plus populaire pour la question " + (iQuestion + 1) + "\n"; break;
			case 1: strRepMax += "Le choix B est la r�ponse la plus populaire pour la question " + (iQuestion + 1) + "\n"; break;
			case 2: strRepMax += "Le choix C est la r�ponse la plus populaire pour la question " + (iQuestion + 1) + "\n"; break;
			case 3: strRepMax += "Le choix D est la r�ponse la plus populaire pour la question " + (iQuestion + 1) + "\n"; break;
			case 4: strRepMax += "Le choix E est la r�ponse la plus populaire pour la question " + (iQuestion + 1) + "\n"; break;
			}
		}
		
		for(int iCtr1 = 0 ; iCtr1 < iCtrTot.length ; iCtr1++)
		{
			if(iCtrTot[iCtr1] > iCtrTotMax)
			{
				iCtrTotMax 	= iCtrTot[iCtr1];
				iLettreMax	= iCtr1;
			}
		}
		
		switch(iLettreMax)
		{
		case 0: strRepMax += "\n\nLe choix A est la r�ponse la plus populaire pour tout le sondage"; break;
		case 1: strRepMax += "\n\nLe choix B est la r�ponse la plus populaire pour tout le sondage"; break;
		case 2: strRepMax += "\n\nLe choix C est la r�ponse la plus populaire pour tout le sondage"; break;
		case 3: strRepMax += "\n\nLe choix D est la r�ponse la plus populaire pour tout le sondage"; break;
		case 4: strRepMax += "\n\nLe choix E est la r�ponse la plus populaire pour tout le sondage"; break;
		}
		
		for(int iCtr1 = 0 ; iCtr1 < iCtrCat.length ; iCtr1++)
		{
			if(iCtrCat[iCtr1] > iCtrCatMax)
			{
				iCtrCatMax 	= iCtrCat[iCtr1];
				iLettreMax	= iCtr1;
			}
		}
		
		switch(iLettreMax)
		{
		case 0: strRepMax += "\n\nLa cat�gorie la plus populaire est PERSONNE TR�S DYNAMIQUE"; 				break;
		case 1: strRepMax += "\n\nLa cat�gorie la plus populaire est PERSONNE AYANT BEAUCOUP D'INITIATIVE"; break;
		case 2: strRepMax += "\n\nLa cat�gorie la plus populaire est PERSONNE AIMANT LE TRAVAIL D'�QUIPE"; 	break;
		case 3: strRepMax += "\n\nLa cat�gorie la plus populaire est PERSONNE ORDONN�E";					break;
		}
		
		JOptionPane.showMessageDialog(null, strRepMax);

	}

}
