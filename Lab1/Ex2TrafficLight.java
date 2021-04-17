package Lab1;

import java.util.Scanner;

public class Ex2TrafficLight {
	static void traffic(String radioButton) {
		switch (radioButton) {
		case "red": {
			System.out.println("stop");
			break;
		}
		case "yellow": {
			System.out.println("ready");
			break;
		}
		case "green": {
			System.out.println("go");
			break;
		}

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String radioButton = s.next();
		traffic(radioButton);
		s.close();

	}

}
