package lesson170629;

public class StaticInitSequence {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		System.out.println(A.MAX);
		
		A a;
		
		
		Thread.sleep(3000);
		
		System.out.println(A.init());
		
		Thread.sleep(3000);
		System.out.println("create");
		a = new A();
		a = new A();
		a = new A();
		a = new A();
		a = new A();
		a = new A();
		a = new A();
		System.out.println(A.s);
		System.out.println(a.s);
		
	}
	
	

}
