package basic.programs.part2;

public class FunctionOutputQuestion {

	public static void main(String[] args) {
		int n =10;
		a(n);
		System.out.println("Inside main "+n);

	}
	
	public static void a(int n) {
		b(n);
		System.out.println("Inside a "+n);
		n++;
	}
	public static void b(int n) {
		c(n);
		System.out.println("Inisde b "+n);
		n++;
	}
	public static void c(int n) {
		System.out.println("Inside c "+n);
		n++;
	}

}
