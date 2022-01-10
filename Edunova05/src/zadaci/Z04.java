package zadaci;

import javax.swing.JOptionPane;

public class Z04 {
public static void main(String[] args) {
	int options = Integer.parseInt(JOptionPane.showInputDialog("1. Zbrajanje \n2. Oduzimanje \n3. Množenje \n4. Djeljenje \n5. Eksponent"));
	int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int sum;
	if (y > x) {
		sum = y;
		y = x;
		x = sum;
	}
	
	switch (options) {
	case 1 -> System.out.println(x + y);
	case 2 -> System.out.println(x - y);
	case 3 -> System.out.println(x * y);
	case 4 -> System.out.println((double)x / y);
	case 5 -> System.out.println((int)Math.pow(x, y));
	}
}
}

