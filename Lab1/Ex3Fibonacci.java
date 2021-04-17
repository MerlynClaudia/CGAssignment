package Lab1;

import java.util.Scanner;

public class Ex3Fibonacci {

	static int fibSeries(int nth) {

		int n0 = 0, n1 = 1, n = 0, i;
		for (i = 0; i < nth; i++) {
			n0 = n1;
			n1 = n;
			n = n0 + n1;
		}
		System.out.println("value of nth element is :" + n);
		return 0;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int nth = s.nextInt();
		fibSeries(nth);
		s.close();

	}

}
