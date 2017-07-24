package lesson170724.nested;

public class StaticExamples {
	
	static class A extends StaticExamples {

		static class B extends A {
			
		}
		
	}
	
	static class X {
		
		static int Z = 0;
		
		int state = 0;
		
		public void change() {state++;}
		
		public void evaluate() {
			this.state = 30;
			this.change();
			this.change();
		}
		
		static class Y {
			public void process() {
				StaticExamples.X.Z = 50;
				this.state = 20;
				this.change();
				this.change();
			}
		}
		
	}
	

}
