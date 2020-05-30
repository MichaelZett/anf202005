package feu;

import java.util.Scanner;

public class BigCalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String eingabe = "0";
		int ergebnis = 0;
		System.out.println("Bitte eingabe...");
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				ergebnis = ergebnis + Integer.parseInt(eingabe);
				System.out.println("Bitte eingabe...");
			} else {
				System.out.println("Berechne Endergebnis");
				System.out.println("Das Ergebnis ist: " + ergebnis);
			}
		}

		scanner.close();
	}

}
