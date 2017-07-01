package lesson170629.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenomeWithSort {

	private static final int GENOME_SIZE = 300000;
	private static final int WORD_SIZE = 4;

	static class Word implements Comparable<Word> {
		byte[] data;
		int offset;

		public Word(byte[] data, int i) {
			this.data = data;
			offset = i;
		}

		@Override
		public int compareTo(Word otherWord) {
			for (int i = 0; i < WORD_SIZE; i++) {
				int diff = data[offset + i] - data[otherWord.offset + i];
				if (diff != 0) {
					return diff;
				}
			}
			return 0;
		}

	}

	public static void main(String[] args) {

		byte[] data = DataGenerator.generate(GENOME_SIZE);

		List<Word> list = new ArrayList<>();

		for (int i = 0; i < data.length - WORD_SIZE; i++) {
			list.add(new Word(data, i));
		}

		Collections.sort(list);

		for (Word word : list) {
			byte[] wordBytes = Arrays.copyOfRange(data, word.offset,
					word.offset + WORD_SIZE);
			System.out.println(Arrays.toString(wordBytes));
		}

	}

}
