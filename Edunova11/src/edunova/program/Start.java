package edunova.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.utils.Unos;

public class Start {
	
	private List<Smjer> smjerovi;
	private List<Grupa> grupe;
	private List<Predavac> predavaci;
	private List<Polaznik> polaznici;
	private Scanner ulaz;

	
	public Start() {
		smjerovi = new ArrayList<>();
		grupe = new ArrayList<>();
		predavaci = new ArrayList<>();
		polaznici = new ArrayList<>();
		ulaz = new Scanner(System.in);
		naslov();
		glavniIzbornik();
		ulaz.close();
	}
	
	private void glavniIzbornik() {
	System.out.println("1. Rad s smjerovima");
	System.out.println("2. Rad s grupama");
	System.out.println("3. Rad s predavacima");
	System.out.println("4. Rad s polaznicima");
	System.out.println("5. Kraj rada");
	switch (Unos.unesiInt(ulaz, "Odaberi: ", 1, 5)) {
	case 1 -> smjerIzbornik();
	case 2 -> grupaIzbornik();
	case 3 -> predavacIzbornik();
	case 4 -> polaznikIzbornik();
	}
	}

	private void polaznikIzbornik() {
	}

	private void predavacIzbornik() {
	}

	private void grupaIzbornik() {
	}

	private void smjerIzbornik() {
		System.out.println("1. Pregled smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena smjera");
		System.out.println("4. Brisanje smjera");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(ulaz, "Odaberi: ", 1, 5)) {
		case 1 -> smjerPregled();
		case 2 -> unosNovogSmjera();
		case 3 -> promjenaSmjera();
		case 4 -> glavniIzbornik();
	}
	}

	private void promjenaSmjera() {
	}

	private void unosNovogSmjera() {
		Smjer s = new Smjer();
		s.setSifra(Unos.unesiInt(ulaz, "Unesi cijeli broj"));
		s.setNaziv(Unos.unesiString(ulaz, "Unesi naziv"));
		s.setCijena(Unos.unesiBigDecimal(ulaz, "Unesi cijenu"));
		s.setTrajanje(Unos.unesiInt(ulaz, "Unesi trajanje", 10, 300));
		s.setCertificiran(true);
		smjerovi.add(s);
		smjerIzbornik();
	}

	private void smjerPregled() {
		for(Smjer s: smjerovi) {
			System.out.println(s);
		}
		smjerIzbornik();
	}

	private void naslov() {
		
		System.out.println("************************");
		System.out.println("*******Edunova APP******");
		System.out.println("************************");
	}

	public static void main(String[] args) {
		new Start();
	}
}
