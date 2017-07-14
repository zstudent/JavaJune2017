package lesson170714.inheritance.part2;

import java.util.Arrays;
import java.util.List;

public class HomeBot {
	
	public static void main(String[] args) {
		
		List<Pet> pets = Arrays.asList(new Hamster(), new Dog(), new Cat());
		
		for (Pet pet : pets) {
			pet.feed();
		}
		
		Pet pet = new Dog();
		
		pet.feed();
		
		Dog dog = (Dog) pet;
		
		if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
		}
		
//		pet = new Pet();  FORBIDDEN! Pet is Abstract!
		
		Rat rat = new Rat();
		rat.feed();
		
	}

}
