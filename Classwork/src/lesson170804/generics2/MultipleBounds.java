package lesson170804.generics2;

public class MultipleBounds {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		process(a);
		process(b);

	}

	static <T extends X & Y> void process(T thing) {
		thing.x();
		thing.y();
	}

}

interface X {
	void x();
}

interface Y {
	void y();
}

interface Z extends X, Y {}

class A implements X, Y {

	@Override
	public void y() {
		// TODO Auto-generated method stub

	}

	@Override
	public void x() {
		// TODO Auto-generated method stub

	}

}

class B implements X, Y {

	@Override
	public void y() {
		// TODO Auto-generated method stub

	}

	@Override
	public void x() {
		// TODO Auto-generated method stub

	}

}
