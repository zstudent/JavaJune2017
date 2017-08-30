package lesson170830.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import lesson170828.concurrency.Utils;

public class RaceConditionExample2 {
	
	static class Modifier implements Runnable {
		
		private Model model;

		public Modifier(Model model) {
			this.model = model;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				model.change(i);
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("start");
		
		Model model = new Model();
		
		Modifier task = new Modifier(model);

		ExecutorService service = Executors.newCachedThreadPool();
		
		service.execute(task);
		service.execute(task);
		service.execute(task);
		
		service.shutdown();
		
		service.awaitTermination(1, TimeUnit.HOURS);
		
		model.check();
		System.out.println("finish: " + model);
		
	}

}


class Model {
	
	int x = 0;
	int y = 0;
	
	synchronized public void change(int z) {
		x += z;
		Utils.pause(10);
		y -= z;
	}
	
	public void check() {
		if (x + y != 0) {
			throw new IllegalStateException(toString());
		}
	}
	
	@Override
	public String toString() {
		return x +"," + y;
	}
	
}
