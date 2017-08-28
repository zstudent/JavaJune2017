package lesson170828.concurrency;

public class Utils {

	public static void pause() {
		pause(1000);
	}

	public static void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
