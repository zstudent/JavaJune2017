package lesson170823.streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Print20EvenNumbers {

	public static void main(String[] args) {

		Consumer<? super Integer> action = System.out::println;
		Stream.iterate(0, n -> n + 2).limit(20).forEach(action);

		for (int i = 0; i < 40; i+=2) {
			System.out.println(i);
		}
		
	}

}
