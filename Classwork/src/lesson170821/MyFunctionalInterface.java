package lesson170821;

public class MyFunctionalInterface {
	
	public static boolean checkSumIsZero(int x, int y, int z) {
		return x + y + z == 0;
	}
	
	public static boolean checkProductIsZero(int x, int y, int z) {
		return x * y * z == 0;
	}
	
	public static void main(String[] args) {
		
		//  int int int  ->  boolean
		
		TriIntToBoolean t = (x,y,z) -> checkSumIsZero(x,y,z);
		TriIntToBoolean t2 = MyFunctionalInterface::checkSumIsZero;
		TriIntToBoolean t3 = MyFunctionalInterface::checkProductIsZero;
		
		boolean test = t3.test(10, 10, 10);
		System.out.println(test);
	}
	

}

@FunctionalInterface
interface TriIntToBoolean {
	boolean test(int x, int y, int z);
	default void x() {}
}



