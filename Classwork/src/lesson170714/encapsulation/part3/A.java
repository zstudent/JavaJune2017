package lesson170714.encapsulation.part3;

public class A {
	
	private   void m1() {}
	          void m2() {}
	protected void m3() {m1();}
	public    void m4() {}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m1(); 
		a.m2();
		a.m3();
		a.m4();

	}

}


