package arrays.searchingandsorting.programs;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 13, 4, 1, 3, 6, 28 };
		bubbleSort(arr);
		printArrayElements(arr);

	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// for (int j = 0; j < n - 1; j++) { this piece of code checks the redundant
			// sorted data as well
			for (int j = 0; j < n - 1 - i; j++) { // this code doesn't checks the redundant sorted data
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArrayElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
