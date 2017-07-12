package lesson170712;

public class UseStack {
	
	public static void main(String[] args) {
		
		StringStack stack = new StringStack();
		
		System.out.println(stack);
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		
		System.out.println(stack);
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.tos());
		
		stack.size= -10;
		stack.elements= null;
		
		System.out.println(stack);
		System.out.println(stack.tos());
		
	}

}
