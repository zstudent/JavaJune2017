package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareStrings {
	
	static class CompStrings implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return o2.length() - o1.length();
		}

//		public int compare(Object obj1, Object obj2) {   // COMPILE ERROR! 
//			String s1 = (String) obj1;
//			String s2 = (String) obj2;
//			return s1.length() - s2.length();
//		}		
		
	}
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("three", "one","eight");
		
		list.sort(new CompStrings());
		
		System.out.println(list);
		
	}

}
