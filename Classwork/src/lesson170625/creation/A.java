package lesson170625.creation;

public class A {

	int i;
	long timestamp;
	
	{
		System.out.println("init A");
	}
	
	public A() {
		super();
		System.out.println("constructor A");
		i = 10;
		timestamp = System.currentTimeMillis();
	}
	
	{
		System.out.println("init2 A");
	}
}
