package arrays.programs.part2;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int X = 2;
		String dir = "RIGHT";
		rotateArr(arr, X, dir);
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotateArr(int[] arr, int x, String dir) {
		int n = arr.length;
		x = x % n;
		if (x > 0 && dir.equals("LEFT")) {
			rotateLeft(arr, n, x);
		} else if (x > 0 && dir.equals("RIGHT")) {
			rotateRight(arr, n, x);
		}
	}

	public static void rotateLeft(int[] arr, int n, int x) {
		reverseBetween(arr, 0, n);
		reverseBetween(arr, 0, n - x);
		reverseBetween(arr, n - x, n);
	}

	public static void rotateRight(int[] arr, int n, int x) {
		reverseBetween(arr, 0, n);
		reverseBetween(arr, 0, x);
		reverseBetween(arr, x, n);

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
