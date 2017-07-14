package lesson170714.inheritance.part2;

public class SuperSuperExample {
	
	static class A {
		void m() {
			System.out.println("one");
		}
	}
	
	static class B extends A {
		@Override
		void m() {
			System.out.println("two");
		}
	}
	
	static class C extends B {
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.m();
		
		A a = c;
		
		a.m();
		
	}

}
