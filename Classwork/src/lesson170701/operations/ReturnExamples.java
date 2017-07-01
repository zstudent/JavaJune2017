package lesson170701.operations;

import java.util.Random;

public class ReturnExamples {
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage...");
			return;
		}
		
		int x = m();
		
		return;
	}

	private static int m() {
		
		int result = 0;
		
		Random random = new Random();
		if (random.nextBoolean()) {
			result = 10;
		}
		// do something
		
		return result;
	}

}
