package basic.programs;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		double simpleInterest = calculateSimpleInterest(2000, 20, 2);
		System.out.println(simpleInterest);

	}

	public static double calculateSimpleInterest(int p, int r, int t) {
		double SI = 0.0;
		double pr = p;
		double rt = r;
		double ti = t;
		SI = (pr * rt * ti) / 100;
		return SI;
	}

}
