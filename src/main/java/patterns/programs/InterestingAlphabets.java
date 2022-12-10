package patterns.programs;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			char ch = (char) ('A' + n - i);
			int j = 1;
			while (j <= i) {
				System.out.print(ch);
				ch = (char) (ch + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		sc.close();
	}

}
