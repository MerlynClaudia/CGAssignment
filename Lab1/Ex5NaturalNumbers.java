package Lab1;

import java.util.Scanner;

public class Ex5NaturalNumbers {
	public static int calculateSum(int n) {
		int i, Sum, sum3 = 0, sum5 = 0, sum3and5 = 0;
		for (i = 1; i <= n; ++i) {
			if (i % 3 == 0) {
				sum3 = sum3 + i;
			}
		}
		for (i = 1; i <= n; ++i) {
			if (i % 5 == 0) {
				sum5 = sum5 + i;
			}
		}
		for (i = 1; i <= n; ++i) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					sum3and5 = sum3and5 + i;
				}
			}
		}
		Sum = (sum3 + sum5) - sum3and5;
		return Sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = s.nextInt();
		System.out.println(calculateSum(n));
		s.close();
	}
}
