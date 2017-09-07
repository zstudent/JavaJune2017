package lesson170907;

import java.util.stream.IntStream;

public class Recursion {
	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		print(1,10);
		
		printFrom1To(10);
		printFromIto1(10);
		
	}

	private static void print(int start, int end) {
		if (start > end) {
			return;
		}
		System.out.println(start);
		print(start+1, end); // tail recursion
	}
	

	private static void printFrom1To(int i) {
		if (i < 1) {
			return;
		}
		printFrom1To(i-1);
		System.out.println(i);
	}
	
	private static void printFromIto1(int i) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		printFrom1To(i-1);   // tail recursion
	}
}
