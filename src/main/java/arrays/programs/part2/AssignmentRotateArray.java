package arrays.programs.part2;

public class AssignmentRotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		//output: 3 4 5 6 7 1 2
		int d = 2;
		rotate(arr, d);
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotate(int[] arr, int d) {
		int n = arr.length;
		if (d != 0) {
			d = d % n;
			rotateLeft(arr, n, d);
		}
	}

	public static void rotateLeft(int[] arr, int n, int x) {
		reverseBetween(arr, 0, n);
		reverseBetween(arr, 0, n - x);
		reverseBetween(arr, n - x, n);
	}

	public static void reverseBetween(int[] arr, int l, int r) {
		r--;
		int len = (r - l) / 2;
		for (int i = 0; i <= len; i++) {
			swap(arr, l, r);
			l++;
			r--;
		}
	}

	public static void swap(int[] arr, int l, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
}
