package lesson170726;

import java.util.Iterator;

public class UseListWIthIterator {
	
	public static void main(String[] args) {
		
		StringLinkedList list = new StringLinkedList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
