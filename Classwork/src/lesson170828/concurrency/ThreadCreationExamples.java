package lesson170828.concurrency;

public class ThreadCreationExamples {

	public static void main(String[] args) {
		
		new Thread(() -> {
			System.out.println("Hello, world! I am parameter");
		}).start();
		
		
		new Thread() {
			
			@Override
			public void run() {
				System.out.println("Hello, world, I am anonymous");
			};
			
		}.start();
		
		new MyThread().start();
		
	}
	
}


class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello, I am subclass, my thread!");
	}
	
}