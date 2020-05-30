package feu;

public class Arrays {

	public static void main(String[] args) {
		String[] weekdays = new String[7];

		weekdays[0] = "Monday";
		weekdays[1] = "Tueday";
		weekdays[2] = "Wednesday";
		weekdays[3] = "Thursday";
		weekdays[4] = "Friday";
		weekdays[5] = "Saturday";
		weekdays[6] = "Sunday";

		int i = 0;
		while (i < weekdays.length) {
			System.out.println(weekdays[i]);
			i++;
		}
	}

}
