package pkEnch;

import javax.swing.JOptionPane;

public class EnchNo1 
{

	public static void main(String[] args) 
	{
		String	strNote1;		//1ere note
		String	strNote2;		//2e note
		String	strNote3;		//3e note
		String	strNote4;		//4e note
		String	strNote5;		//5e note
		
		double	dNote1;			//Conversion de la 1ere note
		double	dNote2;			//Conversion de la 2e note
		double	dNote3;			//Conversion de la 3e note
		double	dNote4;			//Conversion de la 4e note
		double	dNote5;			//Conversion de la 5e note
		
		double	dSomme;			//Somme des notes
		double	dMoy;			//Moyenne des notes
		
		strNote1	= JOptionPane.showInputDialog("Entrez une note sur 100");
		strNote2 	= JOptionPane.showInputDialog("Entrez une note sur 100");
		strNote3 	= JOptionPane.showInputDialog("Entrez une note sur 100");
		strNote4 	= JOptionPane.showInputDialog("Entrez une note sur 100");
		strNote5 	= JOptionPane.showInputDialog("Entrez une note sur 100");
		dNote1 		= Double.parseDouble(strNote1);
		dNote2 		= Double.parseDouble(strNote2);
		dNote3 		= Double.parseDouble(strNote3);
		dNote4 		= Double.parseDouble(strNote4);
		dNote5 		= Double.parseDouble(strNote5);
		
		dSomme	= dNote1 + dNote2 + dNote3 + dNote4 + dNote5;
		dMoy 	= dSomme / 5;
		
		JOptionPane.showMessageDialog(null, "La moyenne est de: " + dMoy + "%", "Moyenne des notes", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
