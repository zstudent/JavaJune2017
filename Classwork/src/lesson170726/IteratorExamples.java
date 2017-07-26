package lesson170726;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one", "two", "three");
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Iterator<String> iterator2 = new Iterator<String>() {

			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public String next() {
				return "hello";
			}
		};
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

}
