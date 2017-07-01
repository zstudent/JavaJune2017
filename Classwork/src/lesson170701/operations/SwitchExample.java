package lesson170701.operations;

public class SwitchExample {

	static final int LOAD = 0;
	static final int SAVE = 1;
	static final int UPDATE = 2;
	static final int DELETE = 3;

	public static void main(String[] args) {

		process(10, LOAD);
		
		Object o = new Object();
		
//		switch(o) {
//		
//		}

	}

	private static void process(int i, int opCode) {
		switch (opCode) {
		case LOAD:
			//
			break;
		case SAVE:
			//
			break;
		case UPDATE:
			//
			break;
		case DELETE:
			//
			break;
		default:
			System.err.println("Uknown op code");
			break;
		}
	}
}
