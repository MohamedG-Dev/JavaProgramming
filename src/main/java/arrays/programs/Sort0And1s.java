package arrays.programs;

public class Sort0And1s {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
		// output: 0 0 0 0 0 0 0 1 1 1 1 
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			while (arr[start] != 1) {
				start++;
			}

			while (arr[end] != 0) {
				end--;
			}
			if (start > end)
				break;
			arr[start] = 0;
			arr[end] = 1;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
