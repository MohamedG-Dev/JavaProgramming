package basic.programs;

public class NcR {

	public static void main(String[] args) {
		int n = 10;
		int r = 6;
		int factN = 1;
		for (int i = 1; i <= n; i++) {
			factN *= i;
		}
		int factR = 1;
		for (int j = 1; j <= r; j++) {
			factR *= j;
		}
		int factNR = 1;
		for (int k = 1; k <= n - r; k++) {
			factNR *= k;
		}
		int result = factN / (factR * factNR);
		System.out.println(result);
	}

}
