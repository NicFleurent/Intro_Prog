package pkPour;

import javax.swing.JOptionPane;

public class PourNo4 
{

	public static void main(String[] args) 
	{
		int iNbrQte;							//Quantit� de nombre � calculer
		int iNbr 		= 0;					//Nombre entier
		int iNbrMin 	= Integer.MAX_VALUE;	//Nombre pour comparatif
		
		iNbrQte = Integer.parseInt(JOptionPane.showInputDialog("Entrez la quantit� de nombre entier que vous voulez comparer."));
		
		for (int iCtr = 1 ; iCtr <= iNbrQte ; iCtr++)
			{
				iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre entier � comparer"));
				
				if (iNbr <= iNbrMin)
					iNbrMin = iNbr;
			}
		
		JOptionPane.showMessageDialog(null, "Le nombre le plus petit est " + iNbrMin);
		
		System.exit(0);

	}

}
