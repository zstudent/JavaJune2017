package lesson170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lesson170809.Dictionary.Pair;

public class Dictionary implements Iterable<Pair> {

	private static final int MAX = 3;

	public static class Pair {
		public Pair(String key2, String value2) {
			key = key2;
			value = value2;
		}

		String key;
		String value;
	}

	List<Pair>[] data = new List[MAX];

	public void put(String key, String value) {
		int index = hash(key);
		if (data[index] == null) {
			data[index] = new ArrayList<>();
		}

		Pair pair = getPair(key);

		if (pair == null) {
			data[index].add(new Pair(key, value));
			return;
		}

		pair.value = value;

	}

	private int hash(String key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public String get(String key) {
		Pair pair = getPair(key);
		return pair == null ? null : pair.value;
	}

	private Pair getPair(String key) {
		int index = hash(key);
		List<Pair> list = data[index];
		if (list == null) { // guard condition
			return null;
		}
		for (Pair pair : list) {
			if (pair.key.equals(key)) {
				return pair;
			}
		}

		return null;
	}

	@Override
	public Iterator<Pair> iterator() {
		return new Iterator<Dictionary.Pair>() {
			int currentElement = -1;
			Iterator<Pair> listIterator = null;

			@Override
			public boolean hasNext() {

				if (listIterator != null && listIterator.hasNext()) {
					return true;
				}

				listIterator = null;

				for (++currentElement; listIterator == null
						&& currentElement < data.length; currentElement++) {
					List<Pair> list = data[currentElement];
					if (list == null) {
						continue;
					}
					listIterator = list.iterator();
					if (!listIterator.hasNext()) {
						continue;
					}
					return listIterator.hasNext();
				}

				return false;
			}

			@Override
			public Pair next() {
				if (!hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
		};
	}

}
