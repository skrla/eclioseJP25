package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		float[] niz = new float[E04_TipPodatkaBezParametara.ucitajBroj()];
		ucitajBroj(niz);
	}
	
	private static float ucitajBroj(float[] niz) {
		float x;
		for (float i: niz) {
			x = i * 10;
			if (x % 10 <= 5) {
				return i;
			}
		}
		return 0;
	}
}
