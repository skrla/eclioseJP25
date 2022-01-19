package edunova;

import java.util.Scanner;

public class JavaSDKKlase {

	public JavaSDKKlase() {
		String string = new String("Pero");
		
		String ime = "Pero";
		
		Osoba osoba = new Osoba("Pero");
		
		System.out.println(osoba.hashCode());
		osoba.setIme("Marko");
		System.out.println(osoba.hashCode());
		
		System.out.println("String");
		System.out.println(ime.hashCode());
		ime = "Marko";
		System.out.println(ime.hashCode());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Pero");
		System.out.println("StringBuilder");
		System.out.println(sb.hashCode());
		sb.replace(0, 4, "Marko");
		System.out.println(sb.hashCode());
		
		String grad = "Osijek";
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi ime osobe");
		osoba.setIme(ulaz.nextLine());
		System.out.println("Unesi prezime osobe");
		osoba.setPrezime(ulaz.nextLine());
		
		ulaz.close();
		//System.out.println(osoba.getIme() + " " + osoba.getPrezime());
		System.out.println(osoba.getImePrezime());
		
		System.out.println(osoba);
		
		Osoba o1 = new Osoba("Ana");
		Osoba o2 = new Osoba("Ana");
		
		System.out.println(o1.equals(o2));
		
		Polaznik polaznik = new Polaznik();
	
	}
	
	public static void main(String[] args) {
		new JavaSDKKlase();
	}
}
