package lesson170701.operations;

public class Example1 {
	
	public static void main(String[] args) {
		
		process(0);
		
		
		Object o = new String();
		
		
		process(o);
		
	}

	private static void process(Object o) {
		if (o instanceof String) {
			System.out.println(((String) o).length());
		}
		
	}

}
