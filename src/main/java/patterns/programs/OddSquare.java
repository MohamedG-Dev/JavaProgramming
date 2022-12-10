package patterns.programs;

public class OddSquare {

	public static void main(String[] args) {
		int n=4;
		int i=1;
		while(i<=n) {
			int value=2*i-1;
			int maxValue=2*n-1;
			int col=n;
			while(col>0) {
				System.out.print(value);
				value=value+2;
				if(value>maxValue) {
					value=1;
				}
				col=col-1;
			}
			
			i=i+1;
			System.out.println();
		}

	}

}
