package patterns.programs;

import java.util.Scanner;

public class IsocelesTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int spaces = 1;
			while (spaces <= n - i) {
				System.out.print(' ');
				spaces = spaces + 1;
			}
			int nums = 1;
			while (nums <= i) {
				System.out.print(nums);
				nums = nums + 1;
			}
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print(dec);
				dec = dec - 1;
			}
			i = i + 1;
			System.out.println();
		}
		sc.close();
	}

}
