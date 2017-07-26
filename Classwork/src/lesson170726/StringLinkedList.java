package lesson170726;

import java.util.Iterator;

public class StringLinkedList implements Iterable<String> {
	
	
	private static class Node {
		String value;
		Node next;
		public Node(String value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	Node first;  // null
	
	Node last;  // null

	int size;  // 0
	
	public void add(String value) {
		Node node = new Node(value, null);
		
		if (first == null) {
			first = node;
		} else {
			last.next = node;
		}

		last = node;
		
		size++;
	}
	
	public boolean remove(String value) {
		
		boolean result = false;
		
		Node current = first;
		
		Node prev = null;
		
		while (current != null) {
			if (current.value.equals(value)) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}
		
		if (first == null) {
			last = null;
		}
		
		return result;
	}
	
	public String remove(int index) {
		// TODO  Home work
		return null;
	}
	
	@Override
	public String toString() {
		// traverse 
		
		String result = "[";

		if (first != null) {
			result += first.value;
			
			Node current = first.next;
			
			while (current != null) {
				result += ", " + current.value;
				current = current.next;
			}
		}
		
		result += "]";
		
		return result;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String> () {
			
//			Node current = StringLinkedList.this.first;
			Node nextNonProcessedNode = first;

			@Override
			public boolean hasNext() {
				return nextNonProcessedNode != null;
			}

			@Override
			public String next() {
				String result = nextNonProcessedNode.value;
				nextNonProcessedNode = nextNonProcessedNode.next;
				return result;
			}
			
		};
	}
}
