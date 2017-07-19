package lesson170719.inheritance.part4.examples;

import lesson170719.inheritance.part4.Car;
import lesson170719.inheritance.part4.Mercedes;
import lesson170719.inheritance.part4.SportMercedes;

public class Use {

	public static void main(String[] args) {
		
		Car car = new Mercedes();
		
		car.move(100, 100);
		
		car = new SportMercedes();
		
		car = new Car();
		car = new Car(100);
		
	}
	
}
