package pkTab2DSup;

import javax.swing.*;
import java.text.*;

public class Tab2DSupNo1 
{

	public static void main(String[] args) 
	{
		final	int		PASSAGE		= 60;																			//Constante de la note de passage
		
				String	strNote;																					//Affichage des notes
				String	strInfo		= "";																			//Affichage des infos
				String	strMoy		= "";																			//Affichage des moyennes
				
				int		iNote[][]	= {	{77, 68, 86, 73},
										{96, 87, 89, 81},
										{70, 90, 86, 81}};															//Matrice des notes
				int		iNoteMin	= Integer.MAX_VALUE;															//Note minimale
				int		iNoteMax	= 0;																			//Note maximale
				int		iEtudiant	= 0;																			//Nombre d'�tudiant
				int		iReussi		= 0;																			//Nombre d'�tudiant ayant r�ussi
				int		iEchec		= 0;																			//Nombre d'�tudiant ayant �chouer
				
				double	dMoy		= 0;																			//Moyenne
		
		DecimalFormat	deux	= new DecimalFormat("0.00");
		
		strNote = "\t\t�tudiant 1\t�tudiant 2\t�tudiant 3\t�tudiant 4";
		
		for (int iLigne = 0 ; iLigne < iNote.length ; iLigne++)
		{
			switch (iLigne)
			{
			case 0: strNote += "\nNotes examen intra"; break;
			case 1: strNote += "\nNotes examen final"; break;
			case 2: strNote += "\nNotes examen synth�se"; break;
			}
			
			for(int iCol = 0 ; iCol < iNote[iLigne].length ; iCol++)
			{
				strNote += "\t" + iNote[iLigne][iCol];
				
				if(iNote[iLigne][iCol] < iNoteMin)
					iNoteMin = iNote[iLigne][iCol];
				
				if(iNote[iLigne][iCol] > iNoteMax)
					iNoteMax = iNote[iLigne][iCol];
			}
		}
		
		for (int iCol = 0 ; iCol < iNote[0].length ; iCol++) 
		{
			dMoy = 0;
			
			for(int iLigne = 0 ; iLigne < iNote.length ; iLigne++)
			{
				dMoy += iNote[iLigne][iCol];
			}
			
			dMoy /= iNote.length;
			
			if (dMoy >= PASSAGE)
				{
					strMoy	+= "\nLa moyenne des notes d'examens pour l'�tudiant " + (iCol + 1) + " est de:\t" + deux.format(dMoy) + "%\tR�USSI";
					iReussi++;
				}
			else
				{
					strMoy	+= "\nLa moyenne des notes d'examens pour l'�tudiant " + (iCol + 1) + " est de:\t" + deux.format(dMoy) + "%\t�CHEC";
					iEchec++;
				}
			
			iEtudiant++;
		}
		
		strInfo += "\n\nLa note la plus basse est de:\t\t\t" + iNoteMin;
		strInfo	+= "\nLa note la plus haute est de:\t\t\t" + iNoteMax;
		strInfo	+= "\n\nLe nombre d'�tudiants ayant un �chec:\t\t" + iEchec;
		strInfo	+= "\nLe nombre d'�tudiants ayant un r�ussis le cours:\t" + iReussi;
		strInfo	+= "\nLe nombre d'�tudiants:\t\t\t" + iEtudiant;
		
		
		
		JOptionPane.showMessageDialog(null, new JTextArea(strNote + strInfo + "\n" + strMoy));

	}

}
