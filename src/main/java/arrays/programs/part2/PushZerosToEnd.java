package arrays.programs.part2;

public class PushZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 0, 6, 7, 0 };
		pushZerosToEnd(arr);
		printArr(arr);

	}

	public static void pushZerosToEnd(int[] arr) {
		int nonZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZero];
				arr[nonZero] = temp;
				nonZero++;
			}
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
