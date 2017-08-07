package lesson170807;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<>();
		Set<String> cities2 = new LinkedHashSet<>();
		Set<String> cities3 = new TreeSet<>();
		
		cities.add("Moscow");
		cities.add("Pekin");
		cities.add("Tokio");
		cities.add("Moscow");
		cities.add("Minsk");
		cities.add("St.Petersburg");
		cities.add("Minsk");
		
		System.out.println(cities);
		
	}

}
