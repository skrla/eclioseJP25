package edunova;

public class E05_operatori {

	public static void main(String[] args) {

		int i = 0;

		boolean tocno = i == 0;

		System.out.println(tocno);

		tocno = i != 5;

		System.out.println(tocno);

		int j, k;

		j = 5;
		k = 2;
		
		i = j + k;
		
		System.out.println(i);

		i = j - k;
		
		System.out.println(i);
		
		i = j * k;
		
		System.out.println(i);
		
		i = j / k;
		
		System.out.println(i);
		
		double d = j / k;
		
		System.out.println(d);
		
		d = (double) j / k;
		
		System.out.println(d);
		
		j = 9; k = 2;
		
		i = j % k;
		
		System.out.println(i);
	}

}
