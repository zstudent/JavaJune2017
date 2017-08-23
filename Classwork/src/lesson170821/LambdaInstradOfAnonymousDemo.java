package lesson170821;

public class LambdaInstradOfAnonymousDemo {

	public static void main(String[] args) {

		Runnable procedure = () -> System.out.println("hello, world");

		Runnable procedure2 = () -> {
			System.out.println("прощай, жестокий мир..." + procedure);
		};

		process(procedure);
		process(procedure2);

		algorithm(procedure, procedure2);
		
		new Thread(procedure2).start();

	}

	private static void algorithm(Runnable step1, Runnable step2) {
		step1.run();
		step2.run();
	}

	private static void process(Runnable procedure) {
		procedure.run();
	}

}
