package edunova.zavrsni;

public class ClanTima{
	
	private int sifraTima;
	private Djelatnik djelatnik;
	private Tim tim;
	private Posao posao;
	public Djelatnik getDjelatnik() {
		return djelatnik;
	}
	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}
	public Tim getTim() {
		return tim;
	}
	public void setTim(Tim tim) {
		this.tim = tim;
	}
	public Posao getPosao() {
		return posao;
	}
	public void setPosao(Posao posao) {
		this.posao = posao;
	}
	public int getSifraTima() {
		return sifraTima;
	}
	public void setSifraTima(int sifraTima) {
		this.sifraTima = sifraTima;
	}

}
