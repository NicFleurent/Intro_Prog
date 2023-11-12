package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf2 
{

	public static void main(String[] args) 
	{
		String	strNbr;
		int		iNbr;
		
		
		strNbr	=  JOptionPane.showInputDialog ( " Entrez un nombre entier " );
		iNbr    =  Integer.parseInt ( strNbr);


		if    (  iNbr % 2  ==  0  )
		        JOptionPane.showMessageDialog(null, "Le nombre " + "est pair.");
				//System.out.println " LE  NOMBRE " +  iNbr  +  "  EST  PAIR";
		else  JOptionPane.showMessageDialog(null, "Le nombre " + "est impair.");
		//System.out.println " LE  NOMBRE " + iNbr + "  EST IMPAIR";


	}

}
