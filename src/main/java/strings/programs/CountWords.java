package strings.programs;

public class CountWords {

	public static void main(String[] args) {
		String str = "";
		int count = countTotalWords(str);
		System.out.println(count);
	}
	public static int countTotalWords(String str) {
		if(!str.isEmpty()) {
			String[] strArr = str.split(" ");
			return strArr.length;	
		}else
			return 0;
		
	}

}
