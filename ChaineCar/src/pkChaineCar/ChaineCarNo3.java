package pkChaineCar;

import javax.swing.JOptionPane;

public class ChaineCarNo3 
{

	public static void main(String[] args) 
	{
		final	int		I_MULTI	= 2;
		
				String	strNom;
				String	strNum;
				String	strNumClean;
				String	strNumMulti = " ";
				
				char	cNbr1, cNbr2, cNbr3, cNbr4, cNbr5, cNbr6, cNbr7, cNbr8, cNbr9;				//Nombre séparer du numéro
				
				int		iMulti;																		//Nombre pour la multiplication des nombre 2, 4, 6 et 8
				int		iLongMulti;																	//Nombre pour le switch
				int		iNbr1Add1, iNbr2Add1, iNbr3Add1, iNbr4Add1, iNbr5Add1;						//Nombre pour l'addition de la premiere partie
				int		iNbr1Add2, iNbr2Add2, iNbr3Add2, iNbr4Add2, iNbr5Add2;						//Nombre pour l'addition de la deuxieme partie
				int		iAdd1 = 0, iAdd2 = 0, iAddTot = 0;											//1er nombre pour l'addition final
				int		iContinu;																	
		
		do {
			
		strNom		= JOptionPane.showInputDialog("Entrez le nom de la personne.");
		strNum		= JOptionPane.showInputDialog(null, "Entrez le numéro d'assurance sociale à valider.", "XXX XXX XXX");
		
		strNumClean	= strNum.replaceAll(" ", "");
		
//------Décompose le nombre en chiffre individuel
		
		cNbr1 		= strNumClean.charAt(0);
		cNbr2 		= strNumClean.charAt(1);
		cNbr3 		= strNumClean.charAt(2);
		cNbr4 		= strNumClean.charAt(3);
		cNbr5 		= strNumClean.charAt(4);
		cNbr6 		= strNumClean.charAt(5);
		cNbr7 		= strNumClean.charAt(6);
		cNbr8 		= strNumClean.charAt(7);
		cNbr9 		= strNumClean.charAt(8);
		
//------Recréer le nombre pour pouvoir le multiplier
		
		strNumMulti	= "";
		strNumMulti	+= cNbr2 + "";
		strNumMulti	+= cNbr4 + "";
		strNumMulti	+= cNbr6 + "";
		strNumMulti	+= cNbr8 + "";
		
		iMulti		= Integer.parseInt(strNumMulti);
		iMulti		*= I_MULTI;
		
		strNumMulti	= iMulti + "";
		
//------Évalue la longueur et redécompose puis additionne les chiffres selon le résultat
		
		iLongMulti	= strNumMulti.length();
		
		switch (iLongMulti)
		{
		case 1:	
			iNbr1Add1 	= Character.getNumericValue(strNumMulti.charAt(0));
			iAdd1		= iNbr1Add1;
			break;
			
		case 2:	
			iNbr1Add1 	= Character.getNumericValue(strNumMulti.charAt(0));
			iNbr2Add1 	= Character.getNumericValue(strNumMulti.charAt(1));
			iAdd1		= iNbr1Add1 + iNbr2Add1;
			break;
			
		case 3:	
			iNbr1Add1 	= Character.getNumericValue(strNumMulti.charAt(0));
			iNbr2Add1 	= Character.getNumericValue(strNumMulti.charAt(1));
			iNbr3Add1 	= Character.getNumericValue(strNumMulti.charAt(2));
			iAdd1		= iNbr1Add1 + iNbr2Add1 + iNbr3Add1;
			break;
			
		case 4: 
			iNbr1Add1 	= Character.getNumericValue(strNumMulti.charAt(0));
			iNbr2Add1 	= Character.getNumericValue(strNumMulti.charAt(1));
			iNbr3Add1 	= Character.getNumericValue(strNumMulti.charAt(2));
			iNbr4Add1 	= Character.getNumericValue(strNumMulti.charAt(3));
			iAdd1		= iNbr1Add1 + iNbr2Add1 + iNbr3Add1 + iNbr4Add1;
			break;
		case 5:
			iNbr1Add1 	= Character.getNumericValue(strNumMulti.charAt(0));
			iNbr2Add1 	= Character.getNumericValue(strNumMulti.charAt(1));
			iNbr3Add1 	= Character.getNumericValue(strNumMulti.charAt(2));
			iNbr4Add1 	= Character.getNumericValue(strNumMulti.charAt(3));
			iNbr5Add1 	= Character.getNumericValue(strNumMulti.charAt(4));
			iAdd1		= iNbr1Add1 + iNbr2Add1 + iNbr3Add1 + iNbr4Add1 + iNbr5Add1;
			break;
		}
		
//------Additionne les autres chiffres pour avoir le deuxieme nombre à additioner
		
		iNbr1Add2 	= Character.getNumericValue(cNbr1);
		iNbr2Add2 	= Character.getNumericValue(cNbr3);
		iNbr3Add2 	= Character.getNumericValue(cNbr5);
		iNbr4Add2 	= Character.getNumericValue(cNbr7);
		iNbr5Add2 	= Character.getNumericValue(cNbr9);
		
		iAdd2 		= iNbr1Add2 + iNbr2Add2 + iNbr3Add2 + iNbr4Add2 + iNbr5Add2;

//------Addition finale
		
		iAddTot = iAdd1 + iAdd2;
		
//------Comparaison pour voir si le nombre fini par 0
		
		if (iAddTot % 10 == 0)
			JOptionPane.showMessageDialog(null, "Le numéro d'assurance sociale de " + strNom + " est valide.");
		else
			JOptionPane.showMessageDialog(null, "Le numéro d'assurance sociale de " + strNom + " est non-valide.");
		
//------Relance de la boucle par un bouton oui/non
		
		iContinu = JOptionPane.showConfirmDialog(	null, 
													"Désirez-vous valider un autre numéro?", 
													"Validation d'assurance sociale", 
													JOptionPane.YES_NO_OPTION);
		} while (iContinu == 0);
		
		System.exit(0);
		

	}

}
