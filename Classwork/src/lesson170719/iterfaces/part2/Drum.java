package lesson170719.iterfaces.part2;

public class Drum extends Instrument {

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName());
	}

}
