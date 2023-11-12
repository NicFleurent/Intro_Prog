package pkTantQue;

import javax.swing.*;
import java.text.*;

public class TantQueNo2 
{

	public static void main(String[] args) 
	{
		boolean	bErreur			= false;
		
		int		iMenu 			= 0;
		String	strMenu[] 		= {"D�pot", "Retrait", "Facture", "Solde", "Terminer"};
		
		double	dTransac		= 0;
		double	dSolde 			= 0;
		
		NumberFormat signedollars = NumberFormat.getCurrencyInstance();
		
		do {
			bErreur = false;
			
			iMenu = JOptionPane.showOptionDialog(
					null, 
					"S�lectionnez l'op�ration que vous voulez affectuer dans votre compte.", 
					"Compte de banque", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null, 
					strMenu, 
					strMenu[0]);
			
			switch (iMenu)
			{
			case 0: 
					dTransac 			= Double.parseDouble(JOptionPane.showInputDialog("Quel montant souhaitez-vous d�poser?"));
					if(dTransac < 0)
						{
							JOptionPane.showMessageDialog(null, "Vous ne pouvez pas d�poser une somme n�gative. S.v.p. entrez un montant sup�rieur � 0.");
							bErreur = true;
						}
					else
						{
							dSolde			+= dTransac;
						}
					break;
			case 1: 
					dTransac 			= Double.parseDouble(JOptionPane.showInputDialog("Quel montant souhaitez-vous retirer?"));
					if (dTransac < 0)
						{
							JOptionPane.showMessageDialog(null, "Vous ne pouvez pas retirer une somme n�gative. S.v.p. entrez un montant sup�rieur � 0.");
							bErreur = true;
						}
					else if (dTransac > dSolde)
						{
							JOptionPane.showMessageDialog(null, "Vous ne pouvez pas retirer cette somme car elle est plus �lev� que le montant de votre solde");
							bErreur = true;
						}
					else
						{
							dSolde			-= dTransac;
						}
					break;
			case 2: 
					dTransac 			= Double.parseDouble(JOptionPane.showInputDialog("Quel de la facture que vous d�sirez payer?"));
					if (dTransac < 0)
						{
							JOptionPane.showMessageDialog(null, "Vous ne pouvez pas payer une somme n�gative. S.v.p. entrez un montant sup�rieur � 0.");
							bErreur = true;
						}
					else if (dTransac > dSolde)
						{
							JOptionPane.showMessageDialog(null, "Vous ne pouvez pas payer cette facture car elle est plus �lev� que que le montant de votre solde");
							bErreur = true;
						}
					else
						{
							dSolde			-= dTransac;
						}
					break;
			}
			
			if (iMenu != 4)
				if(iMenu != 3)
					if (bErreur)
						continue;	
					else
							JOptionPane.showMessageDialog(null, "Votre nouveau solde est de: " + signedollars.format(dSolde));
				else
					JOptionPane.showMessageDialog(null, "Votre solde est de: " + signedollars.format(dSolde));
			
		} while (iMenu != 4);
		
		System.exit(0);

	}

}
