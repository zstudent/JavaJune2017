package lesson170728.exceptions;

public class UseStack {

	public static void main(String[] args) {

		StringStackWithTryCatch stack = new StringStackWithTryCatch(2);

		stack.push("one");
		stack.push("two");
		System.out.println(stack.push("three"));

		StringStackWithThrow stackWithThrow = new StringStackWithThrow(2);

		boolean success = false;
		try {
			stackWithThrow.push("one");
			stackWithThrow.push("two");
			success = stackWithThrow.push("three");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(success);
	}

}
