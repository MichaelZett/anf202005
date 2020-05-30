package feu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methoden {
	private static final String NAME = "Methoden";
	private String name = "Methoden";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int zahl = Methoden.getNumberFromUserValidated(scanner, 1);

		int zahl2 = Methoden.getNumberFromUserValidated(scanner, 2);

		Methoden.calculateAndPrintResult(zahl, zahl2);

		Methoden object = new Methoden();
		object.nichtStatic();
		System.out.println(NAME);

		scanner.close();
	}

	private void nichtStatic() {
		System.out.println("Nicht static " + this.name + " - " + NAME);
	}

	private static void calculateAndPrintResult(int zahl, int zahl2) {
		int ergebnis = zahl * zahl2;
		System.out.println("Das Ergebnis ist: " + ergebnis);
	}

	private static int getNumberFromUserValidated(Scanner scanner, int count) {
		System.out.println("Wie heißt die " + count + ". Zahl?");
		int zahl = 0;
		try {
			zahl = scanner.nextInt();
		} catch (InputMismatchException e) {
			// Konsumieren des falschen Ergebnis
			scanner.next();
			System.out.println("Mensch, eine Zahl!!!");
			zahl = scanner.nextInt();
		}
		System.out.println(count + ". Zahl: " + zahl);
		return zahl;
	}

}
