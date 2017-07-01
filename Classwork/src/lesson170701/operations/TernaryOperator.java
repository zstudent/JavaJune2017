package lesson170701.operations;

public class TernaryOperator {
	
	
	public static void main(String[] args) {
		System.out.println(m(10));
	}
	
	private static String m(int i) {
		return i < 0 ? "Negative" : "Positive";
	}
	

}
