package lesson170712.encapsulation;

public class OldApproach {
	
	static class Stack {
		String[] elements;
		int size;
	}
	
	public static boolean push(Stack This, String value) {
		if (This.size >= This.elements.length) {
			return false;
		}
		This.elements[This.size++] = value;
		return true;
	}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		push(stack, "one");
		
		stack.size = Integer.MIN_VALUE;
		stack.elements = null;
		
	}
	

}
