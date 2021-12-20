package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		int duzina = Integer.parseInt(JOptionPane.showInputDialog("Unesite dužinu"));
		int sirina = Integer.parseInt(JOptionPane.showInputDialog("Unesite širinu"));
		int kvadratura = duzina * sirina;
		
		System.out.println(kvadratura);
		
		if (7000 <= kvadratura) {
			System.out.println("Nogomet, ragbi, rukomet");
		} else if((6500 <= kvadratura) && (kvadratura < 7000)) {
			System.out.println("Nogomet, rukomet");
		} else if((800 <= kvadratura) && (kvadratura < 6500)) {
			System.out.println("Rukomet");
		} else {
			System.out.println("Ništa");
		}
}
}
