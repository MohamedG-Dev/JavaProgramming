package test1.probelms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 371;
		int noOfDigits = 0;
		int temp1 = n,temp2=n;
		double sum=0;
		int rem=0;
		
		while(temp1>0) {
			noOfDigits++;
			temp1/=10;
		}
		//System.out.println(noOfDigits);
		while(temp2>0) {
			rem = temp2%10;
			sum += Math.pow(rem, noOfDigits);
			temp2=temp2/10;
			
		}
		int num = (int) sum;
		if(num==n) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
