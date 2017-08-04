package lesson170802.generics;

public class InterfaceAdoption3 {

	public static void main(String[] args) {
		
		Cleaning<String> c = new Cleaner<String>();
		c.clean("one");
//		c.clean(1);   COMPILE ERROR
		
		Cleaning c2 = c;
		
		c2.clean(1);
		
		c2 = new StringCleaner();
		c2.clean(1);
		
		Cleaning<Integer> ci = new Cleaner<Integer>();
		
		c = (Cleaning) ci;
	}
	
}

interface Cleaning<T> {
	void clean(T t);
}

class StringCleaner implements Cleaning<String> {
	@Override
	public void clean(String t) {
		System.out.println("cleaning " + t);
	}
	
}

class Cleaner<T> implements Cleaning<T> {

	@Override
	public void clean(T t) {
		System.out.println("cleaning " + t);
	}
	
}