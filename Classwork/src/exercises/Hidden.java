package exercises;

public class Hidden {
	
	public static void main(String[] args) {
		A a = new A();
		a.helper();
		a.change();
		
		A a2 = new B();
		
		A.helper();
		a2.change();
		
		B b = new B();
		
		B.helper();
		
		
	}
	
}


class A {
	public int x;
	private int y;
	
	static void helper() { System.out.println("Helper of A");}
	
	public void change() { System.out.println("Change of A");}
	
	protected void internal() {}
	
	private void secret() {}
	
	
}

class B extends A {
	
	public int x;   // hides
	
	@Override
	protected void internal() {
		// TODO Auto-generated method stub
		super.internal();
	}
	
	
	@Override
	public void change() {
		System.out.println("Change of B");
	}
	
	static void helper() {System.out.println("Helper of B");}  // hides
	
}