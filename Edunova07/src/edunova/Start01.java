package edunova;

public class Start01 {
	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		
		osoba.setIme("Pero");
		
		System.out.println(osoba.getIme());
		program();
	}
	
	private static void program() {
		int ukupnoOsoba = Unos.unesiInt("Unesite koliko osoba");
		Osoba[] osobe = new Osoba[ukupnoOsoba];
		
		Osoba osoba;
		
		for(int i = 0; i < osobe.length; i++
				) {
			osoba = new Osoba();
			osoba.setSifra(Unos.unesiInt("Unesi šifru" + (i+1) + ". osobe"));
			osoba.setIme(Unos.unesiString("Unesi ime" + (i+1) + ". osobe"));
			osoba.setPrezime(Unos.unesiString("Unesi prezime" + (i+1) + ". osobe"));
			osoba.setPlaca(Unos.unesiDouble("Unesi plaću" + (i+1) + ". osobe"));
			osobe[i] = osoba;
		}
		System.out.println(prosjek(osobe));
		
		najmanjaPlaca(osobe);
	}
	
	private static void najmanjaPlaca(Osoba[] osobe) {
		// TODO Auto-generated method stub
		
	}

	private static double prosjek(Osoba[] osobe) {
		double sum = 0.0;
		for(int i = 0; i < osobe.length; i++) {
			sum += osobe[i].getPlaca();
		}
		
		return sum / osobe.length;
	}
}
