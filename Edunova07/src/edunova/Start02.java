package edunova;

public class Start02 {

	public static void main(String[] args) {
		Racun racun = new Racun();
		
		Adresa adresa = new Adresa();
		Mjesto mjesto = new Mjesto();
		Zupanija zupanija = new Zupanija();
		
		zupanija.setNaziv("Osječko baranjska");
		mjesto.setZupanija(zupanija);
		adresa.setMjesto(mjesto);
		adresa.setUlica("Ružina 12");
		
		//racun.getAdresa().setUlica("Ružina 12");
		racun.setAdresa(adresa);
		
		System.out.println(racun.getAdresa().getUlica());
		
		System.out.println(racun.getAdresa().getMjesto().getZupanija().getNaziv());
	}
}
