package lesson170704;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

	static ArrayList<String> listOfStrings = new ArrayList<>();
	
	public static void main(String[] args) {
		
		listOfStrings.add("one");
		listOfStrings.add("two");
		listOfStrings.add("two");
		listOfStrings.add("three");
		listOfStrings.add("four");
		
		System.out.println(listOfStrings);
		
		listOfStrings.remove(1);
		
		System.out.println(listOfStrings);
		
		System.out.println(listOfStrings.get(1));
		System.out.println(listOfStrings.size());
		
		String[] arrayOfStrings = {"один", "два", "три", "четыре"};
		
		System.out.println(arrayOfStrings[1]);
		
		listOfStrings.set(2, "THREE");
		
		System.out.println(listOfStrings);
		
		arrayOfStrings[2] = "ТРИ";
		
		System.out.println(Arrays.toString(arrayOfStrings));
		
		String four = new String("four");
		System.out.println("four" + " equals " + four + ": " + "four".equals(four));
		
		boolean success = listOfStrings.remove(four);
		
		System.out.println(listOfStrings + " " + success);
		
		
	}

}
