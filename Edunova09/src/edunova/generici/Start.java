package edunova.generici;

import java.util.ArrayList;
import java.util.List;

import edunova.viseoblicje.Predavac;

public class Start {
	
	public Start() {
		
		ArrayList al = new ArrayList();
		
		String t = "Ana";
		
		Predavac p = new Predavac();
		
		al.add(t);
		al.add(p);
		
		ArrayList<String> gradovi = new ArrayList();
		gradovi.add("Osijek");
		gradovi.add(t);
		gradovi.add("Valpovo");
		
		for(String s: gradovi) {
			System.out.println(s);
		}
		
		List<String> imena = new ArrayList<>();
		
		imena.add("Mario");
		imena.add("t");
		
		imena.forEach(s -> System.out.println(s));
	}
	
	public static void main(String[] args) {
		new Start();
	}

}
