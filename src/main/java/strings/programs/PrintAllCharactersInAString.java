package strings.programs;

public class PrintAllCharactersInAString {

	public static void main(String[] args) {
		String str = "java is an object-oriented language";
		printAllChars(str);
	}

	public static void printAllChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
