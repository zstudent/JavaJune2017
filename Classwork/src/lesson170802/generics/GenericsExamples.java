package lesson170802.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExamples {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		list.add("one");
		list.add(1);
		list.add(null);
		list.add(new GenericsExamples());

		for (Object object : list) {
			System.out.println(object);
		}

		List<String> strings = Collections.checkedList(new ArrayList<>(),
				String.class);

		strings.add("one");
		strings.add("two");
		strings.add("three");
		// strings.add(1); COMPILE ERROR!

		List l = strings;
		l.add(1);

		printStringLength(strings);
	}

	private static void printStringLength(List<String> strings) {
		for (String string : strings) {
			System.out.println(string.length());
		}
	}

}
