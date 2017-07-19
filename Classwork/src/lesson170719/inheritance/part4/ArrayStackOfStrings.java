package lesson170719.inheritance.part4;

import java.util.ArrayDeque;

public class ArrayStackOfStrings extends ArrayDeque<String>{

	@Deprecated
	@Override
	public void addLast(String e) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String removeLast() {
		throw new UnsupportedOperationException();
	}
	
	
	@Deprecated
	@Override
	public boolean add(String e) {
		throw new UnsupportedOperationException();
	}
	
	
	@Override
	public String remove() {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		
		ArrayStackOfStrings stack = new ArrayStackOfStrings();
		
		stack.add("one");
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	
	
}
