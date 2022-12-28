package arrays.programs;

public class PrintUniqueElement {

	public static void main(String[] args) {
		// {2,3,1,6,3,6,2} {2 ,4 ,7 ,2 ,7};
		int[] arr = { 1, 3, 1, 3, 6, 6, 7, 10, 7 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean isUnique = true;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				} else if (arr[i] == arr[j]) {
					isUnique = false;
				}

			}
			if (isUnique) {
				System.out.println(arr[i]);
			}
		}
	}

}
