package lesson170719.iterfaces;

public class Drum extends Instrument {

	@Override
	void clean() {
		System.out.println(this.getClass().getSimpleName());
	}

}
