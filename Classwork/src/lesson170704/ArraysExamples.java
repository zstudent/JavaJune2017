package lesson170704;

import java.util.Arrays;

public class ArraysExamples {

	
	public static void main(String[] args) {
		
		int i = 0;
		
		int j;
		
		j = 0;
		
		
		int[] a = {};
		
		int[] b, x;
		
		b = new int[] {};
		
		b = new int[0];
		
		b = new int[10];
		b = new int[] {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println(a);
		System.out.println(a.toString());
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		b = new int[10];
		System.out.println(Arrays.toString(b));
		String s[] = new String[3];
		System.out.println(Arrays.toString(s));
		
		print(s);
		
	}

	private static void print(String[] arraysOfStrings) {
		int index = 0;
		while (index < arraysOfStrings.length) {
			System.out.println(arraysOfStrings[index++]);
//			index = index + 1;
//			index += 1;
//			index++;
		}
	}

}
