package arrays.twodimensional.programs;

import java.util.Scanner;

public class TakeInputAndPrint2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();
		int[][] twoDArr = new int[rows][cols];
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.println("Enter the " + i + "column" + j + " row");
				twoDArr[j][i] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(twoDArr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
