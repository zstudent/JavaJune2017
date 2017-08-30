package lesson170830.concurrency;

import lesson170828.concurrency.Utils;

public class BlockedAndWaitingStatesExample {

	public static void main(String[] args) {

		Object monitor = new Object();

		Thread thread = new Thread(() -> {
			System.err.println("trying to lock monitor...");
			synchronized (monitor) {
				System.err.println("locked!");
				try {
					monitor.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		synchronized (monitor) {
			System.out.println("starting another thread...");
			thread.start();
			
			System.out.println("sleeping...");
			Utils.pause(1000);
			System.out.println(thread.getState());
			Utils.pause(4000);
			
			System.out.println("awoke!");
			
		}

	}

}
