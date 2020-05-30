package feu;

public class Schleifen {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(String.valueOf(i + 1) + ". Durchlauf");
		}

		int i = 10;
		while (i < 10) {
			System.out.println(String.valueOf(i + 1) + ". Durchlauf while");
			i++;
		}

		int j = 10;
		do {
			System.out.println(String.valueOf(j + 1) + ". Durchlauf do-while");
			j++;
		} while (j < 10);
	}

}
