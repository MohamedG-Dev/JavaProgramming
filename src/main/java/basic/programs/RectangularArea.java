package basic.programs;

import java.util.Scanner;

public class RectangularArea {

	public static void main(String[] args) {
		//input: 1 1 3 3
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int result = (x2-x1)*(y2-y1);
		System.out.println(result); //output: 4
		sc.close();
	}

}
