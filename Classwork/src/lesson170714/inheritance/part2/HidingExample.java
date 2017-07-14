package lesson170714.inheritance.part2;

public class HidingExample {

	public static void main(String[] args) {
		
		First.X();
		Second.X();
		
		First f = new Second();
		First.X();
		
	}
	
}
