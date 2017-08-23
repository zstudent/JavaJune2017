package lesson170823.streams;

import java.util.HashSet;
import java.util.stream.Stream;

public class CollectExamples {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("b", "a", "n", "a", "n", "a");
		
//		Supplier<StringBuilder>  supplier = StringBuilder::new;
//
//		BiConsumer<StringBuilder, String>  accumulator = StringBuilder::append;
//		
//		BiConsumer<StringBuilder, StringBuilder> combiner = StringBuilder::append;
		
		StringBuilder stringBuilder = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		
		System.out.println(stringBuilder.toString());

		Stream<String> stream2 = Stream.of("b", "a", "n", "a", "n", "a");
		
		HashSet<CharSequence> letters = stream2.collect(HashSet::new, HashSet::add, HashSet::addAll);
		
		System.out.println(letters);

		
	}

}
