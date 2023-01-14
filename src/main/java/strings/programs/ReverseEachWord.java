package strings.programs;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "abc def ghi";
		String ans = reverseEachWord(str);
		System.out.println(ans);

	}

	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				// reverse current word
				int currentEndWord = i - 1;
				String reversedWord = "";
				for (int j = currentWordStart; j <= currentEndWord; j++) {
					reversedWord = str.charAt(j) + reversedWord;
				}
				// Add it to final String
				ans += reversedWord + " ";
				currentWordStart = i + 1;
			}

		}
		// below code is to add last word in a reversed order
		int currentEndWord = i - 1;
		String reversedWord = "";
		for (int j = currentWordStart; j <= currentEndWord; j++) {
			reversedWord = str.charAt(j) + reversedWord;
		}
		// Add it to final String
		ans += reversedWord;
		currentWordStart = i + 1;
		return ans;
	}

}
