package basic.programs;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// Converting a range of Fahrenheit to Celsius at regular intervals
		// Printing the Celsius values from a start to end point with regular gaps.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the start point of Fahrenheit");
		int Start = sc.nextInt();
		System.out.println("Enter the end point of Fahrenheit");
		int End = sc.nextInt();
		System.out.println("Enter the gap that you want to skip and calculate the conversion");
		int gap = sc.nextInt();
		// Celsius = ((Fahrenheit-32)*5)/9; -- Formula
		int cel;
		while (Start <= End) {
			cel = ((Start - 32) * 5) / 9;
			System.out.println("Fahrenheit -> " + Start + ", Celsius -> " + cel);
			Start = Start + gap;
		}

	}

}
