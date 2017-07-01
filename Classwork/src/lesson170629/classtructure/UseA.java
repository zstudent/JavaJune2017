package lesson170629.classtructure;

public class UseA {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		A a2 = new A();
		
		System.out.println(A.compare(a1, a2));
		
		System.out.println(a1.compare(a2));
		
//		A.compare(this, a2);
		
		System.out.println(A.instanceCounter);
		
	}

}
