package arrays.programs;

import java.util.Scanner;

public class BasicsOfArray {

	public static void main(String[] args) {
		int[] arr = takeInput();
		printArr(arr);
		
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the value at "+i+"th index: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void printArr(int[] arr) {
		int  size = arr.length;
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

}
