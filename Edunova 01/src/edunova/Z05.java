package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		char a;
		
		a = JOptionPane.showInputDialog("Unesite cijeli broj između 10 i 20").charAt(1);
		
		System.out.println(a);
	}
}
