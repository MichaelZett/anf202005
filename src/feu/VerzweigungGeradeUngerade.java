package feu;

import java.util.Scanner;

public class VerzweigungGeradeUngerade {

	public static void main(String[] args) {
		System.out.println("Gib eine Zahl ein!");
		Scanner scanner = new Scanner(System.in);

		int zahl = scanner.nextInt();

		boolean istGerade = zahl % 2 == 0;

		if (istGerade) {
			System.out.println(zahl + " ist gerade.");
		} else {
			System.out.println(zahl + " ist ungerade.");
		}
	}

}
