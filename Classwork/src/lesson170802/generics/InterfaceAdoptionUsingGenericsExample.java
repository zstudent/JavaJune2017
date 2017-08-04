package lesson170802.generics;

public class InterfaceAdoptionUsingGenericsExample {
	
	public static void main(String[] args) {
		
		W m = new W();
		
		m.doSomethingWith("one");
//		m.doSomethingWith(new Z());  COMPILE ERROR
		
	}
	
}


class D {
}

class E  {
}

class Z implements Makeable<D> {
	@Override
	public void doSomethingWith(D a) {
	}
}

class W implements Makeable<String> {

	@Override
	public void doSomethingWith(String a) {
		
	}

}

class S implements Makeable<A> {

	@Override
	public void doSomethingWith(A a) {
	}
	
}

interface Makeable<T> {
	void doSomethingWith(T a);
}