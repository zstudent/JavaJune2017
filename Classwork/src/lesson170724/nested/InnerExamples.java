package lesson170724.nested;

public class InnerExamples {
	
	int state = 0;
	
	public void change() {
		state++;
	}
	
	class Processor {
		
		public void process() {
//			InnerExamples.this.state = 20;
//			InnerExamples.this.change();
//			InnerExamples.this.change();
			state = 20;
			change();
			change();
			System.out.println(InnerExamples.this);
		}
		
	}
	
	@Override
	public String toString() {
		return "current state = " + state;
	}

}
