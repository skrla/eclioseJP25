package edunova.zavrsni;

import java.math.BigDecimal;
import java.util.Date;

public class Posao {
	
	private int sifraPosla;
	private String opisPosla;
	private BigDecimal cijenaPosla;
	private String lokacijaPosla;
	private Date pocetakPosla;
	private Date krajPosla;
	private String napomena;
	public String getOpisPosla() {
		return opisPosla;
	}
	public void setOpisPosla(String opisPosla) {
		this.opisPosla = opisPosla;
	}
	public BigDecimal getCijenaPosla() {
		return cijenaPosla;
	}
	public void setCijenaPosla(BigDecimal cijenaPosla) {
		this.cijenaPosla = cijenaPosla;
	}
	public String getLokacijaPosla() {
		return lokacijaPosla;
	}
	public void setLokacijaPosla(String lokacijaPosla) {
		this.lokacijaPosla = lokacijaPosla;
	}
	public Date getPocetakPosla() {
		return pocetakPosla;
	}
	public void setPocetakPosla(Date pocetakPosla) {
		this.pocetakPosla = pocetakPosla;
	}
	public Date getKrajPosla() {
		return krajPosla;
	}
	public void setKrajPosla(Date krajPosla) {
		this.krajPosla = krajPosla;
	}
	public String getNapomena() {
		return napomena;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
	public int getSifraPosla() {
		return sifraPosla;
	}
	public void setSifraPosla(int sifraPosla) {
		this.sifraPosla = sifraPosla;
	}

}
