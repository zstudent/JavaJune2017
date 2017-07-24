package lesson170724;

public class TaggedInterfaceDemo {
	
	public static void main(String[] args) {
		
		X x = new X();
		
		Y y = new Y();
		
		process(x);
		process(y);
		
	}

	private static void process(Object object) {
		if (object instanceof Tag) {
			
		}
	}
	

}


interface Tag {
	
}


class X implements Tag {
	
}

class Y {
	
}