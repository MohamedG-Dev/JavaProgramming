package arrays.twodimensional.programs;

public class PrintMatrixInSpiral {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int rows = arr.length;
		int cols = arr[0].length;
		printMatrixInSpiral(arr,rows,cols);
	}
	public static void printMatrixInSpiral(int[][] arr,int m,int n) {
		int total = m*n;
		int rowStart=0,colStart=0;
		int count=0;
		while(count<total) {
			//left -> right
			for(int i=colStart;count<total&&i<n;i++) {
				System.out.print(arr[rowStart][i]+" ");
				count++;
			}
			rowStart++;
			// top -> bottom
			for(int i=rowStart;count<total&&i<m;i++) {
				System.out.print(arr[i][n-1]+" ");
				count++;
			}
			n--;
			// right - left
			for(int i=n-1;count<total&&i>=colStart;i--) {
				System.out.print(arr[m-1][i]+" ");
				count++;
			}
			m--;
			// bottom - top
			for(int i=m-1;count<total&&i>=rowStart;i--) {
				System.out.print(arr[i][colStart]+" ");
				count++;
			}
			colStart++;
		}
	}

}
