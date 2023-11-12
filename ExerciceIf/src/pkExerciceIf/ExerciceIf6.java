package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf6 
{

	public static void main(String[] args) 
	{
		final 	int 	I_ANNEE_COURANTE = 2014;			//Constante de l'année
		
				String 	strNaissance;						//Import année de naissance
				
				int		iNaissance;							//Conversion de l'année de naissance
				
				int		iAge;								//Variable calcul de l'age de la personne
				
		strNaissance 	= JOptionPane.showInputDialog("Entrez l'année de naissance.");
		iNaissance		= Integer.parseInt(strNaissance);
		
		iAge = I_ANNEE_COURANTE - iNaissance;
		
		if (iAge <= 3)
			JOptionPane.showMessageDialog(null, "C'est un bébé");
			
		else if (iAge <= 11)
			JOptionPane.showMessageDialog(null, "C'est un enfant");
				
			else if (iAge <= 17)
				JOptionPane.showMessageDialog(null, "C'est un adolescent");
					
				else if (iAge <= 64)
					JOptionPane.showMessageDialog(null, "C'est un adulte");
					
					else
						JOptionPane.showMessageDialog(null, "C'est une personne du 3ième âge");
				
		System.exit(0);

	}

}
