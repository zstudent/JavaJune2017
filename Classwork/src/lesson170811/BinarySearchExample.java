package lesson170811;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		

		List<A> list = new LinkedList<>();
		
		for (int i = 0; i < 20; i++) {
			list.add(new A());
		}
		
		System.out.println(list);
		
		A key = new A();
		System.out.println(key);
		
		int index = Collections.binarySearch(list, key);
		
		System.out.println(index);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		index = Collections.binarySearch(list, key);
		
		System.out.println(index);
		
		
	}
	
	
}
