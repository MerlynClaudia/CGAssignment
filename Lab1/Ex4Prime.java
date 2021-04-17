package Lab1;

import java.util.Scanner;

public class Ex4Prime {

	static int primeNo(int integer) {
		System.out.println("The prime numbers are:");
		for (int i = 2; i <= integer; i++) {
			int c = 0;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					c = 1;
					break;
				}
			}
			if (c == 0) {
				System.out.println(i + " ");
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		primeNo(n);
		s.close();

	}

}
