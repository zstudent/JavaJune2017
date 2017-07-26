package lesson170726;

public class ConcstructorDependencyExample {
	
	
	static Worker create() {
		class BigTroll implements Worker {

			@Override
			public void doIt() {
				System.out.println("не буду");
			}
			
		}
		
		return new BigTroll();
	}
	
	static class B implements Worker {

		@Override
		public void doIt() {
			System.out.println("did it");
		}
		
	}

	static class A {
		
		private Worker b;

		public A(Worker b) {
			this.b = b;
		}
		
		public void setWorker(Worker b) {
			this.b = b;
		}
		
		void change() {
			b.doIt();
		}
	}
	
	public static void main(String[] args) {
		
		A a = new A(new B());
		a = new A(new B() {
			@Override
			public void doIt() {
				System.out.println("ага");
			}
		});
		
		a.change();

		class C extends B {
			@Override
			public void doIt() {
				System.out.println("c-style");
			}
		}
		
		a.setWorker(new C());
		
		a.change();
		
		a.setWorker(() -> { System.out.println("сделал!");});
		
		a.change();
		
		a.setWorker(create());
		
		private int x = 0;
		
	}

}
