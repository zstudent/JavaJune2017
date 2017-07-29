package lesson170728.exceptions;

public class DivisionByZeroExample {

	public static void main(String[] args) {

		int result = divide(10, 0);

		System.out.println(result);

	}

	private static int divide(int i, int j) {
		try {
			return i / j;
		} catch (Exception e) {
			e.printStackTrace();
			return Integer.MAX_VALUE;
		}
	}

}
