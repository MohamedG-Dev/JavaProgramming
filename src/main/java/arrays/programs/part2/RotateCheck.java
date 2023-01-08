package arrays.programs.part2;

public class RotateCheck {

	public static void main(String[] args) {
		int[] arr = { 12, 17, 1, 3, 6, 11 };
		int noOfRotations = checkRotations(arr);
		System.out.println(noOfRotations);
	}

	public static int checkRotations(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return i + 1;
		}
		return 0;
	}

}
