package basic.programs.part2;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not?");
		int n = sc.nextInt();
		boolean isPrime = checkPrime(n);
		printResult(isPrime, n);
		isPrime = checkPrime2(n);
		printResult(isPrime, n);
		sc.close();
	}

	public static void printResult(boolean value, int n) {
		if (value)
			System.out.println("The Given number " + n + " is a prime number");
		else
			System.out.println("The Given number " + n + " is not a prime number");
	}

	public static boolean checkPrime(int n) {
		int div = 2;
		while (div <= n / 2) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

	public static boolean checkPrime2(int n) {
		int div = 2;
		boolean isPrime = true;
		while (div <= n / 2) {
			if (n % div == 0) {
				isPrime = false;
				break;
			}
			div++;
		}
		return isPrime;
	}

}
