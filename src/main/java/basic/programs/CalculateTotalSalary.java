package basic.programs;

public class CalculateTotalSalary {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int basic = sc.nextInt();
		String grade = sc.next();
		double hra = basic * 0.2;
		double da = basic * 0.5;
		int allow = 0;
		if (grade.charAt(0) == 'A') {
			allow = 1700;
		} else if (grade.charAt(0) == 'B') {
			allow = 1500;
		} else {
			allow = 1300;
		}
		double pf = basic * 0.11;
		double totalSalary = basic + hra + da + allow - pf;
		System.out.println(Math.round(totalSalary));
	}

}
