package Lab1;

import java.util.Scanner;

public class Ex6Difference {
	public static int calculateDifference(int n) {
		int sumOfSquare = (n * (n + 1) * (2 * n + 1)) / 6;
		int sumOfNumbers = (n * (n + 1)) / 2;
		int squareOfSum = sumOfNumbers * sumOfNumbers;
		return Math.abs(sumOfSquare - squareOfSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		System.out.println("Difference between Sum of squares of first " + n
				+ " natural numbers and the square of its sum : " + calculateDifference(n));
		sc.close();
	}

}
