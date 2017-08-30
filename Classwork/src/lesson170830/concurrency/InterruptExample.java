package lesson170830.concurrency;

import lesson170828.concurrency.Utils;

public class InterruptExample {
	
	public static void main(String[] args) {
		
		System.gc();
		
//		Thread.currentThread().interrupt();
		
		Thread t = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		t.start();
		
		Utils.pause();
		
		t.interrupt();
		
		
		
	}

}
