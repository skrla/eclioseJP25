package edunova04;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
		boolean n = true;
		
		for(int i = 2; i<x; i++) {
			if (x % i == 0) {
				n = false;
				break;
			}
		}
		
		System.out.println(x + " " + (n ? "je " : "nije ") + "prim broj");
		
		for (int y = 278; y < 24555; y++) {
			n = false;
			for (int u = 2; 2 < y; u++) {
				if (y % u == 0) {
					n = true;
					break;
				}
			}
			if(n) {
				System.out.println(y);
				}
		}
		
		
	}
}
