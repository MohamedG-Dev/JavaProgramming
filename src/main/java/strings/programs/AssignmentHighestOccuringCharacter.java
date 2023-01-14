package strings.programs;

public class AssignmentHighestOccuringCharacter {

	public static void main(String[] args) {
		String str = "aabbba";
		char result=returnHighestOccuringCharacter(str);
		System.out.println(result);

	}
	public static char returnHighestOccuringCharacter(String str) {
		char ans ='0';
		int[] arr = new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		int max = -1;
		for(int i=0;i<str.length();i++) {
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				//ans = str.charAt(i);
			}
				
		}
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)]==max)
				ans = str.charAt(i);
		}
		return ans;
	}
	

}
