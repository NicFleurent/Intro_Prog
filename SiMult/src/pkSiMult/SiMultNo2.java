package pkSiMult;

import javax.swing.*;
import java.text.*;

public class SiMultNo2 
{

	public static void main(String[] args) 
	{
		final	double			D_TARIF_1 	= 0.05;			//Tarif 1er palier
		final	double			D_TARIF_2 	= 0.04;			//Tarif 2e palier
		final	double			D_TARIF_3 	= 0.03;			//Tarif 3e palier
		final	double			D_NBR_1 	= 500;			//Nombre de feuille pour sortir du 1er palier
		final	double			D_NBR_2 	= 1000;			//Nombre de feuille pour sortir du 2e palier
		final	double			D_BROCHE	= 0.02;			//Tarif pour copie broch�e
		final	double			D_TROU		= 0.03;			//Tarif pour feuille trou�e
		final	double			D_MEMBRE	= 5;			//Rabais pour membre
		final	double			D_LIV		= 10;			//Tarif pour livraison
		
				String 			strNbrFeuil;				//Import du nombre de feuilles
				String 			strNbrCopie;				//Import du nombre de copies
				String			strBroche;					//Pour question pour broch�
				String			strTrou;					//Pour question pour trou
				String			strMembre;					//Pour question pour membre
				String			strDelai;					//Pour question pour d�lai
				
				double			dNbrFeuil;					//Conversion nombre feuille
				double			dNbrCopie;					//Conversion nombre copie
				double			dCoutFeuil = 0;				//Calcul cout des feuilles
				
				char			cBroche;					//Conversion broche
				char			cTrou;						//Conversion broche
				char			cMembre;					//Conversion broche
				char			cDelai;						//Conversion broche
				
				NumberFormat	dollar 		= NumberFormat.getCurrencyInstance();
				
		strNbrFeuil = JOptionPane.showInputDialog("Entrez le nombre de feuille du document.");
		strNbrCopie = JOptionPane.showInputDialog("Entrez le nombre de copie d�sir� du document");
		strBroche 	= JOptionPane.showInputDialog("Est-ce que vous d�sir� un document broch�?");
		strTrou 	= JOptionPane.showInputDialog("Est-ce que vous d�sir� un document trou�?");
		strMembre 	= JOptionPane.showInputDialog("Est-ce que vous �tes membre?");
		strDelai 	= JOptionPane.showInputDialog("D�sir� vous que le document vous soit livr� dans un d�lai de 24h? (Co�t de 10$ � pr�voir)");
		dNbrFeuil	= Double.parseDouble(strNbrFeuil);
		dNbrCopie	= Double.parseDouble(strNbrCopie);
		cBroche		= strBroche.charAt(0);
		cTrou		= strTrou.charAt(0);
		cMembre		= strMembre.charAt(0);
		cDelai		= strDelai.charAt(0);
		
		if (dNbrFeuil * dNbrCopie < D_NBR_1)
			dCoutFeuil = dNbrFeuil * dNbrCopie * D_TARIF_1;
		else if (dNbrFeuil * dNbrCopie < D_NBR_2)
			dCoutFeuil = dNbrFeuil * dNbrCopie * D_TARIF_2;
		else
			dCoutFeuil = dNbrFeuil * dNbrCopie * D_TARIF_3;
		
		if ((cBroche == 'O') || (cBroche == 'o'))
			dCoutFeuil += dNbrCopie * D_BROCHE;
		
		if ((cTrou == 'O') || (cTrou == 'o'))
			dCoutFeuil += dNbrFeuil * dNbrCopie * D_TROU;
		
		if ((cMembre == 'O') || (cMembre == 'o'))
			dCoutFeuil -= D_MEMBRE;
		
		if ((cDelai == 'O') || (cDelai == 'o'))
			dCoutFeuil += D_LIV;
		
		JOptionPane.showMessageDialog(null, "Co�t total: " + dollar.format(dCoutFeuil), "Facture", JOptionPane.PLAIN_MESSAGE);

	}

}
