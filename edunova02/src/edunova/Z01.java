package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		
		System.out.println((Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj")) + Integer.parseInt(JOptionPane.showInputDialog("Upišite cijeli broj"))) % 2 == 0 ? "Osijek" : "Zagreb");
	}
}
