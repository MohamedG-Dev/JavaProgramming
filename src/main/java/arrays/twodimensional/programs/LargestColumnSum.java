package arrays.twodimensional.programs;

public class LargestColumnSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		int result = largestColumnSum(arr);
		System.out.println(result);
	}

	public static int largestColumnSum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int max = Integer.MIN_VALUE;
		for (int j = 0; j < cols; j++) {
			int sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
			if (sum > max)
				max = sum;
		}
		return max;
	}

}
