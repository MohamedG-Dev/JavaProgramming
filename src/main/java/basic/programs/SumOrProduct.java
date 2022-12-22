package basic.programs;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int n = sc.nextInt();
		System.out.println("Enter the below options:");
		System.out.println("Enter 1 to print sum of numbers ranging from 1 to " + n);
		System.out.println("Enter 2 to print product of numbers ranging from 1 to " + n);
		int c = sc.nextInt();
		if (c == 1) {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("The sum of numbers ranging from 1 to "+n+" is: "+sum);
		} else if (c == 2) {
			int product = 1;
			for (int p = 1; p <= n; p++) {
				product *= p;
			}
			System.out.println("The product of numbers ranging from 1 to "+n+" is: "+product);
		} else {
			System.out.println(-1);
		}
		sc.close();
	}

}
