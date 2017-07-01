package lesson170629;

public class A {
	
	static final int MAX = 10;
	
	static String s = init();  // class field
	
	int x;  /// instance field

	public static String init() {
		System.out.println("init");
		return "hello";
	}
	
	static {
		System.out.println("init 2");
	}

}
