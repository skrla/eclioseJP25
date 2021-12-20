package edunova03;

import java.util.Arrays;

public class E01_JednodimenzionalniNiz {
	
	public static void main(String[] args) {
		
		int[] temperature = new int[12];
		
		System.out.println(temperature.length);
		
		System.out.println(Arrays.toString(temperature));
		
		
		//int niz[] = new int[5];
		
		temperature[0] = -1;
		temperature[1] = -2;
		temperature[2] = 3;
		temperature[3] = 9;
		temperature[4] = 14;
		temperature[5] = 21;
		temperature[6] = 29;
		temperature[7] = 32;
		temperature[8] = 27;
		temperature[9] = 15;
		temperature[10] = 6;
		temperature[11] = 2;
		
		System.out.println(temperature[11]);
		System.out.println(Arrays.toString(temperature));
		System.out.println(temperature[temperature.length - 1]);
		
		int[] ocjene = {3, 2, 4, 5, 3, 2, 1, 2, 3, 4, 2, 1};
		
		System.out.println(ocjene[ocjene.length-1]);
		
		ocjene[ocjene.length - 1] = 5;
		
		System.out.println(Arrays.toString(ocjene));
	}

}
