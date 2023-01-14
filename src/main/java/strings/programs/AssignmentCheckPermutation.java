package strings.programs;

public class AssignmentCheckPermutation {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cba";
		boolean isPermutated = checkPermutation(str1, str2);
		System.out.println(isPermutated);

	}

	public static boolean checkPermutation(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		if (m != n)
			return false;
		boolean result = checkFrequency(str1, str2);
		return result;
	}

	public static boolean checkFrequency(String str1, String str2) {
		int[] arr = new int[255];
		for (int i = 0; i < str1.length(); i++)
			arr[str1.charAt(i) - 'a']++;
		for (int i = 0; i < str2.length(); i++)
			arr[str2.charAt(i) - 'a']--;
		for (int i = 0; i < str1.length(); i++) {
			if (arr[str1.charAt(i) - 'a'] != 0)
				return false;
		}
		return true;
	}

}
