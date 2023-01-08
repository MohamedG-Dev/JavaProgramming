package arrays.searchingandsorting.programs;

public class InsertionSort {

	public static void main(String[] args) {
		// { 2, 13, 4, 1, 3, 6, 28 }; 9 3 6 2 0; 4 3 2 1
		//int[] arr = { 4, 3, 2, 1 };
		//insertionSort(arr);
		//printArrayElements(arr);
		int[] arr1= {9,6,4,8,2,7,5,1,3};
		insertionSort2(arr1);
		printArrayElements(arr1);

	}

	// my solution
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// correct solution
	public static void insertionSort2(int[] arr) {
		int n = arr.length;
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

	public static void printArrayElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
