package lesson170825.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseTrader {

	/*
	 * 
	 * 1 Find all transactions in the year 2011 and sort them by value (small to
	 * high).
	 * 
	 * 2 What are all the unique cities where the traders work?
	 * 
	 * 3 Find all traders from Cambridge and sort them by name.
	 * 
	 * 4 Return a string of all traders’ names sorted alphabetically.
	 * 
	 * 5 Are any traders based in Milan?
	 * 
	 * 6 Print all transactions’ values from the traders living in Cambridge.
	 * 
	 * 7 What’s the highest value of all the transactions?
	 * 
	 * 8 Find the transaction with the smallest value.
	 */

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(raoul, 2011, 400),
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));

		// 1 Find all transactions in the year 2011 and sort them by value
		// (small to high).

		List<Transaction> result1 = transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());

		System.out.println(result1);

		// 2 What are all the unique cities where the traders work?

		List<String> result2 = transactions.stream().map(Transaction::getTrader)
				.map(Trader::getCity).distinct().collect(Collectors.toList());

		System.out.println(result2);

		// 3 Find all traders from Cambridge and sort them by name.

		List<Trader> result3 = transactions.stream().map(Transaction::getTrader)
				.distinct().filter(t -> t.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());

		System.out.println(result3);

		// 4 Return a string of all traders’ names sorted alphabetically.

		String result4 = transactions.stream().map(Transaction::getTrader)
				.distinct().map(Trader::getName).sorted()
				.collect(Collectors.joining(", "));

		System.out.println(result4);

		String result4a = transactions.stream().map(Transaction::getTrader)
				.distinct().map(Trader::getName).sorted()
				.reduce("", (s, t) -> s + " " + t);

		System.out.println(result4a);

		// 5 Are any traders based in Milan?

		boolean areTHereTradersInMilan = transactions.stream()
				.map(Transaction::getTrader).distinct()
				.anyMatch(t -> t.getCity().equals("Milan"));

		System.out.println(areTHereTradersInMilan);

		// 6 Print all transactions’ values from the traders living in
		// Cambridge.

		List<Integer> result6 = transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue).collect(Collectors.toList());

		System.out.println(result6);

		// 7 What’s the highest value of all the transactions?

		Optional<Integer> max = transactions.stream().map(Transaction::getValue)
				.reduce(Integer::max);
		Optional<Integer> max2 = transactions.stream()
				.map(Transaction::getValue).max(Integer::compare);

		max.ifPresent(System.out::println);
		max2.ifPresent(System.out::println);

		// 8 Find the transaction with the smallest value.

		Optional<Transaction> min = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue));

		min.ifPresent(System.out::println);
	}

}
