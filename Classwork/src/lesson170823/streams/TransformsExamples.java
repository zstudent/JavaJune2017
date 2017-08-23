package lesson170823.streams;

import java.util.stream.Stream;

public class TransformsExamples {

	public static void main(String[] args) {

		Stream.of("b", "a", "n", "a", "n", "a").distinct()
				.forEach(System.out::print);
		System.out.println();

		Stream.of("b", "a", "n", "a", "n", "a").filter(s -> s.charAt(0) > 'c')
				.forEach(System.out::print);
		System.out.println();

		Stream.of("b", "a", "n", "a", "n", "a").limit(3)
				.forEach(System.out::print);
		System.out.println();

		Stream.of("b", "a", "n", "a", "n", "a").skip(2)
				.forEach(System.out::print);
		System.out.println();

		Stream.iterate(1, n -> n + 1).skip(5).limit(2)
				.forEach(System.out::print);

	}

}
