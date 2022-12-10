package patterns.programs;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// int N = sc.nextInt();
		int N = 4;
		int i = 1;
		while (i <= N) {
			int space = 1;
			while (space <= N - i) {
				System.out.print(' ');
				space = space + 1;
			}
			int nums = 1, p = i;
			while (nums <= i) {
				System.out.print(p);
				p = p + 1;
				nums = nums + 1;
			}
			p = p - 2;
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print(p);
				p = p - 1;
				dec = dec - 1;
			}
			i = i + 1;
			System.out.println();
		}

	}

}
