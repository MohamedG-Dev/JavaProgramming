package basic.programs;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		// 5,9,8,4,5,6
		boolean isDec = true,isFirstTime= true;
		Scanner sc = new Scanner(System.in);
		int noOfNumbers = sc.nextInt();
		int prev = sc.nextInt();
		int n=0;
		while(n<noOfNumbers-1) {
			int current = sc.nextInt();
			if(current>prev) {
				isDec = false;
			}else if(current<prev) {
				if(isFirstTime) {
					isDec=true;
					isFirstTime=false;
				}
				if(isDec==false) {
					System.out.println(false);
					return;
				}
				
			}else {
				System.out.println(false);
				return;
			}
			prev = current;
			n++;
		}
		System.out.println(true);
		sc.close();
	}

}
