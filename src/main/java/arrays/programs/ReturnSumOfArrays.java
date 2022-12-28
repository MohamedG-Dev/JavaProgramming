package arrays.programs;

import java.util.Scanner;

public class ReturnSumOfArrays {

	public static void main(String[] args) {
		int[] arr = takeInput();
		int sum = sumOfArray(arr);
		System.out.println(sum);

	}

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the value at " + i + "th index: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int sumOfArray(int[] arr) {
		int size = arr.length;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
