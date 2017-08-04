package lesson170802.generics;

public class GenericMethodsExamples {
	
	public static void main(String[] args) {
		
		String modified = XX.<String>modify("one");
		
		
	}

}


class XX<T> {
	
	public static <M> M modify(M t) {
		return t;
	}
	
	public <T> void m(T t) {
		
	}
	
}
