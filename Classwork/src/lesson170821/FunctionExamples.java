package lesson170821;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExamples {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f1 = s -> s.length();
		Function<String, Integer> f2 = String::length;
		
		System.out.println(f2.apply("hello"));
		
		BiFunction<String, String, String> bf1 = (s1, s2) -> s1.concat(s2);  
		BiFunction<String, String, String> bf2 = String::concat;
		
		BinaryOperator<String> bo = String::concat;
		
		String result = bo.apply("hello, ", "world!");
		
		System.out.println(result);
		
		UnaryOperator<String>  uop = s -> s.toUpperCase();
		UnaryOperator<String>  uop2 = String::toUpperCase;
		
		System.out.println(uop2.apply("hello-bello"));
		
	}

}
