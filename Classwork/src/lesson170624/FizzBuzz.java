package lesson170624;

public class FizzBuzz {

	static String fizzBuzz(int i) {
		
		String result = "";
		
		if (i % 3 == 0) {
			result += "Fizz";
		}
		if (i % 5 == 0) {
			result += "Buzz";
		}
		return "".equals(result) ? Integer.toString(i) : result;
	}

}
