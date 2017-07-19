package lesson170719.swap;

public class PairExample {
	

	
	public static void main(String[] args) {

		Pair<String> pair = new Pair<>("one", "two");
		
		System.out.println(pair.first + " " + pair.second);

		swap(pair);
		
		System.out.println(pair.first + " " + pair.second);
		
	}

	private static <T> void swap(Pair<T> pair) {
		T tmp = pair.first;
		pair.first = pair.second;
		pair.second = tmp;
	}
	
}

class Pair<E> {
	
	public Pair(E f, E s) {
		first = f;
		second = s;
	}
	
	E first;
	E second;
}
