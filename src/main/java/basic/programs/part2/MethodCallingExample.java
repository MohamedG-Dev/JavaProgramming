package basic.programs.part2;

public class MethodCallingExample {

	public static void main(String[] args) {
		a();
		System.out.println("Inside Main method");

	}

	public static void a() {
		b();
		System.out.println("Inside A method");
	}

	public static void b() {
		System.out.println("Inside B method");
	}

}
