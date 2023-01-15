package test2.programs;

public class MinimumLengthWord {

	public static void main(String[] args) {
		String str="this is test string";
		String string =minLengthWord(str);
		System.out.println(string);

	}
	public static String minLengthWord(String input){
			String[] strArr = input.split(" ");
	    	String minString="";
	    	int minLength = Integer.MAX_VALUE;
	    	for(int i=0;i<strArr.length;i++) {
	    		if(strArr[i].length()<minLength) {
	    			minLength=strArr[i].length();
	    			minString=strArr[i];
	    		}
	    			
	    	}
			return minString;
	}
}
