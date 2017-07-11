package lesson170710;

public class UseStringLinkedList {
	
	public static void main(String[] args) {
		
		StringLinkedList list = new StringLinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		
		System.out.println(list.remove("two"));
		
		System.out.println(list);
		
		list = new StringLinkedList();
		
		System.out.println(list.remove("two"));
		
		list.add("One");
		System.out.println(list.remove("two"));
		System.out.println(list.remove("One"));
		
		System.out.println(list);
	}

}
