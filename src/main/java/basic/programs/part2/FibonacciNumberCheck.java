package basic.programs.part2;

public class FibonacciNumberCheck {

	public static void main(String[] args) {
		System.out.println(isFibonacci(9));
	}
	
	public static boolean isFibonacci(int num) {
		int num1=0,num2=1,sum=0;
		if(num==0||num==1)
			return true;
		for(int i=0;i<num;i++) {
			sum=num1+num2;
			if(sum==num)
				return true;
			num1=num2;
			num2=sum;
		}
			return false;
	}

}
