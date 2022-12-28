package arrays.programs;

import java.util.Scanner;

public class FindingLargestElement {
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

	public static int largest(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int max = largest(arr);
		System.out.println(max);

	}

}
