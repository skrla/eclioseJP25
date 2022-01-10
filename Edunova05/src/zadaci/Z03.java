package zadaci;

import java.util.Random;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		int x = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int count = 0;
		int y = 50;
		int[] z = new int[y];
		
		
		while (x != -1) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
			count++;
			sum += x;
			if (min > x && x != -1) {
				min = x;
			}
			if (max < x) {
				max = x;
			}
			if (count >= 50) {
				continue;
			} else {
				z[count] = x;
			}
		}
		System.out.println(sum);
		System.out.println((double) sum / count);
		System.out.println(min);
		System.out.println(max);
		while (true) {
			Random random = new Random();
			x = random.nextInt(49) + 1;
			if (x > 49 && 0 > x) {
				continue;
			} else if (z[x] == 0) {
				continue;
			} else {
				break;
			}
			
		}
		System.out.println(z[x]);
	}
}
