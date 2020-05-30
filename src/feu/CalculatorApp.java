package feu;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Wie heißt die erste Zahl?");

		Scanner scanner = new Scanner(System.in);
		int zahl = scanner.nextInt();
		System.out.println("Erste Zahl: " + zahl);

		System.out.println("Wie heißt die zweite Zahl?");

		int zahl2 = scanner.nextInt();
		System.out.println("Zweite Zahl: " + zahl2);

		int ergebnis = zahl * zahl2;
		System.out.println("Das Ergebnis ist: " + ergebnis);
		scanner.close();
	}

}
