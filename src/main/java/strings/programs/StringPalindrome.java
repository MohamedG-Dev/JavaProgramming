package strings.programs;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "abdba";
		boolean result = isPalindrome(str);
		System.out.println(result);
	}

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}

}
