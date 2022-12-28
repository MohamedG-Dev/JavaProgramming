package basic.programs.part2;

public class NcRUsingFunctions {

	public static void main(String[] args) {
		int n = 6;
		int r = 2;
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n - r);
		int result = factN / (factR * factNR);
		System.out.println(result);
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
