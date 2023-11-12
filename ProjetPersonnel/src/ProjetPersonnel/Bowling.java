package ProjetPersonnel;

import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/***********************************************************************

Le fichier:			CalculBowling.java

Projet:				Projet Personnel

Objectifs:			Compile les scores de bowling

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2022-11-15

***********************************************************************/

public class Bowling 
{

	public static void main(String[] args) 
	{
		final	int		MAX_LANCER		= 21;																		//Maximum de lancer dans une partie
		final	int		MAX_CAR			= 10;																		//Maximum de lancer dans une partie
		final	int		MAX_QUILLE		= 10;																		//Nombre de quille
		
				String	strChoixMenu[]	= {	"Jouer une partie",
											"Visualiser les statistiques",
											"Recommener une partie",
											"Quitter l'application"};												//Menu
				
				String	strLancer		= "";																		//Affichage des r�sultats de lancer
				String	strCarreau		= "";																		//Affichage des resultats de carreau
				String	strScore		= "";																		//Affichage des scores totaux
				String	strAffichage	= "";																		//Affichage final
		

				int		iChoixMenu		= 0;																		//Choix dans le menu
				int		iLancer[]		= new int[MAX_LANCER];														//Emplacement m�moire pour chaque lancer
				int		iCarreau[]		= new int[MAX_CAR];															//Emplacement m�moire pour le total du chaque carreau
				int		iScore[]		= new int[MAX_CAR];															//Emplacement m�moire pour le score total � chaque carreau
				
				boolean	b2Abat			= true;																		//Valeur qui permet d'ajouter les point seulement si il y a 2 abats cons�cutif

				char	cLancer[]		= new char[MAX_LANCER];														//Emplacement m�moire pour chaque lancer
				
		do {
			iChoixMenu = JOptionPane.showOptionDialog(	null, 
					"S�lectionnez votre choix parmi les options suivantes: ",
					"Menu principal",   			  
			        JOptionPane.YES_NO_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null,
					strChoixMenu,
					strChoixMenu[0]);

			switch (iChoixMenu)
			{
			case 0:
				for(int iCtr = 0 ; iCtr < MAX_CAR ; iCtr++)
				{
					iLancer[iCtr * 2] = Integer.parseInt(JOptionPane.showInputDialog(null, "1er lancer du carreau #" + (iCtr + 1), "Entrer le nombre de quilles tomb�es"));
					
					if(iCtr > 0)
						if((cLancer[(iCtr - 1) * 2] == 'a') || (cLancer[((iCtr - 1) * 2) + 1] == 'r'))
						{
							iCarreau[iCtr - 1] += iLancer[iCtr * 2];
						}
					
					if(iCtr > 1)
						if ((cLancer[(iCtr - 2) * 2]  == 'a') && b2Abat)
							iCarreau[iCtr - 2] += iLancer[iCtr * 2];
					
					if (iLancer[iCtr * 2] == MAX_QUILLE)
					{
						cLancer[iCtr * 2] 	= 'a';
						iCarreau[iCtr]		= MAX_QUILLE;
						b2Abat			 	= true;
					}
					else
					{
						iLancer[(iCtr * 2) + 1] = Integer.parseInt(JOptionPane.showInputDialog(null, "2e lancer du carreau #" + (iCtr + 1), "Entrer le nombre de quilles tomb�es"));
						b2Abat			 		= false;
						
						if(iCtr > 0)
							if(cLancer[(iCtr - 1) * 2] == 'a')
							{
								iCarreau[iCtr - 1] += iLancer[(iCtr * 2) + 1];
							}
						
						if ((iLancer[iCtr * 2] + iLancer[(iCtr * 2) + 1]) == MAX_QUILLE)
						{
							cLancer[(iCtr * 2) + 1] = 'r';
							iCarreau[iCtr]			= MAX_QUILLE;
						}
						else
							iCarreau[iCtr]	= iLancer[iCtr * 2] + iLancer[(iCtr * 2) + 1];
					}
					
					if (iCtr == (MAX_CAR - 1))
					{
						if (iLancer[iCtr * 2] == MAX_QUILLE)
						{
							iLancer[(iCtr * 2) + 1] = Integer.parseInt(JOptionPane.showInputDialog(null, "2e lancer du carreau #" + (iCtr + 1), "Entrer le nombre de quilles tomb�es"));
							
							iCarreau[iCtr] += iLancer[(iCtr * 2) + 1];
							
							if((cLancer[(iCtr - 1) * 2] == 'a') && b2Abat)
							{
								iCarreau[iCtr - 1] += iLancer[(iCtr * 2) + 1];
							}
							
							if (iLancer[(iCtr * 2) + 1] == MAX_QUILLE)
							{
								cLancer[(iCtr * 2) + 1] = 'a';
								b2Abat			 		= true;
								
								iLancer[(iCtr * 2) + 2] = Integer.parseInt(JOptionPane.showInputDialog(null, "3e lancer du carreau #" + (iCtr + 1), "Entrer le nombre de quilles tomb�es"));
								
								iCarreau[iCtr] += iLancer[(iCtr * 2) + 2];
								
								if (iLancer[(iCtr * 2) + 2] == MAX_QUILLE)
									cLancer[(iCtr * 2) + 2] = 'a';
							}
							else
							{
								iLancer[(iCtr * 2) + 2] = Integer.parseInt(JOptionPane.showInputDialog(null, "3e lancer du carreau #" + (iCtr + 1), "Entrer le nombre de quilles tomb�es"));
								
								iCarreau[iCtr] += iLancer[(iCtr * 2) + 2];
								
								if ((iLancer[(iCtr * 2) + 1] + iLancer[(iCtr * 2) + 2]) == MAX_QUILLE)
									cLancer[(iCtr * 2) + 2] = 'r';
									
							}
						}

						if ((iLancer[iCtr * 2] + iLancer[(iCtr * 2) + 1]) == MAX_QUILLE)
						{
							iLancer[(iCtr * 2) + 2] = Integer.parseInt(JOptionPane.showInputDialog(null, "3e lancer du carreau #" + (iCtr + 1), "Entrer le nombre de quilles tomb�es"));
							
							iCarreau[iCtr] += iLancer[(iCtr * 2) + 2];
						}
						
						
					}
					
				}
				
				for (int iCtr = 0 ; iCtr < MAX_CAR ; iCtr++)
				{
					if (iCtr > 0)
						iScore[iCtr] = iScore[iCtr - 1] + iCarreau[iCtr];
					else
						iScore[iCtr] = iCarreau[iCtr];
				}
				break;
				
			case 1:
				strLancer 		= "";
				strCarreau		= "";
				strScore		= "";
				
				for (int iCtr = 0 ; iCtr < MAX_CAR ; iCtr++)
				{
					if (iCtr < (MAX_CAR - 1))
					{
						if (cLancer[iCtr * 2] == 'a')
							strLancer 	+= "A\t";
						else if (cLancer[(iCtr * 2) + 1] == 'r')
							strLancer 	+= iLancer[iCtr * 2] + " R\t";
						else
							strLancer 	+= iLancer[iCtr * 2] + " " + iLancer[(iCtr * 2) + 1] + "\t";
					}
					else
					{
						if (cLancer[iCtr * 2] == 'a')
							strLancer 	+= "A ";
						else
							strLancer	+= iLancer[iCtr * 2] + " ";
						
						if (cLancer[(iCtr * 2) + 1] == 'a')
							strLancer 	+= "A ";
						else if (cLancer[(iCtr * 2) + 1] == 'r')
							strLancer 	+= "R ";
						else
							strLancer 	+= iLancer[(iCtr * 2) + 1] + " ";

						if ((cLancer[iCtr * 2] == 'a') || (cLancer[(iCtr * 2) + 1] == 'r'))
						{
							if (cLancer[(iCtr * 2) + 2] == 'a')
								strLancer 	+= "A";
							else if (cLancer[(iCtr * 2) + 2] == 'r')
								strLancer 	+= "R";
							else
								strLancer 	+= iLancer[(iCtr * 2) + 2];
						}
					}
					
					
					
					strCarreau 	+= iCarreau[iCtr] + "\t";
					strScore	+= iScore[iCtr] + "\t";
				}
				
				strAffichage = "Partie";
				strAffichage += "Carreau\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10";
				strAffichage += "\nLancer\t" + strLancer;
				strAffichage += "\nPoint\t" + strCarreau;
				strAffichage += "\nTotal\t" + strScore;
				
				JOptionPane.showMessageDialog(null, new JTextArea(strAffichage));
				
				break;
			
			case 2:
				Arrays.fill(iLancer, 0);
				Arrays.fill(iCarreau, 0);
				Arrays.fill(iScore, 0);
				Arrays.fill(cLancer, ' ');
				break;
				
			}
		} while (iChoixMenu != 3);

	}

}
