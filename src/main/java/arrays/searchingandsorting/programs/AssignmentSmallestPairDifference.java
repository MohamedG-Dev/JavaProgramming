package arrays.searchingandsorting.programs;

public class AssignmentSmallestPairDifference {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		int m = arr1.length;
		int[] arr2 = { 17,15 };
		int n = arr2.length;
		smallestPair(arr1, m, arr2, n);
	}

	public static void smallestPair(int[] a, int m, int[] b, int n) {
		sort(a, m);
		// printArrayElements(a);
		sort(b, n);
		// printArrayElements(b);
		int i = 0, j = 0, mini = Integer.MAX_VALUE;
		while (i < m && j < n) {
			// mini = Math.min(mini,Math.abs(a[i]-b[j]));
			mini = min(mini, abs(a[i], b[j]));
			if (a[i] < b[j])
				i++;
			else
				j++;
		}
		System.out.println(mini);
	}

	public static int abs(int a, int b) {
		int result = a - b;
		if (result < 0)
			result = -result;
		return result;
	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static void sort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void printArrayElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
