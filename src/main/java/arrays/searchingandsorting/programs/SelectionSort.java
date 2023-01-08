package arrays.searchingandsorting.programs;

public class SelectionSort {

	public static void main(String[] args) {
		// {2, 13, 4, 1, 3, 6, 28}; 1, 7, 4, 0, 9, 4
		int[] arr = { 2, 13, 4, 1, 3, 6, 28 };
		selectionSort(arr);
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void selectionSort(int[] arr) {
		int minIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] <= min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}
	}

}

/* My solution
 * public static void selectionSort(int[] arr) { int temp=0; for(int
 * i=0;i<arr.length-1;i++){ int min = arr[i]; for(int j=i+1;j<arr.length;j++){
 * if(arr[j]<=min){ temp=min; min=arr[j]; arr[i]=min; arr[j]=temp; } } } }
 * 
 */