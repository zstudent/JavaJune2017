package lesson170728.exceptions;

public class Example2 {
	
	private static final int DEFAULT_PAUSE_IN_SECONDS = 5;


	public static void main(String[] args) {
		
		try {
			pause();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

	private static void pause() throws InterruptedException {
		pause(DEFAULT_PAUSE_IN_SECONDS);
	}


	private static void pause(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

}
