package basic.programs;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// input 1: 1100, output 1: 12
		// input 2: 111, output 2: 7
		int n = 111;
		int sum=0,decimal=0,power=0;
		while(n>0) {
			decimal = (int) (Math.pow(2, power)* (n % 10));
			sum +=decimal;
			n /=10;
			power++;
		}
		System.out.println(sum);
	}

}
