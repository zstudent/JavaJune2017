package lesson170728.exceptions;

public class Overflow extends Exception {
	
	private int size;

	public Overflow(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
}