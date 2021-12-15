package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		int x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
		
		System.out.println(x / 2 == 0);
	}
}
