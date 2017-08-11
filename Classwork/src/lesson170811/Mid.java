package lesson170811;

public class Mid {
	
	public static void main(String[] args) {
		
		int lo = 2_000_000_000;
		int hi = 2_000_000_010;
		
		
		int mid1 = (lo + hi) / 2;
		int mid2 = lo + (hi - lo) / 2;

		System.out.println(mid1);
		System.out.println(mid2);
		
	}

}
