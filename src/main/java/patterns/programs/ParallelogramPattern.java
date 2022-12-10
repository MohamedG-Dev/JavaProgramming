package patterns.programs;

public class ParallelogramPattern {

	public static void main(String[] args) {
		int n = 4;
		int i = 1;
		while (i <= n) {
			int space = 1;
			while (space <= i - 1) {
				System.out.print(' ');
				space = space + 1;
			}
			int x = 1;
			while (x <= n) {
				System.out.print('*');
				x = x + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
