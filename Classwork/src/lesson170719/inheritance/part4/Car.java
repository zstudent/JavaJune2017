package lesson170719.inheritance.part4;

public class Car extends Automobile {
	private static final int STANDARD_SPEED = 150;

	private static final int STANDARD_SEATS_NUMBER = 4;
	
	private Object[] seats;
	
	public Car() {
		this(STANDARD_SEATS_NUMBER);
	}
	
	protected Car(int seatsNumber) {
		seats = new Object[seatsNumber];
	}


	public int getSpeed() {
		return STANDARD_SPEED;
	}
	
}
