package basic.programs;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// input : 10
		// output: 5 11 14 17 23 26 29 35 38 41
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print the first x terms of series 3N+2 which are not multiples of 4");
		int n = sc.nextInt();
		int  series = 1;
		for (int i = 1; i > 0; i++) {
			int value = 3 * i + 2;
			if (value % 4 != 0) {
				System.out.print(value + " ");
				series++;
				if (series > n) {
					break;
				}
			}
			
		}
		sc.close();
	}

}
