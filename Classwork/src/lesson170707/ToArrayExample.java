package lesson170707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList() {{
				add("one");
				add("two");
				add("three");
		}};
		
		
		List<String> list2 = Arrays.asList("one", "two", "three");
		
//		list2.add("five");
//		list2.remove("one");
		
		list2.set(0, "один");
		
		System.out.println(list2);
		

	}

}
