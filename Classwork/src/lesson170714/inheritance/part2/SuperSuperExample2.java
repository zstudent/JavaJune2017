package lesson170714.inheritance.part2;

public class SuperSuperExample2 {
	
	static class A {
		void 	m() {
			System.out.println("one");
		}
	}
	
	static class B extends A {
	}
	
	static class C extends B {
		@Override
		void m() {
			super.m();
			System.out.println("haha");
		}
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.m();
		
		
	}

}
