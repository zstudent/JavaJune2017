package lesson170714.encapsulation.part3;

public class NeighbourOfA {
	
	public static void main(String[] args) {
		
//		A.m1();  non static, can't call
//		A.m2();
//		A.m3();
//		A.m4();
		
		
		A a = new A();
		
//		a.m1();  Can't call private
		a.m2();
		a.m3();
		a.m4();
	}

}
