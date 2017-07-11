package lesson170710.wrapperclasses;

import java.util.Hashtable;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		Hashtable table = new Hashtable();
		
		int[] a = {0,10,20,30};
		// 0 -> 0
		// 1 -> 10
		// 2 -> 20
		// 3 -> 30
		
		System.out.println(a[1]);
		
		a[2] = 50;
		
		table.put("Иванов", "123-45-67");  // table["Иванов"] = "123-45-67"
		table.put("Петров", "123-45-68");
		table.put("Сидров", "123-45-69");
		
		System.out.println(table);
		
		table.put("Иванов", "123-45-00");  // table["Иванов"] = "123-45-67"
		
		System.out.println(table);
		
		table.put(new Integer(1), "один");
		table.put(new Integer(1000000), "миллион");
		
		table.put(2, "два");
		table.put(1000, "тысяча");
		
	}

}
