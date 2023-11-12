package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo2 
{

	public static void main(String[] args) 
	{

		String strNbrHeure;			//Nombre d'heures travaillés au taux simple
		String strSalHoraire;		//Salaire Horaire
		String strNbrHeureSup;		//Nombre d'heure travaillé au taux supplémentaire
		String strTauxHeureSup;		//Taux de variation du salaire des heures supplémentaires
		
		double dNbrHeure;			//Conversion du nombre d'heure travaillé au taux simple
		double dSalHoraire;			//Conversion du salaire Horaire
		double dNbrHeureSup;		//Conversion du nombre d'heure travaillé au taux supplémentaire
		double dTauxHeureSup;		//Conversion du taux de variation du salaire des heures supplémentaires
		
		double dSalHebdoBase;		//Calcul du salaire hebdomadaire de base
		double dSalHebdoSup;		//Calcul du salaire hebdomadaire supplémentaire
		double dSalHebdoTotal;		//Calcul du salaire hebdomadaire total
		
		strNbrHeure 	= JOptionPane.showInputDialog("Entrez le nombre d'heure au salaire de base.");
		strSalHoraire 	= JOptionPane.showInputDialog("Entrez le salaire horaire.");
		strNbrHeureSup	= JOptionPane.showInputDialog("Entrez le nombre d'heure supplémentaire.");
		strTauxHeureSup	= JOptionPane.showInputDialog("Entrez le taux du salaire des heures supplémentaire.");
		dNbrHeure 		= Double.parseDouble(strNbrHeure);
		dSalHoraire	 	= Double.parseDouble(strSalHoraire);
		dNbrHeureSup 	= Double.parseDouble(strNbrHeureSup);
		dTauxHeureSup 	= Double.parseDouble(strTauxHeureSup);
		
		dSalHebdoBase 	= dNbrHeure * dSalHoraire;
		dSalHebdoSup 	= dNbrHeureSup * dSalHoraire * dTauxHeureSup;
		dSalHebdoTotal 	= dSalHebdoBase + dSalHebdoSup;
		
		JOptionPane.showMessageDialog(null, "La salaire de base est de: " + dSalHebdoBase + "$" + "\nLe salaire supplémentaire est de: " + dSalHebdoSup + "$" + 
											"\nLe salaire total est de: " + dSalHebdoTotal + "$", "Salaire Hebdomadaire", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
		
	}

}
