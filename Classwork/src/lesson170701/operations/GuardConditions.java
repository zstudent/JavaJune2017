package lesson170701.operations;

public class GuardConditions {

	public static void main(String[] args) {

		m(10);

	}

	private static void m(int i) {
//		if (i > 0) {
//			if (i % 2 == 0) {
//				if (i < 100) {
//					// actual method code
//				}
//			}
//
//		}

		if (i <= 0) {
			return;
		}
		if (i % 2 != 0) {
			return;
		}
		if (i >= 100) {
			return;
		}

		// actual method code
	}

}
