package arrays.twodimensional.programs;

public class ColumnWiseTraversal {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[] arr = columnWiseTraversal(a);
		printArr(arr);

	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] columnWiseTraversal(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		int[] arr = new int[m * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[k] = a[j][i];
				k++;
			}
		}

		return arr;
	}
}
