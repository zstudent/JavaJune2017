package lesson170731;

import java.io.IOException;

public class OverridingThrowsExamples {

	static class MyException extends Exception {

	}

	static class A {

		public void m() throws MyException {

		}

	}

	static class B extends A {
		@Override
		public void m() {

		}
	}

	static class C extends A {
		@Override
		public void m() throws MyException {
		}
	}

	public static void main(String[] args) {

		A a = new C();

		process(a);
	}

	private static void process(A a) {
		try {
			a.m();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
