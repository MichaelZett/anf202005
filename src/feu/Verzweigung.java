package feu;

import java.util.Scanner;

public class Verzweigung {

	public static void main(String[] args) {
		System.out.println("Gib eine Zahl ein!");
		Scanner scanner = new Scanner(System.in);

		int zahl = scanner.nextInt();

		boolean istNull = zahl == 0;
		boolean istEins = zahl == 1;

		if (istNull) {
			System.out.println("Das ist die Null.");
		} else if (istEins) {
			System.out.println("Das ist die Eins.");
		} else {
			System.out.println("Das ist weder Null noch Eins.");
		}
		scanner.close();
	}

}
