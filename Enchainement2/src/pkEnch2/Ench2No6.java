package pkEnch2;

import javax.swing.JOptionPane;
import java.text.*;

public class Ench2No6 
{

	public static void main(String[] args) 
	{

		final 	double D_TRANCHE 		= 100;			//Salaire en lien avec les heures
		final 	double D_SAL_HEURE 		= 8;			//Salaire en lien avec les heures
		final	double D_PRIME_CIR 		= 4;			//Prime en lien avec le nombres de circulaires
				
				String strNbrHeure;						//Nombre d'heure
				String strNbrCir;						//Nombre de circulaires distribués
				
				double dNbrHeure;						//Conversion nombre d'heure
				double dNbrCir;							//Conversion nombre de circulaires distribuées
				double dSalCir;							//Salaire sur les primes en lein avec le nombre de circulaires
				double dSalTotal;						//Salaire Total
		
		NumberFormat signedollars = NumberFormat.getCurrencyInstance();
		
		strNbrHeure 	= JOptionPane.showInputDialog("Entrez le nombre d'heures.");
		strNbrCir 		= JOptionPane.showInputDialog("Entrez le nombre de circulaires distribuées.");
		dNbrHeure		= Double.parseDouble(strNbrHeure);
		dNbrCir			= Double.parseDouble(strNbrCir);
		
		dNbrHeure		*= D_SAL_HEURE;
		dSalCir			= Math.floor(dNbrCir/D_TRANCHE) * D_PRIME_CIR;
		dSalTotal		= dNbrHeure + dSalCir;
		
		String strPaye = " ";
		strPaye += "\nSalaire de base: " + signedollars.format(dNbrHeure);
		strPaye += "\nSalaire en extra: " + signedollars.format(dSalCir);
		strPaye += "\nSalaire total: " + signedollars.format(dSalTotal);
		
		JOptionPane.showMessageDialog(null, strPaye, "Détails de la paye", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
