package lesson170830.concurrency;

import lesson170828.concurrency.Utils;

public class InterruptExample2 {
	
	public static void main(String[] args) {
		
		Counter2 counter = new Counter2();
		Thread t = new Thread(counter);
		
		t.start();
		
		Utils.pause(5000);
		
		counter.shutdown();
		
	}

}


class Counter2 implements Runnable {
	
	private Thread currentThread;

	@Override
	public void run() {
		currentThread = Thread.currentThread();
		long count = 0;
		while (!Thread.currentThread().isInterrupted()) {
			count++;
		}
		System.out.println(count);
	}
	
	public void shutdown() {
		currentThread.interrupt();
	}
}