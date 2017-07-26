package exercises;

class Rodent {
	public static Integer chew() {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

public class Beaver extends Rodent {
	public Integer chew() {
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}
