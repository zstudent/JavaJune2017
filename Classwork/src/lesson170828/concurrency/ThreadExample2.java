package lesson170828.concurrency;

public class ThreadExample2 {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			int count = 0;
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(count++);
			}
		});
		
		thread.start();
		
	}

}
