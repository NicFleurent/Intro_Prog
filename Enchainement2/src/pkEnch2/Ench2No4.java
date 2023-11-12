package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No4 
{

	public static void main(String[] args) 
	{
		
		final	double D_PI2_ROULEAU = 50;			//Nombre de rouleau à acheter
				
				String strHMur1;					//Hauteur du mur 1
				String strLMur1;					//Largeur du mur 1
				String strHMur2;					//Hauteur du mur 2
				String strLMur2;					//Largeur du mur 2
				
				double dHMur1;						//Conversion hauteur mur 1
				double dLMur1;						//Conversion largeur mur 1
				double dHMur2;						//Conversion hauteur mur 2
				double dLMur2;						//Conversion largeur mur 2
				
				double dAMur1;						//Aire du mur 1
				double dAMur2;						//Aire du mur 2
				double dAPiece;						//Aire de la pièce
				double dNbrRouleau;					//Nombre de rouleau à acheter
		
		DecimalFormat zeroChiffres = new DecimalFormat("0");
		
		strHMur1 		= JOptionPane.showInputDialog("Entrez la hauteur du premier mur (en pied).");
		strLMur1 		= JOptionPane.showInputDialog("Entrez la largeur du premier mur (en pied).");
		strHMur2 		= JOptionPane.showInputDialog("Entrez la hauteur du deuxième mur (en pied).");
		strLMur2 		= JOptionPane.showInputDialog("Entrez la largeur du deuxième mur (en pied).");
		dHMur1 			= Double.parseDouble(strHMur1);
		dLMur1 			= Double.parseDouble(strLMur1);
		dHMur2 			= Double.parseDouble(strHMur2);
		dLMur2 			= Double.parseDouble(strLMur2);
		
		dAMur1 			= dHMur1 * dLMur1;
		dAMur2 			= dHMur2 * dLMur2;
		dAPiece 		= (dAMur1 * 2) + (dAMur2 * 2);
		dNbrRouleau 	= Math.ceil(dAPiece / D_PI2_ROULEAU);
		
		JOptionPane.showMessageDialog(null, "Nombre de rouleaux de papier peint: " + zeroChiffres.format(dNbrRouleau) + " rouleaux");
		
		System.exit(0);

	}

}
