package arrays.twodimensional.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SquareMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Map<String, int[]> map = sqrMat(arr, arr.length, arr[0].length);
		for (Entry<String, int[]> m : map.entrySet()) {
			System.out.println(m.getKey());
			int[] diagMat = m.getValue();
			for(int i=0;i<diagMat.length;i++) {
				System.out.print(diagMat[i]+" ");
			}
		}

	}

	public static Map<String, int[]> sqrMat(int[][] mat, int n, int m) {
		String ans = "";
		if (m == n)
			ans = "YES";
		else
			ans = "NO";

		int[] arr = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < m; j++) {
				if (i == j) {
					arr[k] = mat[i][i];
					k++;
				}

			}
		}
		Map<String, int[]> pair = new HashMap<String, int[]>();
		pair.put(ans, arr);
		return pair;
	}
}
