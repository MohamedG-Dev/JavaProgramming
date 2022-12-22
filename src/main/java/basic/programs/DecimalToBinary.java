package basic.programs;

public class DecimalToBinary {

	public static void main(String[] args) {
		// input 1: 12, output 1: 1100
		// input 2: 7, output 2: 111
		long n =12, placeValue=0, remainder=0,placeIndex=1;
		long sum = 0;
		while(n>0) {
			remainder = n%2;
			placeValue= (placeIndex*10)/10;
			sum = sum+remainder*placeValue;
			n/=2;
			placeIndex *=10;
		}
		
		System.out.println(sum);
	}

}
