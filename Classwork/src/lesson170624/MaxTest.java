package lesson170624;

public class MaxTest {
	
	public static void main(String[] args) {
		
		System.out.println(SimpleUnit.assertEquals(MathUtils.max(10,20), 20));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(10,20), 10));
		
		System.out.println(SimpleUnit.assertEquals(MathUtils.max(10,30), 30));
		System.out.println(SimpleUnit.assertEquals(MathUtils.max(20,10), 20));
		System.out.println(SimpleUnit.assertEquals(MathUtils.max(30,10), 30));
		
		System.out.println(SimpleUnit.assertEquals(MathUtils.max(Integer.MAX_VALUE,0), Integer.MAX_VALUE));
		System.out.println(SimpleUnit.assertEquals(MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));

		System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(30,10), 10));
	}

}
