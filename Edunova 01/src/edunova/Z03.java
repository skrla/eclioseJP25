package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		double sirina, duzina, visina;	
		
		sirina = Double.parseDouble(JOptionPane.showInputDialog("Unesi sirinu"));
		duzina = Double.parseDouble(JOptionPane.showInputDialog("Unesi duzina"));
		visina = Double.parseDouble(JOptionPane.showInputDialog("Unesi visina"));
		
		System.out.println(sirina * duzina * visina);
		
	}

}
