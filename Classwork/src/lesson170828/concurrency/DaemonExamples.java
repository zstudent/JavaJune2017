package lesson170828.concurrency;

public class DaemonExamples {
	
	public static void main(String[] args) {
		
		
		Thread t = new Thread(() -> {
			
			while (true) {
				Utils.pause();
				System.out.print("раз..");
				Utils.pause();
				System.out.println("два!");
			}
			
		});
		
		t.setDaemon(true);
		
		t.start();
		
		System.out.println(t.isAlive());
		
		System.out.println("continue...");
		Utils.pause(4000);
		System.out.println("finish");
		
		
	}

}
