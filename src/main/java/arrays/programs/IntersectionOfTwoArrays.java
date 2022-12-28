package arrays.programs;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// arr1[] = {2 ,6, 8, 5, 4, 3}; arr2[] = {2,3,4,7};
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 1, 1, 1, 1, 1 };
		int m = arr1.length;
		int n = arr2.length;
		int temp = 0;
		if (m < n || m > n) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr1[i] == arr2[j]) {
						temp = arr1[i];
						System.out.print(temp + " ");
						arr2[j] = Integer.MIN_VALUE;
						break;
					}
				}
			}
		} else {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr1[i] == arr2[j]) {
						temp = arr1[i];
						System.out.print(temp + " ");
						arr2[j] = Integer.MIN_VALUE;
						break;
					}
				}
			}
		}

	}

}
