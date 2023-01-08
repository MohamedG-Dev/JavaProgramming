package arrays.searchingandsorting.programs;

public class AssignmentCountSmall {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 6, 7  };
		int[] arr2 = { 6,7 };
		int m = arr1.length;
		int n = arr2.length;
		int[] arr = countSmall(m, n, arr1, arr2);
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] countSmall(int m, int n, int[] arr1, int[] arr2) {
		int[] countArr = new int[m];
		int k = 0;
		for (int i = 0; i < m; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr2[j] <= arr1[i]) {
					count++;
				}
			}
			countArr[k] = count;
			k++;
		}
		return countArr;
	}

}
