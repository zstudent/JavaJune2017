package lesson170726;

public class ObjectCreationSequence {

	public static void main(String[] args) {
//		new A1();
		new B1();
	}
}

class A1 {
	
	{
		System.out.println("init A");
	}
	
	A1() {
		System.out.println("construct A");
	}
	
}

class B1 extends A1 {
	
	{
		System.out.println("init B");
	}
	
	B1() {
		super();
		System.out.println("construct B");
	}
	
}

