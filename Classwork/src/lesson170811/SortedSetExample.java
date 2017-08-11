package lesson170811;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {
	static final int MAX = 20;
	
	public static void main(String[] args) {
		
		Set<C> set = new TreeSet<>();
		
		for (int i = 0; i < MAX; i++) {
			set.add(new C());
		}
		
		System.out.println(set.toString());
		
		C c = new C();
		System.out.println(c);
		
		boolean contains = set.contains(c);
		
		System.out.println(contains);
		
	}

}


class C implements Comparable<C> {
	static Random r = new Random();
	int x = r.nextInt(SortedSetExample.MAX);
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(C other) {
		return x - other.x;
	}
	
	
	
}