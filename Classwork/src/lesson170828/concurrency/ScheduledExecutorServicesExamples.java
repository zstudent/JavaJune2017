package lesson170828.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServicesExamples {
	
	public static void main(String[] args) {
		
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		ExecutorService realService = Executors.newCachedThreadPool();
		
		service.execute(() -> {
			System.out.println("hello");
		});
		
		service.schedule(() -> {
			System.out.println("hi there");
		}, 5, TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(() -> {
			realService.execute(() -> {
				System.out.println("ку-ку");
			});
		}, 1, 1, TimeUnit.SECONDS);
		
		service.scheduleWithFixedDelay(() -> {
			realService.execute(() -> {
				System.out.println("ква-ква");
			});
		}, 1, 1, TimeUnit.SECONDS);
		
	}

}
