package Lab1;

import java.util.Scanner;

public class Ex1SumOfCubes {
	public void s1(int number, int counter, int sum) {

		while (number > 0) {
			int t = number % 10;
			sum = sum + (t * t * t);
			counter = counter + 1;
			number = number / 10;
		}
		System.out.println("Sum of Cube of digits of the given Number is :" + sum);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = scanner.nextInt();
		int number = no;
		int counter = 0, sum = 0;
		Ex1SumOfCubes sm = new Ex1SumOfCubes();
		sm.s1(number, counter, sum);
		scanner.close();

	}

}
