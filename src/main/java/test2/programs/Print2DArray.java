package test2.programs;

public class Print2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print2DArray(arr);

	}

	public static void print2DArray(int input[][]) {
		int m = input.length;
		if (m == 0)
			return;
		int n = input[0].length;

		for (int i = 0; i < m; i++) {
			int loop = m - i;
			for (int p = 0; p < loop; p++) {
				for (int j = 0; j < n; j++) {
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
