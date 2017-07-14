package lesson170714.inheritance.part2;

import java.util.Random;

public class Linkage {
	
	static class Processor {
		int process(int[] a) {
			int sum = 0;
			for (int value : a) {
				sum += value;
			}
			return sum;  // back
		}
	}
	
	static class AnotherProcessor extends Processor {
		
		@Override
		int process(int[] a) {
			int sum = super.process(a);
			return -sum;
		}
	}
	
	static Processor proc;
	
	static {
		Random r = new Random();
		proc = r.nextBoolean() ? new Processor() : new AnotherProcessor();
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3};
		
		int result = process(a);              /// jump  10456
		
		System.out.println(result);
		
		int alternateResult = proc.process(a);
		
		System.out.println(alternateResult);
	}


	private static int process(int[] a) {   // 10456:
		int sum = 0;
		for (int value : a) {
			sum += value;
		}
		return sum;  // back
	}

}
