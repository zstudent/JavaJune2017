package lesson170804.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class DataStructuresInJava {

	public static void main(String[] args) {

		int x = 0;
		String s = "hello";

		int a[] = new int[10];

		Object[] objs = new Object[0];

		Stack<String> stack = new Stack<>();
		stack.push("one");

		List<Number> list = Arrays.asList(1, 1.3, 0b0001);

		List<Number> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(1.3);
		linkedList.add(0b001);

		Queue<String> queue = new ArrayDeque<>();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		Map<String, Integer> wordCount = new HashMap<>();

		fill(wordCount);

		Map<String, Integer> wordCount2 = new LinkedHashMap<>();
		Map<String, Integer> wordCount3 = new TreeMap<>();

	}

	private static void fill(Map<String, Integer> wordCount) {
		List<String> words = Arrays.asList("one", "two", "three", "one", "two");

		for (String word : words) {
			Integer count = wordCount.get(word);
			wordCount.put(word, count == null ? 1 : ++count);
		}
		
		System.out.println(wordCount);

	}

}
