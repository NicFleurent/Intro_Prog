package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf1 
{

	public static void main(String[] args) 
	{
		final	int		I_AGE_MAJ = 18;					//Age Majeure
				
				String	strAge;							//Variable de l'�ge
				int		iAge;							//Coversion de l'�ge
		
		strAge 	= JOptionPane.showInputDialog("Entrez l'�ge de la personne.");
		iAge	= Integer.parseInt(strAge);
		
		if (iAge >= I_AGE_MAJ)
			System.out.println("L'�ge de la personne majeure est " + iAge + " ans.");
		else
			System.out.println("L'�ge de la personne mineure est " + iAge + " ans.");
		
		//System.exit(0);			

	}

}
