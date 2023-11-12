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
		
				String	strDep;						//Num�ro de departement
				String	strNbrEtu;					//Nombre d'�tudiant
				String	strPrixBillet;				//Prix du billet
				String	strMessage = " ";			//Message � la fin du programme
				
				double 	dNbrEtu;					//Conversion du nombre d'�tudiant
				double 	dPrixBillet;				//Conversion du prix du billet
				
				double	dCoutTrait;					//Pour calculer le cout du traiteur
				double	dVente;						//Pour calculer les ventes de billet
				double	dProfit;					//Pour calculer le profit ou perte
				
		NumberFormat 	signedollard 	= NumberFormat.getCurrencyInstance();
		DecimalFormat	zero			= new DecimalFormat("0");
		
		strDep 			= JOptionPane.showInputDialog("Entrez le nom du d�partement.");
		strNbrEtu 		= JOptionPane.showInputDialog("Entrez le nombre d'�l�ve participant.");
		strPrixBillet 	= JOptionPane.showInputDialog("Entrez le prix du billet que vous allez charger au �l�ve.");
		dNbrEtu			= Double.parseDouble(strNbrEtu);
		dPrixBillet		= Double.parseDouble(strPrixBillet);
		
		if (dNbrEtu <= D_QTE_1)
			{
				dCoutTrait 	= (dNbrEtu * D_COUT_1);
				dVente		= (dNbrEtu * dPrixBillet);
				dProfit		= dVente - dCoutTrait;
				
				if (dProfit >= 0)
					{
						strMessage += "\nConcernant le souper de la rentr�e pour les �tudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " �tudiants qui ont particip� au souper.";
						strMessage += "\nLe prix du billet �tait de " + signedollard.format(dPrixBillet) + " par �tudiant.";
						strMessage += "\nLe co�t pour le traiteur �tait de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a �t� de " + signedollard.format(dVente);
						strMessage += "\nLe comit� a donc r�alis� un profit de " + signedollard.format(dProfit) + " pour cette belle activit�. F�licitations.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
				
				else
					{
						dProfit *= D_CONV_POS;
						strMessage += "\nConcernant le souper de la rentr�e pour les �tudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " �tudiants qui ont particip� au souper.";
						strMessage += "\nLe prix du billet �tait de " + signedollard.format(dPrixBillet) + " par �tudiant.";
						strMessage += "\nLe co�t pour le traiteur �tait de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a �t� de " + signedollard.format(dVente);
						strMessage += "\nLe comit� a donc r�alis� une perte de " + signedollard.format(dProfit) + " pour le souper. On se reprend.";
						
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
						strMessage += "\nConcernant le souper de la rentr�e pour les �tudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " �tudiants qui ont particip� au souper.";
						strMessage += "\nLe prix du billet �tait de " + signedollard.format(dPrixBillet) + " par �tudiant.";
						strMessage += "\nLe co�t pour le traiteur �tait de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a �t� de " + signedollard.format(dVente);
						strMessage += "\nLe comit� a donc r�alis� un profit de " + signedollard.format(dProfit) + " pour cette belle activit�. F�licitations.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
				
				else
					{
						dProfit *= D_CONV_POS;
						strMessage += "\nConcernant le souper de la rentr�e pour les �tudiants en " + strDep;
						strMessage += "\nMerci pour les " + zero.format(dNbrEtu) + " �tudiants qui ont particip� au souper.";
						strMessage += "\nLe prix du billet �tait de " + signedollard.format(dPrixBillet) + " par �tudiant.";
						strMessage += "\nLe co�t pour le traiteur �tait de " + signedollard.format(dCoutTrait);
						strMessage += "\nLe total des ventes pour le souper a �t� de " + signedollard.format(dVente);
						strMessage += "\nLe comit� a donc r�alis� une perte de " + signedollard.format(dProfit) + " pour le souper. On se reprend.";
						
						JOptionPane.showMessageDialog(null, strMessage);
					}
			}
		

	}

}
