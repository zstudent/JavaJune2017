package lesson170719.swap;

import java.util.Arrays;

public class SwapExamples {
	
	public static void main(final String[] args) {
		
		int x = 100;
		
		int y = 50;
		
		int tmp = x;
		x = y;
		y = tmp;
		
		x = x + y;
		
		// x == 100 + 50 == 150
		
		y = x - y;  //   y == 100
		
		x = x - y;   //  x == 50
		
		swap(x,y);   //  a = x;  b = y;
		
		int[] a = {100,50};
		swap(a);
		
		System.out.println(Arrays.toString(a));
		
		Integer k = 20;
		Integer m = 30;
		
		swap(k, m);  //  a = k;  b = m
		
		System.out.println(k + " " + m);
		
	}

	private static void swap(int[] a) {
		int tmp = a[0];
		a[0] = a[1];
		a[1] = tmp;
	}

	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}

	private static void swap(Integer a, Integer b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	
}
