package basic.programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is a prime number or not");
		n = sc.nextInt();
		boolean isPrime = true;
		int div = 2;
		while (div <= n / 2) {
			if (n % div == 0) {
				isPrime = false;
			}
			div++;
		}
		if (isPrime) {
			System.out.println("The given number " + n + " is prime");
		} else {
			System.out.println("The given number " + n + " is not prime");
		}
	}

}
