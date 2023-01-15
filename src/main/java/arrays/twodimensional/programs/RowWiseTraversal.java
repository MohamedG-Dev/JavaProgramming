package arrays.twodimensional.programs;

public class RowWiseTraversal {
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[] arr = rowWiseTraversal(a);
		printArr(arr);
	}

	public static int[] rowWiseTraversal(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		int[] arr = new int[m * n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[k] = a[i][j];
				k++;
			}
		}

		return arr;
	}

}
