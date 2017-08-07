package lesson170807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {

	private static final int MAX = 100000;
	static Random r = new Random();
	
	public static void main(String[] args) {
		
		List<Integer> arrayBased =  new ArrayList<>(); 
		List<Integer> linkBased =  new LinkedList<>(); 
		
		testFill(arrayBased);
		testFill(linkBased);
		
		arrayBased.clear();
		linkBased.clear();

		testFillByInsertion(arrayBased);
		testFillByInsertion(linkBased);
		
	}

	private static void testFill(List<Integer> list) {
		long start = System.nanoTime();
		fill(list);
		long stop = System.nanoTime();
		
		System.out.println("Elapsed: " + (stop - start));
	}

	private static void testFillByInsertion(List<Integer> list) {
		long start = System.nanoTime();
		fillByInsertion(list);
		long stop = System.nanoTime();
		
		System.out.println("Elapsed: " + (stop - start));
	}
	
	private static void fill(List<Integer> list) {
		for (int i = 0; i < MAX; i++) {
			list.add(r.nextInt());
		}
	}

	private static void fillByInsertion(List<Integer> list) {
		for (int i = 0; i < MAX; i++) {
			list.add(0, r.nextInt());
		}
	}
	
}
