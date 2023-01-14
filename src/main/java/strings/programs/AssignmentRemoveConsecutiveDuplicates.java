package strings.programs;

public class AssignmentRemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String str = "aabccbaa";
		removeConsecutiveDuplicates(str);
	}

	public static void removeConsecutiveDuplicates(String str) {
		String ans = "" + str.charAt(0);
		int lastAddedCharacterIndex = 0;
		for (int i = 1; i < str.length(); i++) {
			if (ans.charAt(lastAddedCharacterIndex) != str.charAt(i)) {
				lastAddedCharacterIndex++;
				ans += str.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
