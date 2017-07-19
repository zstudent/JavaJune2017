package lesson170719.iterfaces.part2;

import java.util.Arrays;
import java.util.List;

public class CleaningBot {

	public static void main(String[] args) {

		List<Cleanable> roomObjects = Arrays.asList(new Table(), new Chair(),
				new Violin(), new Drum());

		for (Cleanable cleanableObject : roomObjects) {
			cleanableObject.clean();
		}


	}

}
