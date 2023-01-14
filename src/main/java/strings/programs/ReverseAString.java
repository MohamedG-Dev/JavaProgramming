package strings.programs;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "abcde";
		String result = reversedString(str);
		System.out.println(result);

	}

	public static String reversedString(String str) {
		String reversedStr = "";
		// for (int i = str.length() - 1; i >= 0; i--) {
		// reversedStr += str.charAt(i);
		// }

		// The other way to print the string in a reversed fashion
		for (int i = 0; i < str.length(); i++) {
			reversedStr = str.charAt(i) + reversedStr;
		}
		return reversedStr;
	}

}
