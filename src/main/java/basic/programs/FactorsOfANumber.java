package basic.programs;

import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find it's factor");
		int n =sc.nextInt();
		int i = 2;
		while(i<n) {
			if(n%i==0) {
				System.out.println(i+" ");
			}
			i=i+1;
		}
	}

}
