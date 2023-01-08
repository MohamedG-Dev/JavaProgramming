package arrays.programs.part2;

public class ReverseArrayBetween2Index {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int l = 2;
		int r = 6;
		reverseBetween(arr, l, r);
		printArr(arr);

	}

	public static void reverseBetween(int[] arr, int l, int r) {
		int len = (r - l) / 2;
		for (int i = 0; i <= len; i++) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
