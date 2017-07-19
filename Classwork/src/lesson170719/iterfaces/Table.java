package lesson170719.iterfaces;

public class Table extends Furniture {

	@Override
	void clean() {
		System.out.println(this.getClass().getSimpleName());
	}

}
