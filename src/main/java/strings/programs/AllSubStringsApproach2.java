package strings.programs;

public class AllSubStringsApproach2 {

	public static void main(String[] args) {
		String str = "abcd";
		printAllPossibleSubStrings(str);

	}
	public static void printAllPossibleSubStrings(String str) {
		int n = str.length();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				int k = j+i-1;
				System.out.println(str.substring(j,k+1));
			}
		}
		
	}
}
