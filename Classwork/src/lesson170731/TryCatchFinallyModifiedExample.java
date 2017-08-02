package lesson170731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyModifiedExample {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("help.txt");

			try {
				int read = fis.read();
				// more code
			} finally {
				fis.close();
			}

		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
