package test1.probelms;

public class ZerosAndStarsPattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int stars = 1; stars <= i; stars++) {
				if (stars == i)
					System.out.print('*');
				else
					System.out.print(0);
			}
			for (int stars = n; stars >= i; stars--) {
				if (stars == i)
					System.out.print('*');
				else
					System.out.print(0);
			}
			for (int stars = n; stars >= i; stars--) {
				if (stars == i)
					System.out.print('*');
				else
					System.out.print(0);
			}
			for (int stars = 1; stars <= i; stars++) {
				if (stars == i)
					continue;
				else
					System.out.print(0);
			}
			System.out.println();
		}

	}

}
