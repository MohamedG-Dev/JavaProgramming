package patterns.programs;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		int n=4;
		System.out.println('*');
		int i=1;
		while(i<=n) {
			System.out.print('*');
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec=dec-1;
			}
			System.out.println('*');
			i=i+1;
		}
		i=i-2;
		while(i>=1) {
			int j=1;
			System.out.print('*');
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec=dec-1;
			}
			System.out.println('*');
			i=i-1;
		}
		System.out.print('*');
	}

}
