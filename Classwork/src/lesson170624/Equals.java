package lesson170624;

public class Equals {
	
	
	public static void main(String[] args) {
		String a;
		
		String b;
		
		int i = 10;
		
		if (0 == i) {
			
		}
		
		
		compare(null);
		
	}

	private static void compare(String a) {
		if ("Hello".equals(a)) {
			System.out.println("Equals");
		}
	}

}
