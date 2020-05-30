package feu;

import java.util.Scanner;

public class HelloSomeone {

	public static void main(String[] args) {
		System.out.println("Wen möchtest Du grüßen?");

		Scanner scanner = new Scanner(System.in);
		String toBeGreeted = scanner.next();

		System.out.println("Hello, " + toBeGreeted + "!");
		scanner.close();
	}

}
