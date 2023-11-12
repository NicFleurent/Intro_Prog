package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf5 
{

	public static void main(String[] args) 
	{
		String 	strSexe;						//Import du sexe
		char	cSexe;							//Conversion du sexe
		
		strSexe = JOptionPane.showInputDialog("Entrez votre sexe (M pour masculin et F pour féminin)");
		cSexe	= strSexe.charAt(0);
		
		if (cSexe == 'M')
			JOptionPane.showMessageDialog(null, "Masculin");
		
		else if (cSexe == 'F')
			JOptionPane.showMessageDialog(null, "Féminin");
		else

			JOptionPane.showMessageDialog(null, "Choix non valide");
		
		System.exit(0);

	}

}
