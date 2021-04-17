package Lab1;

import java.util.Scanner;

public class Ex7IncreasingNumber {
	static boolean checkNumber(int number) {
		String s = Integer.toString(number);
		char[] a = s.toCharArray();
		for (int i = 0; i < s.length() - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkNumber(n));
		s.close();

	}

}
