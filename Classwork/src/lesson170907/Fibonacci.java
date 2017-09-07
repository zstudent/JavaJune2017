package lesson170907;

public class Fibonacci {
	
	private static final int MAX = 1000;

	static public long fib1(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		if (n <= 2) {
			return 1;
		}
		return fib1(n-1) + fib1(n-2);
	}
	
	static long[] fib = new long[MAX];
	
	static public long fib2(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		if (n <= 2) {
			return 1;
		}
		if (fib[n] == 0) {
			fib[n] = fib2(n-1) + fib2(n-2);
		}
		return fib[n];
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		long start = System.currentTimeMillis();
		
		System.out.println(fib2(100));
		
		
		long stop = System.currentTimeMillis();
		
		System.out.println("Elapsed " + (stop - start));
	}

}
