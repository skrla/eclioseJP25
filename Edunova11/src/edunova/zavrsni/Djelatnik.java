package edunova.zavrsni;

import java.util.Date;

public class Djelatnik extends Poslovnajedinica {
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Date getDatumRodenja() {
		return datumRodenja;
	}
	public void setDatumRodenja(Date datumRodenja) {
		this.datumRodenja = datumRodenja;
	}
	public String getPoreznaKartica() {
		return poreznaKartica;
	}
	public void setPoreznaKartica(String poreznaKartica) {
		this.poreznaKartica = poreznaKartica;
	}
	public String getUgovorORadu() {
		return ugovorORadu;
	}
	public void setUgovorORadu(String ugovorORadu) {
		this.ugovorORadu = ugovorORadu;
	}
	public String getSvjedozba() {
		return svjedozba;
	}
	public void setSvjedozba(String svjedozba) {
		this.svjedozba = svjedozba;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	private String ime;
	private String prezime;
	private String adresaStanovanja;
	private String iban;
	private Date datumRodenja;
	private String poreznaKartica;
	private String ugovorORadu;
	private String svjedozba;
	private String email;

}
