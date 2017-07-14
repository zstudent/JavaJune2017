package lesson170714.inheritance.part2;

public class Rat extends Rodent {
	
	@Override
	protected void eat() {
		System.out.println("grab-n-run");
		makeSound();
		super.makeSound();
	}
	
	@Override
	protected void makeSound() {
		teethClac();
		super.makeSound();
		teethClac();
	}

	private void teethClac() {
		System.out.println("clac-clac");
	}

}
