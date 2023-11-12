package pkTab2DSup;

import javax.swing.*;

public class Tab2DSupNo3 
{

	public static void main(String[] args) 
	{
		final	int		VAL_X	= 1;																				//Valeur de X pour le calcul
		final	int		VAL_O	= 2;																				//Valeur de O pour le calcul
		
				String	strTicTacToe[][]	= {	{"___","|___|","___"},
												{"___","|___|","___"},
												{"       ","|       |","       "}};									//Planche de jeu
				
				
				String	strAffichage		= "";																	//Affichage
				
				int 	iLigne 				= 0;																	//Ligne de jeu
				int		iCol				= 0;																	//Colonne de jeu
				int		iCtr				= 0;																	//Compteur de coup
				int		iTicTacToe[][]		= {	{0,0,0},
												{0,0,0},
												{0,0,0}};															//Nombre pour le calcul de la victoire
				
				boolean	bVictoireX			= false;																//V�rifie si les X ont gagn�s
				boolean	bVictoireO			= false;																//V�rifie si les O ont gagn�s
		
		do
		{
			if(iCtr == 9)
			{
				JOptionPane.showMessageDialog(null, "Partie nulle");
				break;
			}
			
			strAffichage	= "";
			
			/****************************************************************
			Cr�er l'affichage
			****************************************************************/	
			for(iLigne = 0 ; iLigne < strTicTacToe.length ; iLigne++)
			{
				for(iCol = 0 ; iCol < strTicTacToe[iLigne].length ; iCol++)
				{
					strAffichage += strTicTacToe[iLigne][iCol];
				}
				
				strAffichage += "\n";
			}
			
			/****************************************************************
			Permet au X de jouer
			****************************************************************/
			if (iCtr % 2 != 0)
			{
				iLigne 								= Integer.parseInt(JOptionPane.showInputDialog(null, strAffichage, "Joueur X - Entrer la ligne � laquelle vous voulez jouer"));
				iCol 								= Integer.parseInt(JOptionPane.showInputDialog(null, strAffichage, "Joueur X - Entrer la colonne � laquelle vous voulez jouer"));
				iTicTacToe[iLigne - 1][iCol - 1]	= VAL_X;
				
				if (iLigne != 3)
					if(iCol != 2)
						strTicTacToe[iLigne - 1][iCol - 1] 	= "_X_";
					else
						strTicTacToe[iLigne - 1][iCol - 1] = "|_X_|";
				else if(iCol != 2)
					strTicTacToe[iLigne - 1][iCol - 1] = "  X   ";
				else
					strTicTacToe[iLigne - 1][iCol - 1] = "|   X  |";
			}
			/****************************************************************
			Permet au O de jouer
			****************************************************************/
			else 
			{
				iLigne 								= Integer.parseInt(JOptionPane.showInputDialog(null, strAffichage, "Joueur O - Entrer la ligne � laquelle vous voulez jouer"));
				iCol 								= Integer.parseInt(JOptionPane.showInputDialog(null, strAffichage, "Joueur O - Entrer la colonne � laquelle vous voulez jouer"));
				iTicTacToe[iLigne - 1][iCol - 1]	= VAL_O;
				
				if (iLigne != 3)
					if(iCol != 2)
						strTicTacToe[iLigne - 1][iCol - 1] = "_O_";
					else
						strTicTacToe[iLigne - 1][iCol - 1] = "|_O_|";
				else if(iCol != 2)
					strTicTacToe[iLigne - 1][iCol - 1] = "  O   ";
				else
					strTicTacToe[iLigne - 1][iCol - 1] = "|   O  |";
			}
			
			/****************************************************************
			Regarde si quelqu'un � gagn�
			****************************************************************/
			if(iTicTacToe[0][0] != 0)
			{
				if(iTicTacToe[0][1] != 0)
				{
					if(iTicTacToe[0][2] != 0)
					{
						if( (iTicTacToe[0][0] + iTicTacToe[0][1] + iTicTacToe[0][2]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[0][0] + iTicTacToe[0][1] + iTicTacToe[0][2]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
				
				if(iTicTacToe[1][0] != 0)
				{
					if(iTicTacToe[2][0] != 0)
					{
						if( (iTicTacToe[0][0] + iTicTacToe[1][0] + iTicTacToe[2][0]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[0][0] + iTicTacToe[1][0] + iTicTacToe[2][0]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
				
				if(iTicTacToe[1][1] != 0)
				{
					if(iTicTacToe[2][2] != 0)
					{
						if( (iTicTacToe[0][0] + iTicTacToe[1][1] + iTicTacToe[2][2]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[0][0] + iTicTacToe[1][1] + iTicTacToe[2][2]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
			}
			
			if(iTicTacToe[0][1] != 0)
			{
				if(iTicTacToe[1][1] != 0)
				{
					if(iTicTacToe[2][1] != 0)
					{
						if( (iTicTacToe[0][1] + iTicTacToe[1][1] + iTicTacToe[2][1]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[0][1] + iTicTacToe[1][1] + iTicTacToe[2][1]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
			}
			
			if(iTicTacToe[0][2] != 0)
			{
				if(iTicTacToe[1][2] != 0)
				{
					if(iTicTacToe[2][2] != 0)
					{
						if( (iTicTacToe[0][2] + iTicTacToe[1][2] + iTicTacToe[2][2]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[0][2] + iTicTacToe[1][2] + iTicTacToe[2][2]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
			}
			
			if(iTicTacToe[1][0] != 0)
			{
				if(iTicTacToe[1][1] != 0)
				{
					if(iTicTacToe[1][2] != 0)
					{
						if( (iTicTacToe[1][0] + iTicTacToe[1][1] + iTicTacToe[1][2]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[1][0] + iTicTacToe[1][1] + iTicTacToe[1][2]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
			}
			
			if(iTicTacToe[2][0] != 0)
			{
				if(iTicTacToe[2][1] != 0)
				{
					if(iTicTacToe[2][2] != 0)
					{
						if( (iTicTacToe[2][0] + iTicTacToe[2][1] + iTicTacToe[2][2]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[2][0] + iTicTacToe[2][1] + iTicTacToe[2][2]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
				
				if(iTicTacToe[1][1] != 0)
				{
					if(iTicTacToe[0][2] != 0)
					{
						if( (iTicTacToe[2][0] + iTicTacToe[1][1] + iTicTacToe[0][2]) == 3)
						{
							JOptionPane.showMessageDialog(null, "Les X ont gagn�");
							bVictoireX = true;
						}
						else if( (iTicTacToe[2][0] + iTicTacToe[1][1] + iTicTacToe[0][2]) == 6)
						{
							JOptionPane.showMessageDialog(null, "Les O ont gagn�");
							bVictoireO = true;
						}
					}
				}
			}
			
			iCtr++;
			
		} while (!bVictoireX && !bVictoireO);
		
		
		
		

	}

}
