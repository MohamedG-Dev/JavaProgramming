package arrays.programs.part2;

import java.util.ArrayList;

public class MoveAllNegativeNumbersToStart {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(-2);
		list.add(-3);
		list.add(4);
		list.add(0);
		list.add(5);

		int start = 0, end = list.size() - 1;
		while (start < end) {
			if (list.get(start) >= 0 && list.get(end) >= 0) {
				end--;
			}else if (list.get(start) >= 0 && list.get(end) < 0) {
				int temp1 = list.get(start);
				int temp2 = list.get(end);
				list.remove(start);
				list.add(start, temp2);
				list.remove(end);
				list.add(end, temp1);
				start++;
				end--;
			}else if (list.get(start) < 0 && list.get(end) >= 0) {
				start++;
				end--;
			}else {
				start++;
			}
				
		}

		System.out.println(list);
	}

}
