package lesson170901.reflection;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassLoadExample {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		while (true) {
			System.out.print("Enter task name: ");
			String taskName = scanner.nextLine();
			
			try {
				Class<?> clazz = Class.forName(taskName);
				
				Object newInstance = clazz.newInstance();
				
				if (!(newInstance instanceof Runnable)) {
					System.out.println("wrong class: not Runnable");
					continue;
				} 
				
				service.execute((Runnable) newInstance);
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
}
