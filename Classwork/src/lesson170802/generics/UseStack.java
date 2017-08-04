package lesson170802.generics;

public class UseStack {

	
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("one");
//		s.push(1);  COMPILE ERROR
		
		Stack<Number> n = new Stack<>();
		
//		n.push("one");  COMPILE ERROR
		n.push(1);
		
	}
	
}
