package arrays.programs.part2;

public class AssignmentExtraCandies {

	public static void main(String[] args) {
		int[] arr1 = { 22, 8, 4, 7, 5, 10 };
		int[] arr2 = { 9, 3, 1, 6, 0, 9 };
		int x = 17;
		int[] output = extraCandies(arr1.length, x, arr1, arr2);
		printArr(output); // output: 17 17 13 13 5 17

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] extraCandies(int n, int x, int[] p1, int[] p2) {
		long carry = 0;
		int[] output = new int[n];
		for (int i = 0; i < n; i++) {
			long total = p1[i] + p2[i] + carry;
			carry = 0;
			if (total <= x) {
				output[i] = (int) total;
			} else {
				carry = total - x;
				output[i] = x;
			}
		}
		return output;
	}

}
