package edunova.utils;

import java.math.BigDecimal;
import java.util.Scanner;


public class Unos {

	public static int unesiInt(Scanner ulaz, String poruka) {
		int i = 0;
		
		while (true) {
			
		System.out.print(poruka + " ");
		try {
		i = Integer.parseInt(ulaz.nextLine());
		} catch (Exception e) {
			System.out.println("Unos mora biti broj");
			continue;
		}
		
		if (i < i) {
			System.out.println("Broj mora biti pozitivan");
			continue;
		}
		return i;
		}
	}
	
	public static BigDecimal unesiBigDecimal(Scanner ulaz, String poruka) {
		BigDecimal i = BigDecimal.ZERO;
		
		while (true) {
			System.out.print(poruka + " ");
			
			try {
			i = new BigDecimal(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos more biti broj");
				continue;
			}
		if (i.compareTo(BigDecimal.ONE) < 0) {
			System.out.println("Broj mora biti pozitivan");
			continue;
		}
		return i;
		}
	}
	
	public static String unesiString(Scanner ulaz, String poruka) {
		String i = "";
		
		while (true) {

			System.out.print(poruka + " ");
			i = ulaz.nextLine();
		if (i.length() == 0) {
			System.out.println("Tekst ne smije biti prazan");
			continue;
		}
		return i;
		}
	
	}
	
	public static int unesiInt(Scanner ulaz, String poruka, int min, int max) {
		int i = 0;
		
		while (true) {
			
		System.out.print(poruka + " ");
		try {
		i = Integer.parseInt(ulaz.nextLine());
		} catch (Exception e) {
			System.out.println("Unos mora biti broj");
			continue;
		}
		
		if (i < min || i > max) {
			System.out.println("Broj mora biti između " + min + "i " + max);
			continue;
		}
		return i;
		}
	}
}
