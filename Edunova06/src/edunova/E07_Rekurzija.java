package edunova;

public class E07_Rekurzija {

	public static void main(String[] args) {
		System.out.println(zbroj(5));
		int sum = 0;
		
		for(int i = 1; i != 5; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	private static int zbroj(int i) {
/*		if(i == 1) {
			return i;
		}
		return i+zbroj(i-1);
	*/
	return i==1 ? i : i + zbroj(i-1);

	}
}