package basic.programs;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// input 1: 1234, output 1: 4321
		// input 2: 1980, output 2: 891
		int n = 80;
		int sum = 0, rem =0;
		while(n>0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
