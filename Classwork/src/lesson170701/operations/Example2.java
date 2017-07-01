package lesson170701.operations;

public class Example2 {
	
	public static void main(String[] args) {
		
		process("Zaal");
		process("");
		process(null);
		
		int i = 0;
		
		int j = 0;
		
		j = i = 10;
		
	}

	private static void process(String s) {
		
		if (s != null && s.length() > 0) {
			System.out.println("Hello, " + s);
		}
		
	}

}
