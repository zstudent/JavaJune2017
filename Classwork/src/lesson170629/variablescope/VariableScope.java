package lesson170629.variablescope;

public class VariableScope {
	
	
	static class A {
		int x;
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		
		m();
	}


	private static void m() {
		int x = 0;
		
		if (x > 0) {
			int y = 10;
//			int x = 20;  ERROR!
			
		}
		
	}

	static int x = 0;
}
