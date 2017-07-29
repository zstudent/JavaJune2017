package lesson170728.exceptions;

public class NPEExample {
	
	public static void main(String[] args) {
		
		printOjbectInfo("hello");
		
		try {
			printOjbectInfo(null);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
		
		printOjbectInfo(new Object());
		
	}

	private static void printOjbectInfo(Object o) {
		
		if (o == null) {  // guard condition
			return;
		}
		
		System.out.println("Class name " + o.getClass().getCanonicalName());
		System.out.println("Class hash " + o.hashCode());
		System.out.println("Class string " + o.toString());
		
	}

}
