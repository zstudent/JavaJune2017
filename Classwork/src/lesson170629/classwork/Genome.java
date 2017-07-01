package lesson170629.classwork;

public class Genome {
	
	/*
	 * A C G T
	 * 
	 * N = 100000
	 * 
	 *     offset1  
	 * AAACCACAGTAGCTCGAATCGCCTAGCGCTATGCGCGGATCGCGCGCATTCGGATCTCT
	 *                offset2
	 * AAA
	 * AAC
	 * ACC           
	 * CCA
	 * 
	 * 
	 * 1Tb
	 * 
	 * N = 8
	 * W = 2
	 * 012345
	 * ACGTACGT
	 *  123456
	 */
	
	public static void main(String[] args) {
		
		byte[] data = DataGenerator.generate(300000);
		
//		System.out.println(Arrays.toString(data));
		
		for (byte b : data) {
			System.out.print((char)b);
		}
		
		findDuplicates(data, 4);
		
	}

	private static void findDuplicates(byte[] data, int w) {
		int counter = 0;
		for (int i = 0; i < data.length - w; i++) {
			for (int j = i+1; j < data.length - w + 1; j++) {
				boolean found = true;
				for (int k = 0; k < w; k++) {
					if (data[i + k] != data[j + k]) {
						found = false;
						break;
					}
				}
				if (found) {
					counter++;
//					System.out.println("\nhurray!");
//					System.out.println("i = " + i + ", j = " + j);
				}
			}
		}
		System.out.println();
		System.out.println(counter);
	}

}
