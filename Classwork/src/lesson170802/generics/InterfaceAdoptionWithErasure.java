package lesson170802.generics;

public class InterfaceAdoptionWithErasure {

	public static void main(String[] args) {
		
		Cleaning2 c = new Cleaner2();
		c.clean("one");
//		c.clean(1);   COMPILE ERROR
		
		Cleaning2 c2 = c;
		
		c2.clean(1);
		
		c2 = new StringCleaner2();
		c2.clean(1);
	}
	
}

interface Cleaning2 {
	void clean(Object t);
}

class StringCleaner2 implements Cleaning2 {
	@Override
	public void clean(Object t) {
		String s = (String) t;
		System.out.println("cleaning " + s);
	}
	
}

class Cleaner2 implements Cleaning2 {

	@Override
	public void clean(Object t) {
		System.out.println("cleaning " + t);
	}
	
}