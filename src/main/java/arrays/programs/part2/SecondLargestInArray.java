package arrays.programs.part2;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// { 2, 13, 4, 1, 3, 6, 28 }; 9 3 6 2 9
		int[] arr = { 6,6 };
		int result = secondLarge(arr);
		System.out.println(result);

	}

	public static int secondLarge(int[] arr) {
		int n = arr.length;
		sort(arr, n);
		for (int i = n - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				return arr[i - 1];
			}
		}
		return Integer.MIN_VALUE;
	}

	public static void sort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
