package lesson170821;

public class EffectivelyFinalVariables {
	
	static int z = 1000;
	
	public static void main(String[] args) {
		
		final int x = 10;
		int y = 20;
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				//  int x = main.x;   CAPTURE
				pause(25000);
				System.out.println(x + y);
				EffectivelyFinalVariables.z = 3000;
			}
		};
		
//		x  = 30;  DO NOT  DO IT!
		
		new Thread(r).start();
		
		pause(10000);
		
		System.out.println("finish");
		
		
	}

	private static void pause(int millis) {   //  millis = 10000
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
