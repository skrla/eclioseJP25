package zadaci;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));

		for (int i = 2; i < x; i = i + 2) {
			if ((i + 2) >= x) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}
