package edunova03;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int[] x = { Integer.parseInt(JOptionPane.showInputDialog("Unesite broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesite broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesite broj")) };

		if (x[0] >= x[1] && x[0] >= x[2]) {
			System.out.println(x[0]);
		} else if (x[1] >= x[2]) {
			System.out.println(x[1]);
		} else {
			System.out.println(x[2]);
		}
	}

}
