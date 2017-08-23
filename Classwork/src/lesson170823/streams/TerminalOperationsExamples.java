package lesson170823.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TerminalOperationsExamples {
	
	public static void main(String[] args) {
		
		Supplier<Double> supplier = Math::random;
		Stream<Double> s1 = Stream.generate(supplier);
		Stream<Double> s2 = s1.limit(20);
		
		System.out.println(s1 == s2);
		
		Comparator<? super Double> comparator = Double::compare;
		Optional<Double> minOpt = s2.min(comparator);
		Double min = minOpt.orElse(0.0);
		
		System.out.println(min);
	}

}
