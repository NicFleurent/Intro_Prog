package pkExerciceIf;

import javax.swing.JOptionPane;

public class ExerciceIf7 
{

	public static void main(String[] args) 
	{
		String	strNoDep;
		String 	strPavillon;
		String	strResultat = "Aucun D�partement";
		
		int		iNoDep;
		
		strNoDep 	= JOptionPane.showInputDialog("Entrez le num�ro de d�partement");
		strPavillon	= JOptionPane.showInputDialog("Entrez le nom du pavillon");
		iNoDep 		= Integer.parseInt(strNoDep);
		
		if (iNoDep >= 500)
			{
			if (strPavillon.equals("humanites"))
				{	
					strResultat = "524";
					System.out.println("Litt�ratures " + strResultat);
				}
			else System.out.println(strResultat);
					
			}
		
		else if (iNoDep >= 400)
			{
			if (strPavillon.equals("humanites"))
				{	
					strResultat = "200";
					System.out.println("Documentation " + strResultat);
				}
			else System.out.println(strResultat);
			}
		
		else  if (iNoDep >= 300)
			{
			if (strPavillon.equals("sciences"))
				{	
					strResultat = "180";
					System.out.println("Informatique " + strResultat);
				}
			else System.out.println(strResultat);
			}
		
		else  if (iNoDep >= 200)
			{
			if (strPavillon.equals("humanites"))
				{	
					strResultat = "388";
					System.out.println("Math�matique " + strResultat);
				}
			else System.out.println(strResultat);
			}
		
		else if (strPavillon.equals("humanites"))
				{	
					strResultat = "788";
					System.out.println("Histoire " + strResultat);
				}
		
		else System.out.println(strResultat);
		
		

	}

}
