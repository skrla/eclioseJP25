package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		boolean t = Boolean.parseBoolean(JOptionPane.showInputDialog("Unesi logičku vrijednost"));
		boolean f = Boolean.parseBoolean(JOptionPane.showInputDialog("Unesi logičku vrijednost"));
		
		System.out.println(t && f ? "DA" : "");
	}
}

