package pkExamen2;

import java.text.DecimalFormat;

public class Examen2No2 
{

	public static void main(String[] args) 
	{
		final	int		NBR_ETAGE			= 5;
		final	int		NBR_TYPE_CONDO		= 3;
		final	int		CONDO_3_CHAMBRES	= 2;
		final	double	FRAIS_SUP_CHAMBRE_1	= 200;
		final	double	AUGMENTATION_ETA_1	= 50;
		final	double	AUGMENTATION_AUTRE	= 1.1;
		
				String	strAffichage		= "";
					
				double	dCoutBase[][]		= {	{350, 435, 390},
												{400, 480, 440},
												{475, 430, 575},
												{700, 650, 600},
												{1000, 1175, 1150}};
				
				double	dFraisSup[][]		= new double[NBR_ETAGE][NBR_TYPE_CONDO];
				double	dCoutTot[][]		= new double[NBR_ETAGE][NBR_TYPE_CONDO];
				double	dCoutTotMin			= Double.MAX_VALUE;
				double	dCoutMin			= 0;
				double	dFraisMin			= 0;
				double	dMoyEtage			= 0;
				double	dCout3ChambresMax	= 0;
				
				int		iLigne				= 0;
				int		iCol				= 0;
				int		iLigneMin			= 0;
				int		iColMin				= 0;
				int		iLigne3ChambreMax	= 0;
				
				boolean	bPremiereFois		= true;
				
		DecimalFormat   zerochiffre         = new  DecimalFormat("0");
		
		strAffichage	+= "Cout de base des condos\n";
		strAffichage	+= "*************************************\n";
		
		for(iLigne = 0 ; iLigne < dCoutBase.length ; iLigne++)
		{
			for (iCol = 0 ; iCol < dCoutBase[iLigne].length ; iCol++)
				strAffichage += zerochiffre.format(dCoutBase[iLigne][iCol]) + "    ";
			
			strAffichage += "\n";
		}
		
		strAffichage	+= "\nFrais supplémentaires des condos\n";
		strAffichage	+= "*************************************************\n";
		
		for(iLigne = 0 ; iLigne < dFraisSup.length ; iLigne++)
		{
			for (iCol = 0 ; iCol < dFraisSup[iLigne].length ; iCol++)
			{
				if(bPremiereFois)
				{
					dFraisSup[iLigne][iCol] = FRAIS_SUP_CHAMBRE_1;
					strAffichage 			+= zerochiffre.format(dFraisSup[iLigne][iCol]) + "    ";
					bPremiereFois			= false;
					continue;
				}
				
				if(iLigne == 0)
				{
					dFraisSup[iLigne][iCol] = dFraisSup[iLigne][iCol - 1] + AUGMENTATION_ETA_1;
					strAffichage 			+= zerochiffre.format(dFraisSup[iLigne][iCol]) + "    ";
				}
				else
				{
					dFraisSup[iLigne][iCol] = (dFraisSup[iLigne - 1][iCol] * AUGMENTATION_AUTRE);
					strAffichage 			+= zerochiffre.format(dFraisSup[iLigne][iCol]) + "    ";
				}
			}
			
			strAffichage += "\n";
		}
		
		strAffichage	+= "\nCout total mensuel des condos\n";
		strAffichage	+= "*************************************************\n";
		
		for(iLigne = 0 ; iLigne < dCoutTot.length ; iLigne++)
		{
			for (iCol = 0 ; iCol < dCoutTot[iLigne].length ; iCol++)
			{
				dCoutTot[iLigne][iCol]	= dCoutBase[iLigne][iCol] + dFraisSup[iLigne][iCol];
				strAffichage 			+= zerochiffre.format(dCoutTot[iLigne][iCol]) + "    ";
				
				if(dCoutTot[iLigne][iCol] < dCoutTotMin)
				{
					dCoutTotMin = dCoutTot[iLigne][iCol];
					iLigneMin	= iLigne + 1;
					iColMin		= iCol + 1;
					dCoutMin	= dCoutBase[iLigne][iCol];
					dFraisMin	= dFraisSup[iLigne][iCol];
				}
			}
			
			strAffichage += "\n";
		}
		
		strAffichage	+= "\nCondo le moins dispendieux de tous\n";
		strAffichage	+= "*************************************************\n";
		strAffichage	+= "Le condo le moins dispendieux est à l'étage " + iLigneMin + " et a " + iColMin + " chambres\n";
		strAffichage	+= "Son cout de base est de " + zerochiffre.format(dCoutMin) + "$\n";
		strAffichage	+= "Ses frais supplémentaires sont de " + zerochiffre.format(dFraisMin) + "$\n";
		strAffichage	+= "Pour un montant total de " + zerochiffre.format(dCoutTotMin) + "$\n";
		
		strAffichage	+= "\nCout moyen des condos par étage\n";
		strAffichage	+= "*************************************************\n";
		
		for(iLigne = 0 ; iLigne < dCoutTot.length ; iLigne++)
		{
			dMoyEtage = 0;
			
			for (iCol = 0 ; iCol < dCoutTot[iLigne].length ; iCol++)
				dMoyEtage += dCoutTot[iLigne][iCol];
			
			dMoyEtage 		/= dCoutTot[iLigne].length;

			strAffichage 	+= "Le cout moyen des condos pour l'étage " + (iLigne + 1) + " est de " + zerochiffre.format(dMoyEtage) +"$\n";
			
			if(dCoutTot[iLigne][CONDO_3_CHAMBRES] > dCout3ChambresMax)
			{
				dCout3ChambresMax	= dCoutTot[iLigne][CONDO_3_CHAMBRES];
				iLigne3ChambreMax	= iLigne + 1;
			}
		}
		
		strAffichage	+= "\nCondos le plus dispendieux ayant 3 chambres\n";
		strAffichage	+= "*************************************************\n";
		strAffichage	+= "Le condo le plus dispendieux ayant 3 chambres est à l'étage " + iLigne3ChambreMax;
		
		
		System.out.println(strAffichage);
		
		System.exit(0);
		
		/*Cout de base des condos
		*************************************
		350    435    390    
		400    480    440    
		475    430    575    
		700    650    600    
		1000    1175    1150    
		
		Frais supplémentaires des condos
		*************************************************
		200    250    300    
		220    275    330    
		242    302    363    
		266    333    399    
		293    366    439    
		
		Cout total mensuel des condos
		*************************************************
		550    685    690    
		620    755    770    
		717    732    938    
		966    983    999    
		1293    1541    1589    
		
		Condo le moins dispendieux de tous
		*************************************************
		Le condo le moins dispendieux est à l'étage 1 et a 1 chambres
		Son cout de base est de 350$
		Ses frais supplémentaires sont de 200$
		Pour un montant total de 550$
		
		Cout moyen des condos par étage
		*************************************************
		Le cout moyen des condos pour l'étage 1 est de 642$
		Le cout moyen des condos pour l'étage 2 est de 715$
		Le cout moyen des condos pour l'étage 3 est de 796$
		Le cout moyen des condos pour l'étage 4 est de 983$
		Le cout moyen des condos pour l'étage 5 est de 1474$
		
		Condos le plus dispendieux ayant 3 chambres
		*************************************************
		Le condo le plus dispendieux ayant 3 chambres est à l'étage 5*/

	}

}
