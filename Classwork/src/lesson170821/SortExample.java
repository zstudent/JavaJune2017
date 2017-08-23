package lesson170821;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class SortExample {

	public static void main(String[] args) {
		
		List<Person> staff = new ArrayList<>();

		staff.add(new Person("John", 40));
		staff.add(new Person("Pete", 20));
		staff.add(new Person("Ann", 40));
		staff.add(new Person("Jane", 32));
		staff.add(new Person("Mary", 40));
		
//		staff.sort(new NameComparator());
//	
//		System.out.println(staff);
//		
//		Comparator<Person> byAge = (p1, p2) -> p1.getAge() - p2.getAge();
//		
//		staff.sort(byAge);
		
		staff.sort(Comparator.comparingInt(Person::getAge));
		
		System.out.println(staff);
		
		staff.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
		
		System.out.println(staff);
	}
	

}

//class NameComparator implements Comparator<Person> {
//
//	@Override
//	public int compare(Person o1, Person o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}

class Person {
	final String name;
	final int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}