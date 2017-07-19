package lesson170719.iterfaces.part2;

public class Chair extends Furniture {

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName());
	}


}
