package edunova04;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		
		int i;
		
		while(true) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
			if (i < 1 || i > 10) {
				JOptionPane.showMessageDialog(null, "Broj nije u traženom rasponu");
				break;
			}
			System.out.println(i);
			break;
		}
		
		int x;
		
		for (;;) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
			if (x < 1 || x > 10) {
				JOptionPane.showMessageDialog(null, "Broj nije u traženom rasponu");
				break;
			}
			System.out.println(x);
			break;
		}
	}
}
