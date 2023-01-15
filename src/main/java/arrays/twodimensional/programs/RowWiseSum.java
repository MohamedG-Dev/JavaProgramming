package arrays.twodimensional.programs;

public class RowWiseSum {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		rowWiseSum(a);

	}

	public static void rowWiseSum(int[][] arr) {
		int m = arr.length;
		int n = 0;
		if (arr.length > 0)
			n = arr[0].length;
		for (int i = 0; i < m; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			System.out.print(sum + " ");
		}
	}

}
