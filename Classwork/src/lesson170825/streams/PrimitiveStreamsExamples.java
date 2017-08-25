package lesson170825.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreamsExamples {
	
	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		
		printStats(intStream);
		
		
	}

	private static void printStats(IntStream intStream) {
		IntSummaryStatistics summaryStatistics = intStream.summaryStatistics();
		System.out.println(summaryStatistics);
	}

}
