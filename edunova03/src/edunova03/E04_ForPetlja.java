package edunova03;

public class E04_ForPetlja {
	
	public static void main(String[] args) {
		
		for(int i = 0;i<10; i = i + 1) {
			System.out.print("Osijek, ");
		}
		
		for(int i=0; i<10; i = i + 1) {
			System.out.println(i);
		}
		
		System.out.println("");
	
		for(int i = 1; i<10; i = i + 1) {
			if(i % 2 == 0) {
				System.out.println(i);
				continue;
			}
			
			System.out.println(i);
		}
		
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				if(i*j < 10) {
					System.out.print("  " + i*j + " " );
				} else if (i * j < 100) {
					System.out.print(" " + i * j + " ");
				} else {
					System.out.print(i * j + " ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i<10; i++) {
			if (i%2==0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		for (int i = 0; i<10; i++) {
			if (i==2) {
				break;
			}
			
			System.out.println(i);
		}
		
		vanjska:
			for(int i=1;i<=10; i++) {
				for(int j = 1; i<=10; i++) {
					break vanjska;
				}
			}
		
		for(;;) {
			System.out.println(Math.random());
			break;
		}
		
		int x = 0;
		for (int i = 1; i <= 100; i++) {
			x += i;
		}
		
		System.out.println(x);

	}
}
