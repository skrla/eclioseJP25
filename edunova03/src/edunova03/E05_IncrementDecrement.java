package edunova03;

public class E05_IncrementDecrement {
	
	public static void main(String[] args) {
		
		int i = 1;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i += 2;
		System.out.println(i);

		i++;	
		System.out.println(i);
		
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i);
		
		int t = 1, k = 0;
		k = k - t++;
		t -= --k + ++t;
		
		System.out.println(k-1);
	}

}
