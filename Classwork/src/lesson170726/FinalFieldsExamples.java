package lesson170726;

public class FinalFieldsExamples {

	public static void main(String[] args) {
		
		A a = new A();
		
	}
	
}


class A {
	
	final int x = 10;	
	final int y;
	final int z;
	
	{
		y = 20;
//		System.out.println(z);  ERROR!
	}
	
	
	
	public A() {
		z = 30;
	}
	
}


abstract class B {
	final int k;
	
	B() {
		k = 20;
	}
}

class C extends B {
	{
		k = 10;
	}
}








