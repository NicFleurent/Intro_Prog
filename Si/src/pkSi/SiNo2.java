package pkSi;

import javax.swing.JOptionPane;
import java.text.*;

public class SiNo2 
{

	public static void main(String[] args) 
	{
		final	double	D_COUT_1	= 0.1;			//Cout des photocopies du 1er palier
		final	double	D_COUT_2	= 0.09;			//Cout des photocopies du 2e palier
		final	double	D_COUT_3	= 0.08;			//Cout des photocopies du 3e palier

		final	double	D_NBR_1		= 10;			//nombre de phototocopies du 1er palier
		final	double	D_NBR_2		= 30;			//nombre de phototocopies du 2e palier
		
				String	strNbrPhoto;				//Nombre de photocopies
				
				double	dNbrPhoto;					//Conversion nombre de photocopies
				
				double 	dCoutTotal;					//cout de l'impression
		
		NumberFormat signedollar = NumberFormat.getCurrencyInstance();
		
		strNbrPhoto = JOptionPane.showInputDialog("Entrez le nombre de photocopies.");
		dNbrPhoto 	= Double.parseDouble(strNbrPhoto);
		
		if (dNbrPhoto <= D_NBR_1)
			{
				dCoutTotal = dNbrPhoto * D_COUT_1;
				JOptionPane.showMessageDialog(null, "Le cout pour l'impression est de " + signedollar.format(dCoutTotal));
			}
		else if (dNbrPhoto <= D_NBR_2)
			{
				dCoutTotal = (D_NBR_1 * D_COUT_1) + ((dNbrPhoto - D_NBR_1) * D_COUT_2);
				JOptionPane.showMessageDialog(null, "Le cout pour l'impression est de " + signedollar.format(dCoutTotal));
			}
		else
			{
				dCoutTotal = (D_NBR_1 * D_COUT_1) + ((D_NBR_2 - D_NBR_1) * D_COUT_2) + ((dNbrPhoto - D_NBR_2) * D_COUT_3);
				JOptionPane.showMessageDialog(null, "Le cout pour l'impression est de " + signedollar.format(dCoutTotal));
			}
		
		System.exit(0);

	}

}
