package basic.programs;

public class SquareRootIntegral {

	public static void main(String[] args) {
		// input1 : 18 output: 4
		int n = 18;
		for(int i=1;i<n;i++) {
			if(i*i >n) {
				System.out.println(i-1);
				break;
			}
		}
	}

}
