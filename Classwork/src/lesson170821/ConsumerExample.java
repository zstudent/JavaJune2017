package lesson170821;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};

		Consumer<String> consumer2 = (t) -> System.out.println(t);
		Consumer<String> consumer3 = System.out::println;

		consumer3.accept("hello, world!");

		Map<String, Integer> map = new HashMap<>();

		BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String key, Integer value) {
				map.put(key, value);
			}
		};

		BiConsumer<String, Integer> biConsumer2 = (key, value) -> map.put(key,
				value);

		BiConsumer<String, Integer> biConsumer3 = map::put;
		
		biConsumer3.accept("hello", 3);
	}

}
