package arrays.twodimensional.programs;

public class LargestRowOrColumn {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 4, 2, 1, 1 }, { 2, 3, 4, 5 } };
		int rows = arr.length;
		int cols = arr[0].length;
		int rowMaxSum = maxsumOfAllRows(arr, rows, cols);
		//System.out.println(rowMaxSum);
		int colMaxSum = maxsumOfAllColumns(arr, rows, cols);
		//System.out.println(colMaxSum);
		if(rowMaxSum>=colMaxSum)
			System.out.println("Row has max value than column."+" row value "+rowMaxSum);
		else
			System.out.println("Column has max value than row."+" col value "+colMaxSum);
	}

	public static int maxsumOfAllRows(int[][] arr, int rows, int cols) {
		int max = Integer.MIN_VALUE;
		int rowIndex = 0;
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum += arr[i][j];
			}
			if (sum > max) {
				max = sum;
				rowIndex = i;
			}

		}
		return max;
	}

	public static int maxsumOfAllColumns(int[][] arr, int rows, int cols) {
		int max = Integer.MIN_VALUE;
		int colIndex = 0;
		for (int j = 0; j < cols; j++) {
			int sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
			if (sum > max) {
				max = sum;
				colIndex = j;
			}
		}
		return max;
	}

}
