package edunova04;
public class E01_WhilePetlja {
	
	public static void main(String[] args) {
		
		int i = 2;
		boolean uvjet = i < 10;
		
		while(uvjet) {
			System.out.println(i);
			i++;
			uvjet = i < 10;
		}
		
		i = 2;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		i = 2;
		while (i < 10) {
			System.out.println(i++);
		}
		
		while(true) {
			System.out.println("Osijek");
			break;
		}
	}

}
