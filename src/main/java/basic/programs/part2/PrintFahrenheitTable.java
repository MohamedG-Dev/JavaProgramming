package basic.programs.part2;

public class PrintFahrenheitTable {

	public static void main(String[] args) {
		printFahrenheitTable(120,200,40);

	}
	
	public static void printFahrenheitTable(int start,int end,int step) {
		for(int i=start;i<=end;i+=step) {
			double C = (5*(i-32))/9;
			System.out.println(i+" "+(int)C);
		}
	}

}
