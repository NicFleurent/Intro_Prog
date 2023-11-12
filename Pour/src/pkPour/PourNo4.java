package pkPour;

import javax.swing.JOptionPane;

public class PourNo4 
{

	public static void main(String[] args) 
	{
		int iNbrQte;							//Quantité de nombre à calculer
		int iNbr 		= 0;					//Nombre entier
		int iNbrMin 	= Integer.MAX_VALUE;	//Nombre pour comparatif
		
		iNbrQte = Integer.parseInt(JOptionPane.showInputDialog("Entrez la quantité de nombre entier que vous voulez comparer."));
		
		for (int iCtr = 1 ; iCtr <= iNbrQte ; iCtr++)
			{
				iNbr = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre entier à comparer"));
				
				if (iNbr <= iNbrMin)
					iNbrMin = iNbr;
			}
		
		JOptionPane.showMessageDialog(null, "Le nombre le plus petit est " + iNbrMin);
		
		System.exit(0);

	}

}
