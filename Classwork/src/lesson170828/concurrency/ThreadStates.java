package lesson170828.concurrency;

public class ThreadStates {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (Thread.State state : Thread.State.values()) {
			System.out.println(state);
		}
		
		System.out.println();
		
		Thread t = new Thread(() -> {
			while (true) {}
		});
		
		System.out.println(t.getState());
		
		t.start();

		System.out.println(t.getState());
		
		Thread main = Thread.currentThread();
		System.out.println(main.toString());
		
		Thread t2 = new Thread(() -> {
			System.out.println(Thread.currentThread());
			Utils.pause(5000);
		});
		
		t2.start();
		
		System.out.println("joining...");
		t2.join();
		System.out.println("joined!!");
		
		System.out.println(t2.getState());
		
		
	}

}
