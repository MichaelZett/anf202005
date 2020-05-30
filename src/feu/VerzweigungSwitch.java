package feu;

import java.util.Scanner;

public class VerzweigungSwitch {

	public static void main(String[] args) {
		System.out.println("Eingabe bitte!");
		Scanner scanner = new Scanner(System.in);

		String eingabe = scanner.next();

		switch (eingabe) {
		case "ja":
		case "j":
			System.out.println("true.");
			break;
		case "nein":
		case "n":
			System.out.println("false.");
			break;
		default:
			System.out.println("Nicht erkannte Eingabe.");
		}

		scanner.close();
	}

}
