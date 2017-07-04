package lesson170704;

public class VarArgs {

	public static void main(String[] args) {

		int x = sum(0, 2, 3);

		System.out.println(sum(0, 1));
		System.out.println(sum(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(sum(0, 1, new int[] { 2, 3, 4, 5, 6, 7, 8, 9 })); // the same
		System.out.println(sum(2, 3));
	}

	private static int sum(int first, int second, int... params) {
		int sum = first + second;
		for (int value : params) {
			sum += value;
		}
		return sum;
	}

}
