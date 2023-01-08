package arrays.searchingandsorting.programs;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 7, 9, 11, 12, 45 };
		int x = 0;
		int index = binarySearch(arr, x);
		System.out.println(index);

	}

	public static int binarySearch(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > x) {
				end = mid - 1;
			} else if (arr[mid] < x) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
