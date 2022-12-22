package basic.programs;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		int n=6;
		int f1=0,f2=1,sum=0;
		sum=f1+f2;
		for(int i = 1;i<=n-1;i++){
			sum=f1+f2;
			f1=f2;
			f2=sum;
		}
		System.out.println(sum);

	}

}
