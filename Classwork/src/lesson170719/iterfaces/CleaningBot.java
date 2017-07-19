package lesson170719.iterfaces;

import java.util.Arrays;
import java.util.List;

public class CleaningBot {

	public static void main(String[] args) {

		// List<Furniture> furniture =
		// Arrays.asList(new Table(), new Chair());
		//
		// List<Instrument> instruments =
		// Arrays.asList(new Violin(), new Drum());
		//
		//
		// for (Instrument instrument : instruments) {
		// instrument.clean();
		// }
		//
		// for (Furniture f : furniture) {
		// f.clean();
		// }

		List<Object> roomObjects = Arrays.asList(new Table(), new Chair(),
				new Violin(), new Drum());

		for (Object o : roomObjects) {
			if (o instanceof Instrument) {
				((Instrument) o).clean();
			}
			if (o instanceof Furniture) {
				((Furniture) o).clean();
			}
		}


	}

}
