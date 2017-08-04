package lesson170802.generics;

import java.util.ArrayList;
import java.util.List;

public class PreGenericsExamples {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("one");
		list.add(1);
		list.add(null);
		list.add(new PreGenericsExamples());

		for (Object object : list) {
			System.out.println(object);
		}

		List strings = new ArrayList();

		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add(1);

		printStringLength(strings);
	}

	private static void printStringLength(List strings) {
		for (Object object : strings) {
//			if (object instanceof String) {
				String s = (String) object;
				System.out.println(s.length());
//			}
		}
	}

}
