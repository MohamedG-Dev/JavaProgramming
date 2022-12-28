package arrays.programs;

public class ReturnDuplicate {

	public static void main(String[] args) {
		int arr[] = { 0, 7, 2, 5, 4, 7, 1, 3, 6 };
		int n = arr.length;
		int dup = 0;
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				} else if (arr[i] == arr[j]) {
					isDuplicate = true;
					System.out.println(arr[i]);
					return;
				}
			}
				
		}

	}

}
