package arrays.searchingandsorting.programs;

public class MergeTwoSortedArrays {
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10 ,100, 500 }; // { 1, 3, 4, 7, 11 }
		int[] arr2 = { 4, 7, 9, 25, 30 ,300, 450 }; // { 2, 4, 6, 13 }
		int[] arr3 = mergeTwoArrays(arr1, arr2);
		printArr(arr3);
	}

	public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] arr3 = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else  { 
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
			while(i<m) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}	
			while(j<n) {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		return arr3;
	}

}
