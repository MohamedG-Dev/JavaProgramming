package arrays.twodimensional.programs;

public class AssignmentTransposeOfAMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4},{5,6}};
		int m = arr.length;
		int n = arr[0].length;
		System.out.println("Matrix before Transpose");
		printMatrix(arr);
		int[][] resultMatrix=transposeAMatrix(arr,m,n);
		System.out.println("Matrix after transpose");
		printMatrix(resultMatrix);

	}
	public static int[][] transposeAMatrix(int[][]arr,int rows,int cols) {
		int[][] transposedMatrix = new int[cols][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transposedMatrix[j][i]=arr[i][j];
			}
		}
		return transposedMatrix;
	}
	public static void printMatrix(int[][]arr) {
		int m = arr.length;
		int n= arr[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
