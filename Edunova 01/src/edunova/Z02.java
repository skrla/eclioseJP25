package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		double duzina, sirina;
		
		duzina = Double.parseDouble(JOptionPane.showInputDialog("Unesite duzinu (Decimalni dio odvojiti točkom.)."));
		sirina = Double.parseDouble(JOptionPane.showInputDialog("Unesite sirinu (Decimalni dio odvojiti točkom.)."));
		
		
		System.out.println(duzina * sirina);
	}
	
	

}
