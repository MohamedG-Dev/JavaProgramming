package basic.programs;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		int n = 20;
		for(int i=2;i<=n;i++) {
			boolean isPrime = true;
			for(int div=2;div<=i/2;div++) {
				if(i%div==0) {
					isPrime = false;
				}
			}
			if(isPrime) 
				System.out.println(i);
		}

	}

}
