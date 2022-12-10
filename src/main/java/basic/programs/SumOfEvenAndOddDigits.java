package basic.programs;

public class SumOfEvenAndOddDigits {

	public static void main(String[] args) {
		// Write a program to input an integer N and print the sum of all its even
		// digits and sum of all its odd digits separately.
		// Digits mean numbers, not the places! That is, if the given integer is
		// "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
		//input 1234, output 6,4
		//input 552245, output 8 15
		int n = 552245, rem = 0, evenSum = 0, oddSum = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				evenSum += rem;
			} else {
				oddSum += rem;
			}
			n = n / 10;
		}
		System.out.println(evenSum + " " + oddSum);

	}

}
