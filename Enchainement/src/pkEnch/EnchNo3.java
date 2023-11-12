package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo3 
{

	public static void main(String[] args) 
	{
		String strNbrHeure;			//Nombre d'heures travaillés
		String strSalHoraire;		//Salaire Horaire
		
		double dNbrHeure;			//Conversion du nombre d'heure travaillé au taux simple
		double dSalHoraire;			//Conversion du salaire Horaire
		
		double dNbrHeureBase = 35;	//Nombre d'heures payer au salaire de base
		double dTauxHeureSup = 1.5; //Taux de la variation du salaire des heures supplémentaires
		double dSalHebdoBase;		//Calcul du salaire hebdomadaire de base
		double dSalHebdoSup;		//Calcul du salaire hebdomadaire supplémentaire
		double dSalHebdoTotal;		//Calcul du salaire hebdomadaire total
		
		strNbrHeure 	= JOptionPane.showInputDialog("Entrez le nombre d'heures travaillés cette semaine.");
		strSalHoraire 	= JOptionPane.showInputDialog("Entrez le salaire horaire.");
		dNbrHeure 		= Double.parseDouble(strNbrHeure);
		dSalHoraire 	= Double.parseDouble(strSalHoraire);
		
		if (dNbrHeure <= 35)
		{
			dSalHebdoBase = dNbrHeure * dSalHoraire;
			dSalHebdoSup = 0;
			dSalHebdoTotal = dSalHebdoBase + dSalHebdoSup;
		} 
		else 
		{
			dSalHebdoBase = dNbrHeureBase * dSalHoraire;
			dSalHebdoSup = (dNbrHeure - dNbrHeureBase) * dSalHoraire * dTauxHeureSup;
			dSalHebdoTotal = dSalHebdoBase + dSalHebdoSup;
		}
		
		JOptionPane.showMessageDialog(null, "La salaire de base est de: " + dSalHebdoBase + "$" + "\nLe salaire supplémentaire est de: " + dSalHebdoSup + "$" + 
											"\nLe salaire total est de: " + dSalHebdoTotal + "$", "Salaire Hebdomadaire", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
