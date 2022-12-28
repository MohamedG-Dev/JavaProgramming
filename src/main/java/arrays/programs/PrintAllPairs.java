package arrays.programs;

public class PrintAllPairs {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		printAllPairs(arr);

	}

	public static void printAllPairs(int[] input) {
		int n = input.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				System.out.println("(" + input[i] + "," + input[j] + ")");
			}

		}
	}

}
