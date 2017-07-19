package lesson170719.inheritance.part4;

public class Automobile extends Vehicle {

	@Override
	public void move(int x, int y) {
		System.out.println("moves to " + x + ", " + y);
	}

}
