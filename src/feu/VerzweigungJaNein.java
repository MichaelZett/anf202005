package feu;

import java.util.Scanner;

public class VerzweigungJaNein {

	public static void main(String[] args) {
		System.out.println("Gib eine Zahl ein!");
		Scanner scanner = new Scanner(System.in);

		int zahl = scanner.nextInt();

		switch (zahl) {
		case 1:
			System.out.println("Eins.");
			break;
		case 2:
			System.out.println("Zwei.");
			break;
		case 3:
			System.out.println("Drei.");
			break;
		default:
			System.out.println("Kenne ich nicht.");
		}

	}

}
