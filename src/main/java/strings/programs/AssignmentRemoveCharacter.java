package strings.programs;

public class AssignmentRemoveCharacter {

	public static void main(String[] args) {
		String str = "aabccbaa";
		char CharacterToBeRemoved = 'a';
		String result = removeCharacter(str, CharacterToBeRemoved);
		System.out.println(result);

	}

	public static String removeCharacter(String str, char ch) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				ans += str.charAt(i);
			}
		}

		return ans;
	}

}
