package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
	
		int x,y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj"));
		
		System.out.println((double)x / y);
	}

}
