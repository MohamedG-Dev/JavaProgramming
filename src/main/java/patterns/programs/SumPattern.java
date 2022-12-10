package patterns.programs;

public class SumPattern {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		while(i<=n) {
			int num=1,sum=0;
			while(num<=i) {
				sum=sum+num;
				System.out.print(num);
				if(num<=i-1) {
					System.out.print('+');
				}
				num=num+1;
			}
			i=i+1;
			System.out.print('=');
			System.out.println(sum);
		}

	}

}
