package Lab1;

import java.util.Scanner;

public class Ex8Power {
	public static boolean checkNumber(int n) {
		int a = 0;
		if (n <= 0) {
			return false;
		}
		int i;
		for (i = n; i % 2 == 0; i = (i / 2)) {
			n = i;
		}
		a = i;
		if (a == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sca.nextInt();
		System.out.println(checkNumber(n));
		sca.close();

	}

}
