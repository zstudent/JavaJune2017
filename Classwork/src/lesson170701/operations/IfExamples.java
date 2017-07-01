package lesson170701.operations;

public class IfExamples {

	public static void main(String[] args) {

		if (args.length == 0) {  // guard condition
			System.out.println("Usage: <word>");
			System.exit(0);
		}

		process(args[0]);
	}

	private static void process(String word) {
		switch (word) {
		case "goodbye":
			System.out.println("bye-bye");
			break;
		case "hello": 
		case "hi":
			System.out.println("hi there");
			break;
		default:
			System.out.println("what?");
			break;
		case "ddd":
			break;
		}
		
	}

}
