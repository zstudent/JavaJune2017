package lesson170804.generics2;

public class BoundsExample {
	
	public static void main(String[] args) {
		
		double result = min(1.6,3.0);  // type inference, Double
		
		System.out.println(result);
		
		System.out.println(min("hello", "Hello"));
	}
	
	static <T extends Comparable<T>> T min(T a, T b) {
		return a.compareTo(b) < 0 ?  a : b;
	}

	static Comparable min2(Comparable a, Comparable b) {
		return a.compareTo(b) < 0 ?  a : b;
	}
	
}
