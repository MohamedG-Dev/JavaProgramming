package patterns.programs;

import java.util.Scanner;

public class IsocelesTriangleStarPattern {

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
			int stars = 1;
			while (stars <= i) {
				System.out.print('*');
				stars = stars + 1;
			}
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print('*');
				dec = dec - 1;
			}
			i = i + 1;
			System.out.println();
		}
		sc.close();
	}

}
