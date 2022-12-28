package basic.programs.part2;

public class SumProgram {

	public static void main(String[] args) {
		int a = 6, b = 4;
		int resultInt = sum(a, b);
		System.out.println(resultInt);
		double resultDouble = sum(a,b,10.5);
		System.out.println(resultDouble);
		System.out.println();
		printEvenNumbers(3, 17);

	}

	public static int sum(int a, int b) {
		int ans = a + b;
		return ans;
	}
	
	public static double sum(int a,int b, double c) {
		double ans = a+b+c;
		return ans;
	}
	
	public static void printEvenNumbers(int start,int end) {
		if(start %2 !=0) {
			start++;
		}
		for(int i=start;i<=end;i+=2) {
			System.out.println(i);
		}
	}

}
