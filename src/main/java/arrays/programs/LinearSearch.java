package arrays.programs;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 6, 7 };
		int index = linearSearch(arr, 6);
		System.out.println(index);

	}

	public static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

}
