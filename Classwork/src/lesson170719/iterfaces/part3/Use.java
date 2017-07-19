package lesson170719.iterfaces.part3;

public class Use {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		X x;
		Y y;
		Z z;
		
		z = c;
		y = b; y = c;
		x = a; x = b; x = c;
		
	}

}
