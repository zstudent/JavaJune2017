package lesson170802.generics;

public class MoreGenericMethodsExamples {
	
	public static void main(String[] args) {
		Example.staticMethod("one");
		Example.staticMethod(1);
		Example.staticMethod(new Object());
		
		Example<String> ex = new Example<>();
		Example<Integer> ex2 = new Example<>();
		
		ex.instanceMethod("one");
		ex.instanceMethod(1);
		ex.instanceMethod(MoreGenericMethodsExamples.class);
		
		Example.staticMethod(ex);
		Example.staticMethod(ex2);
	}
	
}


class Example<T> {
	
//	static T x;   COMPILE ERROR!
	
	static public <M> void  staticMethod(M m) {
		System.out.println(m.getClass().getTypeName());
	}
	
	public <N> void  instanceMethod(N n) {
		System.out.println(n);
	}
	
}