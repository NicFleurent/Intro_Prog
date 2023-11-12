package pkPour;

import javax.swing.JOptionPane;

public class PourNo3 
{

	public static void main(String[] args) 
	{
		final	int		I_CTR_MAX 	= 5;		//Maximum des notes à entrer
		
		
				String	strNom;					//Nom des élèves
				String	strNote;				//Note des élèves
				String	strNomMax 	= " ";		//Nom de l'élève avec la meilleure note
				
				int		iNote;					//note des élèves
				int		iNoteMax 	= 0;		//Meilleure note
				int		iMoyenne	= 0;		//Moyenne des notes
		
		for(int iCtr = 1 ; iCtr <= I_CTR_MAX ; iCtr++)
			{
				strNom		= JOptionPane.showInputDialog("Entrez le nom de l'élève.");
				strNote		= JOptionPane.showInputDialog("Entrez la note de l'élève.");
				iNote		= Integer.parseInt(strNote);
				
				iMoyenne	+= iNote;
				
				if (iNote > iNoteMax)
				{
					iNoteMax	= iNote;
					strNomMax	= strNom;
				}
			}
		
		iMoyenne /= I_CTR_MAX;
		
		JOptionPane.showMessageDialog(null, "La moyenne des notes est " + iMoyenne + "% et l'élève avec la meilleure note est " + strNomMax + " avec " + iNoteMax + "%");
		
		System.exit(0);

	}

}
