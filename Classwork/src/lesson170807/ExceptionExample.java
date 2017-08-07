package lesson170807;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		
		m();
		
		try {
			m2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m() throws RuntimeException {
		
	}

	private static void m2() throws Exception {
		
	}

}
