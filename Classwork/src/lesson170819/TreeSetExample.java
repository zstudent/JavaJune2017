package lesson170819;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	private static final int MAX = 100;

	public static void main(String[] args) {
		
		Random r = new Random();
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < MAX; i++) {
			set.add(r.nextInt(MAX));
		}
		
		SortedSet<Integer> subSet = set.subSet(20, 30);
		
		System.out.println(subSet);
		
		Integer ceiling = set.ceiling(50);
		
		System.out.println(ceiling);
		
		System.out.println(set.headSet(30));
		System.out.println(set.tailSet(80));
		
	}

}
