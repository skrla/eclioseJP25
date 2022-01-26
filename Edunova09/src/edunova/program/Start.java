package edunova.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	private List<Mobitel> mobiteli;
	private Scanner ulaz;
	private Mobitel mobitel;

	public Start() {
		mobiteli = new ArrayList<>();

		ulaz = new Scanner(System.in);
		program();
		ulaz.close();
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos mobitela");
		System.out.println("2. Promjena mobitela");
		System.out.println("3. Brisanje mobitela");
		System.out.println("4. Pregled mobitela");
		System.out.println("5. Izlaz iz programa");

		switch (Unos.unesiInt(ulaz, "Odaberite akciju")) {
		case 1:
			unos();
			break;

		case 2:
			promjena();
			break;
		case 3:
			brisanje();
			break;
		case 4:
			pregled();
			izbornik();
			break;
		case 5:
			System.out.println("\nHvala što ste koristili našu aplikaciju");
			break;
		default:
			System.out.println("Nije dobra opcija izbornika");
			break;
		}

		
	}

	private void pregled() {
		int b = 1;
		for(Mobitel m: mobiteli) {
			System.out.println(b++ + ". " + m);
		}
		izbornik();
	}

	private void brisanje() {
		pregled();
		mobiteli.remove(Unos.unesiInt(ulaz, "Odaberi redni broji mobitela koji želiš obrisati")-1);
	}

	private void promjena() {
		pregled();
		int i = Unos.unesiInt(ulaz, "Unesi redni broj mobitela kojem želite promjeniti naziv");
		mobitel = mobiteli.get(i-1);
		
		
	}

	private void unos() {
		mobitel = new Mobitel();
		mobitel.setSifra(Unos.unesiInt(ulaz, "Učitaj šifru mobitela"));
		mobitel.setNaziv(Unos.unesiString(ulaz, "Učitaj naziv mobitela"));
		mobitel.setCijena(Unos.unesiBigDecimal(ulaz, "Učitaj cijenu mobitela"));
		mobiteli.add(mobitel);
		izbornik();
	}

	private void naslov() {
		System.out.println("****************************");
		System.out.println("****Programi Mobiteli V1****");
		System.out.println("****************************");
	}

	public static void main(String[] args) {
		new Start();
	}

}
