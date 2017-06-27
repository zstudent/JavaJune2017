package lesson170625.primitivetypes;

import java.util.LinkedList;
import java.util.List;

public class FinalizeExample {
	
	static List<A> storage = new LinkedList<>();
	
	static class A {
		
		@Override
		protected void finalize() throws Throwable {
			System.out.println("I am dying...");
		}
		
	}
	
	public static void main(String[] args) {
		while (true) {
			storage.add(new A());
		}
	}

}
