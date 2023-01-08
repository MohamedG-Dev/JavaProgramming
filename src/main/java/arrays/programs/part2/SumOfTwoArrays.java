package arrays.programs.part2;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 8, 6, 2, 4 };
		int[] arr2 = { 5, 6 };
		int[] outputArr = new int[1 + Math.max(arr1.length, arr2.length)];
		sumOfTwoArrays(arr1, arr2, outputArr);
		printArr(outputArr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] outputArr) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = Math.max(arr1.length, arr2.length);
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			outputArr[k] = sum % 10;
			carry = sum / 10;

			j--;
			i--;
			k--;
		}
		while (i >= 0) {
			int sum = arr1[i] + carry;
			outputArr[k] = sum % 10;
			carry = sum / 10;
			i--;
			k--;
		}
		while (j >= 0) {
			int sum = arr2[j] + carry;
			outputArr[k] = sum % 10;
			carry = sum / 10;
			j--;
			k--;
		}
		outputArr[0] = carry;
	}

}
