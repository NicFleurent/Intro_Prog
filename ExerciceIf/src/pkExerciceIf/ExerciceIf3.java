package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf3 
{

	public static void main(String[] args) 
	{
		String 	strNbr;					//Import du nombre
		int 	iNbr;					//Couversion du nombre
		
		strNbr 	= JOptionPane.showInputDialog("Entrez le nombre entier.");
		iNbr 	= Integer.parseInt(strNbr);
		
		if (iNbr == 0)
			JOptionPane.showMessageDialog(null, "Le nombre " + iNbr + " équivaut à 0.");
		else if (iNbr >= 0)
			JOptionPane.showMessageDialog(null, "Le nombre " + iNbr + " est positif.");
		else
			JOptionPane.showMessageDialog(null, "Le nombre " + iNbr + " est negatif.");
		
		System.exit(0);
		

	}

}
