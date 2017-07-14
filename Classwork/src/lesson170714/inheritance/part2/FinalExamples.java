package lesson170714.inheritance.part2;

public class FinalExamples {

	public static void main(String[] args) {
		
		final int x = 10;
		
		process(x+2);
//		process(10);
		
		System.out.println(x);
	}

	private static void process(final int param) {  // param = x;
		param += 10;
	}
	
	
}
