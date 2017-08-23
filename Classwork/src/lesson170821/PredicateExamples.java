package lesson170821;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		
		Predicate<String> p1 = String::isEmpty;

		Predicate<String> p2 = s -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p1.test("hello"));
		
		BiPredicate<String, String> bp1 = (line, prefix) -> line.startsWith(prefix);
		BiPredicate<String, String> bp2 = String::startsWith;
	}

}
