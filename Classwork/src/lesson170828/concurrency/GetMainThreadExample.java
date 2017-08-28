package lesson170828.concurrency;

public class GetMainThreadExample {
	
	public static void main(String[] args) {
		
		
		new Thread(() -> {
		
			Thread current = Thread.currentThread();
			
			ThreadGroup threadGroup = current.getThreadGroup();
			
			Thread[] threads = new Thread[threadGroup.activeCount()];
			
			threadGroup.enumerate(threads);
			
			for (Thread thread : threads) {
				System.out.println(thread);
			}
			
		}).start();
		
		Utils.pause(3000);
		
	}

}
