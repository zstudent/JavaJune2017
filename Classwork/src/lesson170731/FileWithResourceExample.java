package lesson170731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWithResourceExample {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("help.txt");
			
			try {
				int read = fis.read();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
