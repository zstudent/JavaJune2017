package lesson170830.concurrency;

import lesson170828.concurrency.Utils;
import lesson170830.concurrency.RaceConditionExample2.Modifier;

public class ThreasStopExample {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Model model = new Model();
		
		Modifier task = new Modifier(model);
		
		Thread t = new Thread(task);
		
		t.start();
		
		Utils.pause(100);
		
		t.stop();
		
		model.check();
		
		System.out.println("finish " + model);
	}

}
