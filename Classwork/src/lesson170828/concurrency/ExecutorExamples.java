package lesson170828.concurrency;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExamples {
	
	public static void main(String[] args) {
		System.out.println("start");
		
//		ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.execute(() -> {
			Utils.pause(3000);
			System.out.println("Hello, world 1");
		}); 
		service.execute(() -> {
			Utils.pause(3000);
			System.out.println("Hello, world 2");
		}); 
		service.execute(() -> {
			Utils.pause(3000);
			System.out.println("Hello, world 3");
		});
		service.execute(() -> {
			Utils.pause(3000);
			System.out.println("Hello, world 4");
		});
		service.execute(() -> {
			Utils.pause(3000);
			System.out.println("Hello, world 5");
		});
		
//		service.shutdown();
		
		List<Runnable> tasksLeft = service.shutdownNow();
		
		System.out.println(tasksLeft);
		
		System.out.println("finish");
		
	}

}
