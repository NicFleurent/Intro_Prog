package pkSi;

import javax.swing.JOptionPane;

public class SiNo3 
{

	public static void main(String[] args) 
	{
		final 	double 	D_NOTE_PASS 	= 60;		//Constante de la note de passage
		final	double	D_POND_MANQ 	= 25;		//Pondération des points manquants
		
				String 	strExam1;					//Note premier examen
				String 	strExam2;					//Note deuxième examen
				String	strLab;						//Moyenne des notes des labs
				
				double	dExam1;						//Conversion note 1er examen
				double	dExam2;						//Conversion note 2e examen
				double	dLab;						//Conversion note lab
				
				double dNoteActu;					//Note actuelle
				
		strExam1 	= JOptionPane.showInputDialog("Entrez la note du 1er examen sur 25 points.");
		strExam2 	= JOptionPane.showInputDialog("Entrez la note du 2e examen sur 25 points.");
		strLab 		= JOptionPane.showInputDialog("Entrez la moyenne des notes pour les laboratoires sur 25 points.");
		dExam1 		= Double.parseDouble(strExam1);
		dExam2 		= Double.parseDouble(strExam2);
		dLab 		= Double.parseDouble(strLab);
		
		dNoteActu = (dExam1) + (dExam2) + (dLab);
		
		if (dNoteActu < D_NOTE_PASS - D_POND_MANQ)
			JOptionPane.showMessageDialog(null, "Désolé, vous ne pouvez passer le cours.");
		else if (dNoteActu < D_NOTE_PASS)
			JOptionPane.showMessageDialog(null, "Bravo, vous pouvez encore passer le cours.");
		else
			JOptionPane.showMessageDialog(null, "Félicitations, vous êtes assurés de passer le cours.");
		
		System.exit(0);

	}

}
