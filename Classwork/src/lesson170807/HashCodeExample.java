package lesson170807;

import java.util.HashMap;

public class HashCodeExample {
	
	public static void main(String[] args) {
		
		String s = "polygenelubricants";
		
		System.out.println(s.hashCode());
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.abs(s.hashCode()));
		System.out.println(Math.abs(s.hashCode()) % 10);
		
		HashMap<String, String> map = new HashMap<>(10, 2);
		
		
	}

}
