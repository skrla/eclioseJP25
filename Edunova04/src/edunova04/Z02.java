package edunova04;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		
		System.out.println(JOptionPane.showInputDialog("Upišite cijeli broj").charAt(0));
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
		
		while(x >= 10) {
			x /= 10;
		}
	
		
		System.out.println(x);
		
		System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj")) % 10);
	}

}
