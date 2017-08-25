package lesson170825.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap2 {
	
	public static void main(String[] args) {
		
		List<String> empty = Arrays.asList();
		
		List<String>  list1 = Arrays.asList("one", "two", "three");
		
		List<String>  list2 = Arrays.asList("один", "два", "три");
		
		Stream<List<String>> streamOfLists = Stream.of(list1, empty, list2);
		
//		Stream<Stream<String>> map = streamOfLists.map(list -> list.stream());
		
		Stream<String> streamOfStrings = streamOfLists.flatMap(list -> list.stream());
		
		List<String> words = streamOfStrings.collect(Collectors.toList());
		
		System.out.println(words);
		
	}

}
