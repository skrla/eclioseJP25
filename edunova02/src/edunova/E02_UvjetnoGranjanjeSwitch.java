package edunova;

import javax.swing.JOptionPane;

public class E02_UvjetnoGranjanjeSwitch {

	public static void main(String[] args) {

		int ocjena = 2;

		switch (ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Odličan");
			break;
		default:
			System.out.println("Nije ocjena");
		}

		int iznos = 10;

		switch (iznos) {
		case 2:
		case 3:
		case 5:
			System.out.println("OK");
			break;
		case 1:
		case 4:
			System.out.println("NE");
			break;
		default:
			System.out.println("Ne valja");
		}

		int ulaz = Integer.parseInt(JOptionPane.showInputDialog("Odaberi akciju: \n1 Zbrajanje \n2 Oduzimanje"));

		switch (ulaz) {

		case 1:
			int b1 = 2;
			int b2 = 3;
			System.out.println(b1 + b2);
			break;

		case 2:
			float f1 = 3.78F;
			float f2 = 1.78f;
			System.out.println(f1 / f2);
			break;
		default:
			System.out.println("Nisi odabrao valjanu akciju");
		}
		
		int rez = switch(ulaz) {
		case 1, 2, 3 -> 10;
		case 4, 5 -> 20;
		default -> 0;
		};
	}
}
