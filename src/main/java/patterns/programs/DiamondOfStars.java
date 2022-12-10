package patterns.programs;

public class DiamondOfStars {

	public static void main(String[] args) {
		int n=5,i=1;
		while(i<=n) {
			int spaces = 1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces=spaces+2;
			}
			int stars=1;
			while(stars<=i) {
				System.out.print('*');
				stars=stars+2;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print('*');
				dec=dec-2;
			}
			System.out.println();
			i=i+2;
		}
		i=n-2;
		while(i>=1) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces=spaces+2;
			}
			int stars =1;
			while(stars<=i) {
				System.out.print('*');
				stars=stars+2;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print('*');
				dec=dec-2;
			}
			System.out.println();
			i=i-2;
		}

	}

}
