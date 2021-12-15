package edunova;

import javax.swing.JOptionPane;

public class E04_PrimitivniTipoviPodataka {
	
	public static void main(String[] args) {
		
		byte maliCijeliBroj = Byte.parseByte(
				JOptionPane.showInputDialog("Unesi broj id -128 do 127")
				);

		byte drugi = (byte)(maliCijeliBroj + 100);
		
		System.out.println(drugi);
		
		short maloVeciCijeliBroj = Short.parseShort(
				JOptionPane.showInputDialog("Cijelo broj od -32,768 do 32,767")
				);
		
		System.out.println(maliCijeliBroj);
		
		long velikiCijeliBroj = Long.parseLong(
				JOptionPane.showInputDialog("Veliki cijeli broj")
				);
		
		System.out.println(velikiCijeliBroj);
		
		float f = 3.14F;
		
		f = Float.parseFloat(
				JOptionPane.showInputDialog("Učitaj decimalni broj (Za decimalni dio stavi točku)")
				);
		
		System.out.println(f * 2);
		
		double d = 3.14;
		
		d = Double.parseDouble(
				JOptionPane.showInputDialog("Učitaj decimalni broj (Za decimalni dio stavi točku)")
				);
				
		
		System.out.println(d / 3.33);
		
		boolean logickaVrijednost = true;
		
		logickaVrijednost = Boolean.parseBoolean(
				JOptionPane.showInputDialog("Unesi true/false")
				);
		
		System.out.println(logickaVrijednost);
		
		char znak = 'a';
		
		znak = JOptionPane.showInputDialog("Unesi znak").charAt(0);
		
		System.out.println(znak);
	}

}