package pkTantQue;

import javax.swing.*;

public class TantQueNo3 
{

	public static void main(String[] args) 
	{
		final	int		I_MIN_PREDEF	= 1;																//Constante de depart du random du niveau prédéfini
		final	int		I_MAX_PREDEF	= 10;																//Constante de fin du random du niveau prédéfini
		final	int		I_MIN_SUP_NIV1	= 1;																//Constante de depart du random du niveau superieur niveau 1
		final	int		I_MAX_SUP_NIV1	= 10;																//Constante de fin du random du niveau superieur niveau 1
		final	int		I_MIN_SUP_NIV2	= 1;																//Constante de depart du random du niveau superieur niveau 2
		final	int		I_MAX_SUP_NIV2	= 20;																//Constante de fin du random du niveau superieur niveau 2
		final	int		I_MIN_SUP_NIV3	= 1;																//Constante de départ du random du niveau superieur niveau 3
		final	int		I_MAX_SUP_NIV3	= 40;																//Constante de fin du random du niveau superieur niveau 3
		final	int		I_CTR_MAX		= 3;																//Nombre maximum de niveau du jeu supérieur
		
				int		iMenu 			= 0;
				String	strMenu[] 		= {"Prédéfini", "Personnalisé", "Supérieur", "Meilleur score", "Quitter"};
				
				String	strPredef;																			//String pour pouvoir indiquer les limites
				String	strScore		= " ";																//String pour pouvoir afficher le meilleur score.
				String	strScorePredef	= " ";
				String	strScorePerso	= " ";
				String	strScoreSup1	= " ";
				String	strScoreSup2	= " ";
				String	strScoreSup3	= " ";
				String	strScoreSupTot	= " ";
				String	strScoreTot		= " ";
				
				int		iNbr;																				//Nombre généré par le programme
				int		iRep;																				//Nombre de l'utilisateur
				int		iEss			= 0;																//Compteur du nombre d'essaie pour trouver la réponse
				int		iEssTot			= 0;																//Compteur des essaies total de l'utilisateur
				int		iLimMin			= 0;																//Limite minimum décidé par l'utilisateur
				int		iLimMax			= 0;																//Limite maximum décidé par l'utilisateur
				int		iRepSup			= 0;																//Variable pour stocker la réponse supérieure précédante
				int		iRepInf			= 0;																//Variable pour stocker la réponse inférieure précédante
				int		iParti			= 0;																//Nombre de parti
				int		iScorePredef	= Integer.MAX_VALUE;
				int		iScorePerso		= Integer.MAX_VALUE;
				int		iScoreSup1		= Integer.MAX_VALUE;
				int		iScoreSup2		= Integer.MAX_VALUE;
				int		iScoreSup3		= Integer.MAX_VALUE;
				int		iScoreSupTot	= Integer.MAX_VALUE;
				int		iScoreTot		= Integer.MAX_VALUE;
				
				boolean	bReDo			= true;																//Pour faire recommencer la boucle
				boolean	bQuit			= true;																//Pour permettre de sortir du jeu
				boolean	bPremiereFois	= true;																//Pour permettre de différentier les limites dans le jeu personalisé
		
		do {
			iEss	= 0;
			bReDo	= true;
			iMenu 	= JOptionPane.showOptionDialog(	null, 
													"Sélectionnez une catégorie.", 
													"Jeu de devinette", 
													JOptionPane.YES_NO_OPTION, 
													JOptionPane.PLAIN_MESSAGE, 
													null, 
													strMenu, 
													strMenu[0]);
			
			switch (iMenu)
			{
			case 0: 
					iParti++;
					iNbr 		= I_MIN_PREDEF + (int) (Math.random() * I_MAX_PREDEF);
					
					
					while (bReDo)
						{
							iEss++;
							strPredef	= JOptionPane.showInputDialog(	null,
																		"Entrez un nombre entier.",
																		"Nombre entre 1 et 10 inclus.");
							iRep		= Integer.parseInt(strPredef);
							
							if (iRep < iNbr)
								JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand.");
							else if (iRep > iNbr)
								JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit.");
							else
								{
									JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré");
									bReDo = false;
								}
						}
					if (iEss < iScorePredef)
						{
							iScorePredef	= iEss;
						}
					if (iEss < iScoreTot)
						{
							iScoreTot		= iEss;
						}
					JOptionPane.showMessageDialog(null, "Vous avez trouvé le nombre en " + iEss + " essaies.");
					
					break;
			case 1: 
					iParti++;
					iLimMin			= Integer.parseInt(JOptionPane.showInputDialog(	null, 
																					"Entrez la limite minimum.", 
																					"Entrez un nombre entier."));
					iLimMax			= Integer.parseInt(JOptionPane.showInputDialog(	null, 
																					"Entrez la limite maximum.", 
																					"Entrez un nombre entier."));
					iNbr 			= iLimMin + (int) (Math.random() * iLimMax);
					bPremiereFois	= true;
					
					
					while (bReDo)
						{
							iEss++;
							strPredef	= JOptionPane.showInputDialog(	null,
																		"Entrez un nombre entier.",
																		"Nombre compris dans les limites.");
							iRep		= Integer.parseInt(strPredef);
							
							if (bPremiereFois)
								if (iRep < iNbr)
									{
										JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand. Soit entre " + iRep + " et " + iLimMax);
										iRepSup			= iLimMax;
										iRepInf 		= iRep;
										bPremiereFois	= false;
										
									}
								else if (iRep > iNbr)
									{
										JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit. Soit entre " + iLimMin + " et " + iRep);
										iRepSup 		= iRep;
										iRepInf 		= iLimMin;
										bPremiereFois 	= false;
									}
								else
									{
										JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré");
										bReDo 			= false;
										bPremiereFois 	= false;
									}
							else
								{
									if (iRep < iNbr)
										{
											if (iRep > iRepInf)
												{
													JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand. Soit entre " + iRep + " et " + iRepSup);
													iRepInf 		= iRep;
												}
											else
												{
													JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand. Soit entre " + iRepInf + " et " + iRepSup);
												}
										}
											
									else if (iRep > iNbr)
										{
											if (iRep < iRepSup)
												{
													JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit. Soit entre " + iRepInf + " et " + iRep);
													iRepSup 		= iRep;
												}
											else
												{
													JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit. Soit entre " + iRepInf + " et " + iRepSup);
												}
										}
									else
										{
											JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré");
											bReDo 			= false;
										}
								}
						}
					if (iEss < iScorePerso)
					{
						iScorePerso	= iEss;
					}
				if (iEss < iScoreTot)
					{
						iScoreTot		= iEss;
					}
					JOptionPane.showMessageDialog(null, "Vous avez trouvé le nombre en " + iEss + " essaies.");
									
					break;
			case 2:
					iParti++;
					for (int iCtr = 1 ; iCtr <= I_CTR_MAX ; iCtr++)
						{
							if (iCtr == 1)
								iNbr 		= I_MIN_SUP_NIV1 + (int) (Math.random() * I_MAX_SUP_NIV1);
							else if (iCtr == 2)
								iNbr 		= I_MIN_SUP_NIV2 + (int) (Math.random() * I_MAX_SUP_NIV2);
							else
								iNbr 		= I_MIN_SUP_NIV3 + (int) (Math.random() * I_MAX_SUP_NIV3);
							
							iEss = 0;
							bReDo = true;
							
							while (bReDo)
								{
									iEss++;
									if (iCtr == 1)
										strPredef	= JOptionPane.showInputDialog(	null,
																					"Entrez un nombre entier.",
																					"Nombre entre 1 et 10 inclus.");
									else if (iCtr == 2)
										strPredef	= JOptionPane.showInputDialog(	null,
																					"Entrez un nombre entier.",
																					"Nombre entre 1 et 20 inclus.");
									else
										strPredef	= JOptionPane.showInputDialog(	null,
																					"Entrez un nombre entier.",
																					"Nombre entre 1 et 40 inclus.");
									
									iRep = Integer.parseInt(strPredef);
									
									if (iRep < iNbr)
										JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand.");
									else if (iRep > iNbr)
										JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit.");
									else
										{
											JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré");
											bReDo = false;
										}
								}
							if (iCtr == 1)
								if (iEss < iScoreSup1)
									{
										iScoreSup1	= iEss;
									}
							if (iCtr == 2)
								if (iEss < iScoreSup2)
									{
										iScoreSup2	= iEss;
									}
							if (iCtr == 3)
								if (iEss < iScoreSup3)
									{
										iScoreSup3	= iEss;
									}
							if (iEss < iScoreTot)
								{
									iScoreTot		= iEss;
								}
							JOptionPane.showMessageDialog(null, "Vous avez trouvé le nombre en " + iEss + " essaies.");
							
							iEssTot += iEss;
						}
					
					if (iEssTot < iScoreSupTot)
						{
						iScoreSupTot		= iEssTot;
						}
						
					JOptionPane.showMessageDialog(null, "Vous avez réussie les 3 niveau en " + iEssTot + " essaies.");
				
					break;
			case 3:
					if (iScorePredef == Integer.MAX_VALUE)
						strScorePredef	= "\nPrédéfini: Non-jouer";
					else
						strScorePredef	= "\nPrédéfini: " + iScorePredef + " essaies";
					
					if (iScorePerso == Integer.MAX_VALUE)
						strScorePerso	= "\nPersonalisé: Non-jouer";
					else
						strScorePerso	= "\nPersonalisé: " + iScorePerso + " essaies";
					
					if (iScoreSup1 == Integer.MAX_VALUE)
						strScoreSup1	= "\nSupérieur Niveau 1: Non-jouer";
					else
						strScoreSup1	= "\nSupérieur Niveau 1: " + iScoreSup1 + " essaies";
					
					if (iScoreSup2 == Integer.MAX_VALUE)
						strScoreSup2	= "\nSupérieur Niveau 2: Non-jouer";
					else
						strScoreSup2	= "\nSupérieur Niveau 2: " + iScoreSup2 + " essaies";
					
					if (iScoreSup3 == Integer.MAX_VALUE)
						strScoreSup3	= "\nSupérieur Niveau 3: Non-jouer";
					else
						strScoreSup3	= "\nSupérieur Niveau 3: " + iScoreSup3 + " essaies";
					
					if (iScoreSupTot == Integer.MAX_VALUE)
						strScoreSupTot	= "\nSupérieur Total: Non-jouer";
					else
						strScoreSupTot	= "\nSupérieur Total: " + iScoreSupTot + " essaies";
					
					if (iScoreTot == Integer.MAX_VALUE)
						strScoreTot		= "\nDans l'ensemble: Non-jouer";
					else
						strScoreTot		= "\nDans l'ensemble: " + iScoreTot + " essaies";
				
					strScore		= "Meilleur score:";
					strScore		+= strScorePredef;
					strScore		+= strScorePerso;
					strScore		+= strScoreSup1;
					strScore		+= strScoreSup2;
					strScore		+= strScoreSup3;
					strScore		+= strScoreSupTot;
					strScore		+= strScoreTot;
					
					JOptionPane.showMessageDialog(null, strScore);
					break;
			case 4:
					JOptionPane.showMessageDialog(null, "Vous avez joué " + iParti + " parties.");
					bQuit = false;
					break;
			}
			
		} while (bQuit);

	}

}
