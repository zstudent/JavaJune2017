package lesson170714.encapsulation.part3.other;

import lesson170714.encapsulation.part3.A;

public class HeirOfA extends A {

public static void main(String[] args) {
		
		A a = new A();
//		a.m1(); no access 
//		a.m2(); no access
//		a.m3(); no access
		a.m4();
		
		HeirOfA heir = new HeirOfA();
		
//		heir.m1();  no access
//		heir.m2();  no access
		heir.m3();
		heir.m4();

	}

}
