package lesson170804.generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsExamples {
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1,2,3);
		List<Double> doubles = Arrays.asList(1.2,2.4,3.6);
		
//		List<Number> nums = ints;  COMPILE ERROR!
		
		printNumbers(ints);
		printNumbers(doubles);
		
		List<Number> nums = new ArrayList<>();
		
		List<Integer> ints2;
		
		fill(nums);
//		fill(ints2);
		
	}

	private static void fill(List<? super Number> nums) {  
		// Lower bound, Store is allowed
		nums.add(1.36);
		nums.add(1);
		nums.add(1L);
		Number number = (Number) nums.get(1);
	}

	private static void printNumbers(List<? extends Number> nums) {  
		// Upper bound, EXTract is allowed
		for (Number number : nums) {
			System.out.println(number);
		}
		
//		nums.add(1.45);   Store operation is forbidden
	}
	
	

}
