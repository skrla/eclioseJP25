package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		int duzina = Integer.parseInt(JOptionPane.showInputDialog("Unesite dužinu"));
		int sirina = Integer.parseInt(JOptionPane.showInputDialog("Unesite širinu"));
		int kvadratura = duzina * sirina;
		
		System.out.println(kvadratura);
		
		switch(kvadratura) {
		case 6500:
			System.out.println("Nogomet");
		case 7000:
			System.out.println("Ragbi");
			break;
		case 800:
			System.out.println("Rukomet");
			break;
		}		
				
	}
}
