package strings.programs;

public class AssignmentReverseEachWord {

	public static void main(String[] args) {
		String str = "racecar kayak refer";
		String result = reverseEachWord(str);
		System.out.println(result);
	}

	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				int currentEndWord = i-1;
				String reversedWord="";
				for(int j=currentWordStart;j<=currentEndWord;j++) {
					reversedWord = str.charAt(j) + reversedWord;
				}
				ans += reversedWord+" ";
				currentWordStart = i+1;
			}
		}
		int currentEndWord = i-1;
		String reversedWord = "";
		for(int j=currentWordStart;j<=currentEndWord;j++) {
			reversedWord = str.charAt(j) + reversedWord;
		}
		ans += reversedWord;
		return ans;
	}

}
