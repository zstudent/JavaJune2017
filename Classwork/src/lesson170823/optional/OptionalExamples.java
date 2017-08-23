package lesson170823.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalExamples {
	
	final static Random r = new Random();
	
	public static void main(String[] args) {
		
		
		Optional<String> opt = compute();
		
		String s = opt.orElse(getDefaultValue()); // 1
		
		String s2 = opt.orElseGet(OptionalExamples::getDefaultValue);  // 2
		
	}
	
	private static String getDefaultValue() {
		// TODO Auto-generated method stub
		return null;
	}

	static public Optional<String> compute() {
		return Optional.ofNullable(r.nextBoolean()? "hello" : null);
	}

}
