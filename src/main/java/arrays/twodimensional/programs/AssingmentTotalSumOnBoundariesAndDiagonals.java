package arrays.twodimensional.programs;

public class AssingmentTotalSumOnBoundariesAndDiagonals {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int rows = arr.length;
		int cols = arr[0].length;
		sumOfBoundariesAndDiagonals(arr,rows,cols);

	}
	public static void sumOfBoundariesAndDiagonals(int[][] arr,int rows,int cols) {
		int sum=0;
		int N = rows;
		// top and bottom row
		for(int i=0;i<N;i++) {
			sum += arr[0][i];
			sum += arr[N-1][i];
		}
		//left and right column
		for(int i=1;i<N-1;i++) {
			sum += arr[i][0];
			sum += arr[i][N-1];
		}
		//left and right diagonal
		for(int i=1;i<N-1;i++) {
			sum += arr[i][i];
			sum += arr[i][N-1-i];
		}
		if(N%2!=0)
			sum -= arr[N/2][N/2];
		
		System.out.println(sum);
	}

}
