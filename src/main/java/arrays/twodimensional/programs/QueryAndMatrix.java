package arrays.twodimensional.programs;

import java.util.ArrayList;

public class QueryAndMatrix {

	public static void main(String[] args) {

	}

	public static java.util.ArrayList<Integer> query(java.util.ArrayList<java.util.ArrayList<Integer>> mat, int m,
			int n, java.util.ArrayList<String> q) {
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		int[][] intArray = mat.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
		int querySize = q.size();
		for (int i = 0; i < querySize; i++) {
			String query = q.get(i);
			char t = query.charAt(0);
			int type = t - '0';
			// System.out.println("type: "+type);
			char rc = query.charAt(1);
			// System.out.println("rc: "+rc);
			char indx = query.charAt(2);
			int index = indx - '0';
			// System.out.println("index: "+index);
			if (type == 1) {
				// System.out.println("Inside Type 1");
				if (rc == 'R') {
					for (int j = 0; j < n; j++) {
						if (intArray[index][j] == 0)
							intArray[index][j] = 1;
						else
							intArray[index][j] = 0;
					}
				} else if (rc == 'C') {
					for (int j = 0; j < m; j++) {
						if (intArray[j][index] == 0)
							intArray[j][index] = 1;
						else
							intArray[j][index] = 0;
					}
				}
			} else if (type == 2) {
				// System.out.println("Inside type 2");
				if (rc == 'R') {
					int total = 0;
					for (int j = 0; j < n; j++) {
						if (intArray[index][j] == 0)
							total++;
					}
					list.add(total);
				} else if (rc == 'C') {
					int total = 0;
					for (int j = 0; j < m; j++) {
						if (intArray[j][index] == 0)
							total++;
					}
					list.add(total);
				}
			}
		}
		return list;
	}

}
