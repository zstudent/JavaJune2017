package lesson170624.class_structure;

import java.util.ArrayList;
import java.util.Random;

public class Imports {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Random name = new Random();
		
		ArrayList list = new ArrayList();
		
		System.out.println(ArrayList.class.getName());
		System.out.println(ArrayList.class.getSimpleName());
		System.out.println(ArrayList.class.getPackage().getName());
		
	}
	
}
