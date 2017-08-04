package lesson170802.generics;

public class InterfaceAdoptionExample {
}

abstract class A {
}

class B extends A {
}

class C extends A {
}

class X implements Doable {

	@Override
	public void doSomethingWith(A a) {
	}
}

class Y implements Doable {
	@Override
	public void doSomethingWith(A a) {
	}
}

interface Doable {
	void doSomethingWith(Object a);
}