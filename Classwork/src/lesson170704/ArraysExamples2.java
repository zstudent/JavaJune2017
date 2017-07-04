package lesson170704;

import java.util.Arrays;

public class ArraysExamples2 {
	
	public static void main(String[] args) {
		
		int[] a;
		int[][] b;
		int[][][] c;
		
//		System.out.println(c);
		
		int [][] triangle = {
				{0},
				{1,2},
				{3,4,5},
		};
		
		int [] m = {0, 0, 1,    0, 2, 1,    3, 2, 1};
//i				       0           1           2
//j                   0  1  2     0  1  2     0  1  2
//n - j               3  2  1	    3  2  1     3  2  1	
//i+j                 0  1  2     1  2  3     2  3  4
//n-1                    2           2           2		

		int[] r;
		r = squareup(0);
		System.out.println(Arrays.toString(r));
		r = squareup(1);
		System.out.println(Arrays.toString(r));
		r = squareup(2);
		System.out.println(Arrays.toString(r));
		r = squareup(3);
		System.out.println(Arrays.toString(r));
		r = squareup(4);
		System.out.println(Arrays.toString(r));
	}

	private static int[] squareup(int n) {
		int[] r = new int[n*n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j < n - 1) {
				} else {
					r[i*n +j] = n - j;
				}
			}
		}
		
		
		
		return r;
	}
	
	

}
