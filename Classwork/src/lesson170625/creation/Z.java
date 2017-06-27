package lesson170625.creation;

public class Z {
	
	static int s = 99;
	
	static {
	
		System.out.println("static init");
	}
	
	long timestamp = System.currentTimeMillis();

	{
		System.out.println("init");
	}
	
	
	Z() {
		System.out.println("cons");
	}

}
