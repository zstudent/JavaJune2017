package lesson170710.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperProblems {
	
	public static void main(String[] args) {
		
//		List<int> list = new ArrayList<>();  ERROR!
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(0);  //  ->  list.add(new Integer(0));  Autoboxing
		list.add(null);
		
		Integer x = list.remove(0);
		
		System.out.println(x);
		
		System.out.println(list.remove(0));
		
		Integer y = list.remove(0);
		
		int yy = y.intValue();
		
		System.out.println();
		
		
	}

}
