package lesson170625.creation;

public class Fields {
	
	static class A {
		
		final int i = 10;
		
		final long timestamp = System.currentTimeMillis();
		
	}
	
	static class B {
		
		int i;  // 0
//		final int j; // undefined
		
		public void doIt(int x) {
			
		}

		public void printIt(String x) {
			
		}

		public void printState() {
			int x; // no default value!!!
			System.out.println(x);

			int y = 0; // inited
			System.out.println(y);
		}
	}
	
}
