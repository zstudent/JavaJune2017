package lesson170701.operations;

public class MatrixProcessing {
	
	public static void main(String[] args) {
		
		int[][] triangle = {
				{0, },	
				{3, 4,},	
				{6, 7, 8},	
		};
		
		int[][] matrix = {
				{0, 1, 2 },	
				{3, 4, 5},	
				{6, 7, 8},	
		};
		
		int k = count(matrix, 10);
		
		System.out.println(k);
		
	}

	private static int count(int[][] matrix, int max) {
		int r = 0;
		int s = 0;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {
				r++;
				s += row[j];
				System.out.println(s);
				if (s > max) {
					break OUTER;
				}
			}
		}
		
		return r;
	}
	

}
