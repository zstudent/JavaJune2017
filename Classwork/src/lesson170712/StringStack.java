package lesson170712;

import java.util.Arrays;

public class StringStack {

	private static final int DEFAULT_MAX_SIZE = 3;
	private String[] elements;
	private int size;

	public StringStack() {
		this(DEFAULT_MAX_SIZE);
	}

	public StringStack(int maxSize) {
		elements = new String[maxSize];
		size = 0;
	}

	public boolean push(String string) {
		if (this.size >= this.elements.length) { // guard condition
			return false; // stack overflow
		}
		this.elements[this.size++] = string;
		return true;
		// size = size + 1;
		// size += 1;
		// size++;
	}

	public String pop() {
		if (size <= 0) { // guard condition
			return null; // stack underflow
		}
		String result = elements[--size];
		elements[size] = null;
		return result;
	}

	public int size() {
		return size;
	}

	public String tos() {
		return size <= 0 ? null : elements[size - 1];
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
	}

}
