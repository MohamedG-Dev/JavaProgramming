package strings.programs;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		String str = "Welcome to Coding Ninjas";
		String result = reverseStringWordWise(str);
		System.out.println(result);

	}

	public static String reverseStringWordWise(String str) {
		String ans = "";
		int i = str.length() - 1;
		int currentWordStart = str.length() - 1;
		for (; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				// reverse current word
				int currentEndWord = i + 1;
				String reversedWord = "";
				for (int j = currentEndWord; j <= currentWordStart; j++) {
					reversedWord += str.charAt(j);
				}
				// Add it to final String
				ans += reversedWord + " ";
				currentWordStart = i - 1;
			}

		}
		int currentEndWord = i + 1;
		String reversedWord = "";
		for (int j = currentEndWord; j <= currentWordStart; j++) {
			reversedWord += str.charAt(j);
		}
		// Add it to final String
		ans += reversedWord + " ";
		currentWordStart = i - 1;
		return ans;
	}

}
