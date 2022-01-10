package zadaci;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));

		if (x > y) {
			ispis(x, y);
		} else {
			ispis(y, x);
		}
	}
	
	static void ispis(int x, int y) {
		for (int i = y + 1; i < x; i++) {
			System.out.println(i);
		}
	}

}
