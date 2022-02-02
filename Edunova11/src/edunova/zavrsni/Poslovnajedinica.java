package edunova.zavrsni;

public class Poslovnajedinica {

	private int sifraPoslovneJedinice;
	private String nazivPoslovneJedinice;
	private String adresa;
	
	public String getNazivPoslovneJedinice() {
		return nazivPoslovneJedinice;
	}
	public void setNazivPoslovneJedinice(String nazivPoslovneJedinice) {
		this.nazivPoslovneJedinice = nazivPoslovneJedinice;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getSifraPoslovneJedinice() {
		return sifraPoslovneJedinice;
	}
	public void setSifraPoslovneJedinice(int sifraPoslovneJedinice) {
		this.sifraPoslovneJedinice = sifraPoslovneJedinice;
	}
}
