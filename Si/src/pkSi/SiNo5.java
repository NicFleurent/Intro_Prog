package pkSi;

import javax.swing.*;
import java.text.*;

public class SiNo5 
{

	public static void main(String[] args) 
	{	
		final	double	D_QTE_1		= 50;			//Nombre de repas du premier pallier
		final	double	D_COUT_1	= 15;			//Frais du premier pallier de repas
		final	double	D_COUT_2	= 12;			//Frais du deuxime pallier de repas
		final	double	D_CONV_POS	= -1;			//constante pour convertir les pertes en nombre positif pour l'affichage
		
				String	strDep;						//Numéro de departement
				String	strNbrEtu;					//Nombre d'étudiant
				String	strPrixBillet;				//Prix du billet
				String	strMessage = " ";			//Message à la fin du programme
				
				double 	dNbrEtu;					//Conversion du nombre d'étudiant
				double 	dPrixBillet;				//Conversion du prix du billet
				
				double	dCoutTrait;					//Pour calculer le cout du traiteur
				double	dVente;						//Pour calculer les ventes de billet
				double	dProfit;					//Pour calculer le profit ou perte
				
		NumberFormat 	signedollard 	= NumberFormat.getCurrencyInstance();
		DecimalFormat	zero			= new DecimalFormat("0");
		
		strDep 			= JOptionPane.showInputDialog("Entrez le nom du département.");
		strNbrEtu 		= JOptionPane.showInputDialog("Entrez le nombre d'élève participant.");
		strPrixBillet 	= JOptionPane.showInputDialog("Entrez le prix du billet que vous allez charger au élève.");
		dNbrEtu			= Double.parseDouble(strNbrEtu);
		dPrixBillet		= Double.parseDouble(strPrixBillet);
		
		if (dNbrEtu <= D_QTE_1)
			{
				dCoutTrait 	= (dNbrEtu * D_COUT_1);
				dVente		= (dNbrEtu * dPrixBillet);
				dProfit		= dVente - dCoutTrait;
				
				if (dProfit >= 0)
					{
						strMessage += "\nConcernant le souper de la rentrée pour les étudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " étudiants qui ont participé au souper.";
						strMessage += "\nLe prix du billet était de " + signedollard.format(dPrixBillet) + " par étudiant.";
						strMessage += "\nLe coût pour le traiteur était de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a été de " + signedollard.format(dVente);
						strMessage += "\nLe comité a donc réalisé un profit de " + signedollard.format(dProfit) + " pour cette belle activité. Félicitations.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
				
				else
					{
						dProfit *= D_CONV_POS;
						strMessage += "\nConcernant le souper de la rentrée pour les étudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " étudiants qui ont participé au souper.";
						strMessage += "\nLe prix du billet était de " + signedollard.format(dPrixBillet) + " par étudiant.";
						strMessage += "\nLe coût pour le traiteur était de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a été de " + signedollard.format(dVente);
						strMessage += "\nLe comité a donc réalisé une perte de " + signedollard.format(dProfit) + " pour le souper. On se reprend.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
			}
		
		else
			{
				dCoutTrait 	= (D_QTE_1 * D_COUT_1) + ((dNbrEtu - D_QTE_1) * D_COUT_2);
				dVente		= (dNbrEtu * dPrixBillet);
				dProfit		= dVente - dCoutTrait;
				
				if (dProfit >= 0)
					{
						strMessage += "\nConcernant le souper de la rentrée pour les étudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " étudiants qui ont participé au souper.";
						strMessage += "\nLe prix du billet était de " + signedollard.format(dPrixBillet) + " par étudiant.";
						strMessage += "\nLe coût pour le traiteur était de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a été de " + signedollard.format(dVente);
						strMessage += "\nLe comité a donc réalisé un profit de " + signedollard.format(dProfit) + " pour cette belle activité. Félicitations.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
				
				else
					{
						dProfit *= D_CONV_POS;
						strMessage += "\nConcernant le souper de la rentrée pour les étudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " étudiants qui ont participé au souper.";
						strMessage += "\nLe prix du billet était de " + signedollard.format(dPrixBillet) + " par étudiant.";
						strMessage += "\nLe coût pour le traiteur était de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a été de " + signedollard.format(dVente);
						strMessage += "\nLe comité a donc réalisé une perte de " + signedollard.format(dProfit) + " pour le souper. On se reprend.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
			}
		

	}

}
