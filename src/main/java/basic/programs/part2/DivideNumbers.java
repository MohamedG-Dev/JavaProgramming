package basic.programs.part2;

public class DivideNumbers {

	public static void main(String[] args) {
		int result =divide(8,2);
		System.out.println(result);
		printDivisionResult(4,0);
	}
	
	public static void printDivisionResult(int numerator,int denominator) {
		if(denominator==0) {
			System.out.println("Division by 0 is not possible");
			return;
		}
		System.out.println(numerator/denominator);
	}
	public static int divide(int numerator,int denominator) {
		if(denominator==0) {
			return Integer.MIN_VALUE;
		}
		return numerator/denominator;
	}

}
