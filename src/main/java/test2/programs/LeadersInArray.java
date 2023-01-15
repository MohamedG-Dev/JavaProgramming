package test2.programs;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 12, 34, 2, 0, -1 };
		leaders(arr);
		// input2: 13 17 5 4 6 // output: 17 6

	}

	public static void leaders(int[] input) {

		int m = input.length;
		boolean flag = false;
		for (int i = 0; i < m; i++) {
			for (int j = i; j < m - 1; j++) {
				if (input[j + 1] <= input[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
			if (flag == true)
				System.out.print(input[i] + " ");
		}
		if (m % 2 == 0 && flag == false)
			System.out.println(input[m - 1]);
		else if (m % 2 != 0 && flag == false)
			System.out.println(input[m - 1]);
	}
}
