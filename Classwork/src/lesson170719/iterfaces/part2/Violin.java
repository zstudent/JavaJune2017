package lesson170719.iterfaces.part2;

public class Violin extends Instrument {

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName());
	}

}
