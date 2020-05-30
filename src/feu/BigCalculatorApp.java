package feu;

import java.util.Scanner;

public class BigCalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int zahl = 0;

		do {
			System.out.println("Gib eine Zahl ein!");
			while (!scanner.hasNextInt()) {
				System.out.println("Das ist keine Zahl!");
				scanner.next();
			}
			zahl = zahl + scanner.nextInt();
		} while (!scanner.hasNext("calc"));
		System.out.println("Die Summe ist: " + zahl);
		scanner.close();
	}

}
