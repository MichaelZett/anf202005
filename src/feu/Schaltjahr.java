package feu;

public class Schaltjahr {

	public static void main(String[] args) {
		boolean result2020 = Schaltjahr.isSchaltjahr(2020); // wahr
		boolean result2000 = Schaltjahr.isSchaltjahr(2000); // wahr
		boolean result1900 = Schaltjahr.isSchaltjahr(1900); // falsch
		boolean result2003 = Schaltjahr.isSchaltjahr(2003); // falsch

		System.out.println("1900: " + result1900 //
				+ " - 2000: " + result2000 //
				+ " - 2020: " + result2020 //
				+ " - 2003: " + result2003);
	}

	private static boolean isSchaltjahr(int jahr) {
//		a) Ein Jahr ist kein Schaltjahr, 
		// wenn die Jahreszahl nicht durch 4 teilbar ist.
//	b) Ein Jahr ist ein Schaltjahr, wenn die Jahreszahl durch 4, 
		// aber nicht durch 100 teilbar ist.
//	c) Ein Jahr ist ebenfalls ein Schaltjahr, 
		// wenn die Jahreszahl durch 4 und durch 400 teilbar ist.

		boolean nichtTeilbarDurch4 = jahr % 4 != 0;
		if (nichtTeilbarDurch4) {
			return false;
		} else {
			boolean teilbarDurch400 = jahr % 400 == 0;
			boolean nichtTeilbarDurch100 = jahr % 100 != 0;
			return teilbarDurch400 || nichtTeilbarDurch100;
		}
	}

}
