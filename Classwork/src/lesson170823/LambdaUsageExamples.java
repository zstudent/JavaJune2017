package lesson170823;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsageExamples {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Boston");
		list.add("Moscow");
		list.add("Alma-ata");
		
		System.out.println(list);
		
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
//		list.forEach( s -> System.out.println(s));
		
		list.forEach(System.out::println);
		
		list.removeIf( s -> s.length() > 6);
		
	}

}
