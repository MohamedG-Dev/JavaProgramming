package arrays.programs;

public class TripletSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, };
		int n = arr.length;
		int count = 0;
		int x = 12;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == x)
						count++;
				}
			}
		}
		System.out.println(count);
	}

}
