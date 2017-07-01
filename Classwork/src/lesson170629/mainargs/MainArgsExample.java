package lesson170629.mainargs;

public class MainArgsExample {

	public static void main(String[] args) {
//		System.out.println(args);
//		System.out.println(args.length);
		
		if (args.length == 0) {   // guard condition
			System.out.println("Usage: java MainArgsExample <name> [<age>]");
			System.exit(0);
		}
		
		for (String parameter : args) {
			System.out.println(parameter);
		}
		
		
	}
	
	
}
