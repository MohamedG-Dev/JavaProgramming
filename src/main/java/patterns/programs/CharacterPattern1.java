package patterns.programs;

import java.util.Scanner;

public class CharacterPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				char jthChar = (char) ('A' + j - 1);
				System.out.print(jthChar);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		sc.close();
	}

}
