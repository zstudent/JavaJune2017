package lesson170719.iterfaces.examples;

public class RunnableExamples3 {
	
	public static void main(String[] args) {
		
		Runnable task = new Task();
		
		Thread thread = new Thread(task);
		
		thread.start();
		
		task.run();
		
		
	}

}


