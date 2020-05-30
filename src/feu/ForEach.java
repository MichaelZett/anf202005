package feu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add("String_" + i);
		}

		for (String element : list) {
			System.out.println(element);
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element + " old school");
		}

	}

}
