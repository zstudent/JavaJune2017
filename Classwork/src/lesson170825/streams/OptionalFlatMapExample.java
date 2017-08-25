package lesson170825.streams;

import java.util.Optional;

public class OptionalFlatMapExample {

	public static void main(String[] args) {
		
		Person p = new Person();
		Car car = new Car();
		Insurance in = new Insurance("Renessance");
		car.insurance = Optional.of(in);
		p.car = Optional.of(car);
		
		System.out.println(getCarInsuranceName(null));
		System.out.println(getCarInsuranceName(new Person()));
		System.out.println(getCarInsuranceName(p));
	}
	
	
	static public String getCarInsuranceName(Person person) {
//		Optional<Person> ofPerson = Optional.ofNullable(person);
////		Optional<Optional<Car>> map = ofPerson.map(p -> p.getCar());
////		Optional<Car> fmap = ofPerson.flatMap(p -> p.getCar());
//		
//		Optional<Car> ofCar = ofPerson.flatMap(Person::getCar);
//		
//		Optional<Insurance> ofInsurance = ofCar.flatMap(Car::getInsurance);
//		
//		Optional<String> ofName = ofInsurance
//				.map(Insurance::getName);
//		
//		return ofName.orElse("Unknown");
//
		
		return Optional.ofNullable(person)
				.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("Unknown");

	}

}

class Person {
	Optional<Car> car = Optional.empty();

	public Optional<Car> getCar() {
		return car;
	}
}

class Car {
	Optional<Insurance> insurance = Optional.empty();

	public Optional<Insurance> getInsurance() {
		return insurance;
	}
}

class Insurance {
	String name;

	public Insurance(String string) {
		name = string;
	}

	public String getName() {
		return name;
	}
}
