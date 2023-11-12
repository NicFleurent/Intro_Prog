package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf4 
{

	public static void main(String[] args) 
	{
		final 	int 	I_MIN = 10;				//Nombre minimal
		final 	int 	I_MAX = 100;			//Nombre maximal
				
				String 	strNbr;					//import nombre
				int		iNbr;					//Conversion nombre
				
		strNbr 	= JOptionPane.showInputDialog("Entrez un nombre entier entre 10 et 100 inclusivement ");
		iNbr	= Integer.parseInt(strNbr);
		
		if (iNbr >= I_MIN)//{
			if (iNbr <= I_MAX)
				JOptionPane.showMessageDialog(null, "Le nombre est valide.");
			else
				JOptionPane.showMessageDialog(null, "Le nombre n'est pas valide.");
			//}
		else
			JOptionPane.showMessageDialog(null, "Le nombre n'est pas valide.");
			
		System.exit(0);
		

	}

}
