package lesson170830.concurrency;

import lesson170828.concurrency.Utils;

public class VisibilityANdVolatileExample {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		Thread t = new Thread(counter);
		
		t.start();
		
		Utils.pause(5000);
		
		counter.shutdown();
		
	}

}


class Counter implements Runnable {
	
	volatile boolean stop = false;

	@Override
	public void run() {
		long count = 0;
		while (!stop) {
			count++;
		}
		System.out.println(count);
	}
	
	public void shutdown() {
		stop = true;
	}
}