package lesson170719.iterfaces;

public class Violin extends Instrument {

	@Override
	void clean() {
		System.out.println(this.getClass().getSimpleName());
	}

}
