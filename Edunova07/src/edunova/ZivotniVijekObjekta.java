package edunova;

public class ZivotniVijekObjekta {

	private ZivotniVijekObjekta zivotniVijekObjekta;
	
	public ZivotniVijekObjekta() {
		System.out.println("U konstruktoru");
	}

	public ZivotniVijekObjekta getZivotniVijekObjekta() {
		return zivotniVijekObjekta;
	}

	public void setZivotniVijekObjekta(ZivotniVijekObjekta zivotniVijekObjekta) {
		this.zivotniVijekObjekta = zivotniVijekObjekta;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Na početku izvođenja programa");
		ZivotniVijekObjekta zivotniVijekObjekta = new ZivotniVijekObjekta();
		System.out.println("GC ga sam uništi");
		zivotniVijekObjekta.setZivotniVijekObjekta(null);
	}
}
