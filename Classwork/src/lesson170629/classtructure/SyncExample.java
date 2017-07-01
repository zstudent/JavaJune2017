package lesson170629.classtructure;

public class SyncExample {
	
	static void classMethod() {
		synchronized (SyncExample.class) {
			
		}
	}
	
	
	void instanceMethod() {
		synchronized (this) {
			
		}
		
	}

}
