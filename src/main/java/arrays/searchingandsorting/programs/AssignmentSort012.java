package arrays.searchingandsorting.programs;

public class AssignmentSort012 {

	public static void main(String[] args) {
		// 2 ,1, 0 ,1, 2, 0; 2 2 1 1 2 1 0 0 1 2 2
		// int[] arr = { 1,0,2,1,0,1,2,0 };
		// int[] arr = { 2, 1, 0, 1, 2, 0 };
	//	int[] arr = { 2, 2, 1, 1, 2, 1, 0, 0, 1, 2, 2 };
		int[] arr = { 2,1,0,1,2,0,0,2,1,0,1,2};
		sort012(arr);
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort012(int[] arr) {
		int n = arr.length;
		int nz = 0, i = 0, nt = arr.length - 1;
		int temp = 0;
		while (i < nt) {
			if (arr[i] == 1|| (arr[i]==0&&arr[nz]==0))
				i++;
			if (arr[nt] == 2) // ||arr[nt]==1
				nt--;
			if (arr[nz] == 0)
				nz++;
			if(i>nt)
				break;
			if (arr[i] == 0 && arr[nz] == 1) {
				temp = arr[i];
				arr[i] = arr[nz];
				arr[nz] = temp;
				//i++;
				//nz++;
			} else if (arr[i] == 2 && arr[nt] == 0) {
				temp = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp;
				//nt--;
				//i++; // need to check this
			} else if (arr[i] == 2 && arr[nt] == 1) {
				temp = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp;
				//nt--;
				//i--;
			}

		}

	}

}
