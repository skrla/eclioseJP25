package edunova04;

public class Z04 {
	
	public static void main(String[] args) {
		
		int i = 99;
		int x = 0;
		
		do {
			--i;
			if (i % 2 == 0) {
				x += i;
			}
			
		} while(i > 27);
		
		System.out.println(x);
	}

}
