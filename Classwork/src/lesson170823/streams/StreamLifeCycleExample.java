package lesson170823.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLifeCycleExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Pete");
		list.add("John");
		list.add("Ann");

		Stream<String> mapped = list.stream().map(String::toUpperCase);
		
		list.add("Jane");
		list.add("Kate");
		list.add("Вася");
		list.add("Петя");
		
		Stream<String> limited = mapped.limit(5);
		
		
		limited.forEach(System.out::println);

		mapped.forEach(System.out::println);
	}

}
