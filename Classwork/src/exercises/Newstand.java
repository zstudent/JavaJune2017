package exercises;

import java.util.Set;
import java.util.TreeSet;

class Magazine {
	private String name;

	public Magazine(String name) {
		this.name = name;
	}

	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}

	@Override
	public String toString() {
		return name;
	}
}

public class Newstand {
	public static void main(String[] args) {
		Set<Magazine> set = new TreeSet<>();
		set.add(new Magazine("highlights"));
		set.add(new Magazine("Newsweek"));
		set.add(new Magazine("highlights"));
		System.out.println(set.iterator().next());
	}
}