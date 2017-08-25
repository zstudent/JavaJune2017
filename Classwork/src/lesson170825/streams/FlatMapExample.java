package lesson170825.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {

		String[] split = "hello".split("");
		System.out.println(Arrays.toString(split));
		
		String[] words = { "hello", "world" };
		
		// unique letters: h e l o w r d

		// Stream<String> stream = Arrays.stream(words);
		//
		// Stream<String[]> stringArrays = stream.map(s -> s.split(""));
		//
		//// Stream<Stream<String>> map = stringArrays.map(sa ->
		// Arrays.stream(sa));
		//
		// Stream<String> streamOfLetters = stringArrays.flatMap(sa ->
		// Arrays.stream(sa));
		//
		// List<String> distinctLetters =
		// streamOfLetters.distinct().collect(Collectors.toList());
		//
		// System.out.println(distinctLetters);

		// Stream<Stream<String>> map = stringArrays.map(sa ->
		// Arrays.stream(sa));

		System.out.println(Arrays.stream(words).map(s -> s.split(""))
				.flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList()));

	}

}
