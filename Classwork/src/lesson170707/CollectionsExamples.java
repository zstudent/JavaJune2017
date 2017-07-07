package lesson170707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {
	
	public static void main(String[] args) {
		
		ArrayList<String>  list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		
//		unmodifiableList.add("four");
		unmodifiableList.set(0, "один");
		
	}

}
