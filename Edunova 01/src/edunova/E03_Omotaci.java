package edunova;

import javax.swing.JOptionPane;

public class E03_Omotaci {

	public static void main(String[] args) {

		int godine;

		System.out.println(Integer.MAX_VALUE + 1);

		godine = Integer.parseInt(JOptionPane.showInputDialog("Učitaj godine"));

		int rezultat = godine + 4;
		
		System.out.println(rezultat);
	}

}
