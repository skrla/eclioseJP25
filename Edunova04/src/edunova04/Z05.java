package edunova04;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		int[] niz = new int[5];
		int y = 0;
		
		for(int i = 0; i < 5; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
		}
		
		for(int x:niz){
			y += x;
			System.out.println(x);
		}
		
		System.out.println((double) y/niz.length);
	}
}
