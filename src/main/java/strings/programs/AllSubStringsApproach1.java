package strings.programs;

public class AllSubStringsApproach1 {

	public static void main(String[] args) {
		String str = "abcd";
		printAllPossibleSubStrings(str);

	}

	public static void printAllPossibleSubStrings(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(str.substring(i, j));
				System.out.println();
			}
		}
	}

}
