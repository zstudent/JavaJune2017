package lesson170828.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExamples2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		
//		ExecutorService service = Executors.newSingleThreadExecutor();
//		ExecutorService service = Executors.newFixedThreadPool(2);
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for (int i = 1; i <= 5; i++) {
			int tmp = i;
			service.execute(() -> {
				System.out.println("Begin work..." + tmp);
				Utils.pause(3000);
				System.out.println("Hello, world " + tmp);
			}); 
		}
		
		service.shutdown();
		
		// do something else
		
		boolean succeed = service.awaitTermination(1, TimeUnit.HOURS);
		
		System.out.println("finish " + succeed);
		
	}

}
