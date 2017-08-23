package lesson170821;

public class AnonymousAsLambdaDemo {
	
	public static void main(String[] args) {
		
		Runnable procedure = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello, world");
			}
		};
		
		Runnable procedure2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("прощай, жестокий мир...");
			}
		};
		
		process(procedure);
		process(procedure2);
		
		algorithm(procedure, procedure2);
		
	}

	private static void algorithm(Runnable step1, Runnable step2) {
		step1.run();
		step2.run();
	}

	private static void process(Runnable procedure) {
		procedure.run();
	}

}
