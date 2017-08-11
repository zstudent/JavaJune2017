package exercises;

import java.util.ArrayList;
import java.util.TreeSet;

public class Collections9 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(56);
		list.add(56);
		list.add(3);
		
		System.out.println(list);
		 
		TreeSet<Integer> set = new TreeSet<>(list);
		
		System.out.println(set);
		
		System.out.print(set.size());
		System.out.print(" " );
		System.out.print(set.iterator().next());
	}

}
