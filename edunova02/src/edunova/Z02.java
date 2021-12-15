package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj"));

		if ((x < y) && (x < z)) {
			System.out.println(x);
		} else if (y < z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}
		
		System.out.println((x < y) && (x < z) ? x : (y < z ? y : z));
	}
}
