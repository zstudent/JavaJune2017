package lesson170701.operations;

public class Loops {
	
	public static void main(String[] args) {
		
		int ii = 0;
		while (true) {
			
			if (ii > 10) {
				break;
			}
			
			System.out.println(ii);
			
			ii++;
		}
		
//		LOOP:  if (true) {
//			
//			
//			goto LOOP;
//		}
		
		
//		int x = 0;
		
//		do {
//			
//		} while (true);
		
		/*
		 * LOOP :
		 * // do something
		 * if (true) goto LOOP;
		 * 
		 * 
		 * 
		 */
		
//		for(;;) {
//			
//		}
		
		for (int i = 0; i < args.length; i++) {
			// do something
		}
		
		int j = 0;
		while (j < args.length) {
			String arg = args[j];
			System.out.println( arg );
			j++;
		}
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
	}

}
