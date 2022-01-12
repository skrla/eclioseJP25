package edunova;

public class E05_TipPodatkaSParametrima {
	public static void main(String[] args) {

		System.out.println(zbroji(E04_TipPodatkaBezParametara.ucitajBroj(), E04_TipPodatkaBezParametara.ucitajBroj()));
		
		System.out.println(sumaPrimBrojeva(3, 100));
	}
	
	private static int zbroji(int i, int j) {
		return i+j;
	}
	
	private static boolean prim(int broj) {
		
		for (int i = 2; i < broj; i++) {
			if (broj%2 == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	private static int sumaPrimBrojeva(int min, int max) {
		int suma = 0;
		
		for(int i = min; i <= max; i++) {
			if(prim(i)) {
				suma += i;
			}
		}
		
		return suma;
	}
	
	private int najmanji(int[] niz) {
		int najmanji = Integer.MAX_VALUE;
		
		for(int i : niz) {
			if (i<najmanji) {
				najmanji = i;
			}
		}
		
		return najmanji;
	}
	
}
