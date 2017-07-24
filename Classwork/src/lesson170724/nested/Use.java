package lesson170724.nested;


public class Use {
	
	public static void main(String[] args) {
		
		StaticExamples.X  x = new StaticExamples.X();
		
		InnerExamples ie = new InnerExamples();
		
		InnerExamples.Processor proc = ie.new Processor();
		
		proc.process();
		
	}

}
