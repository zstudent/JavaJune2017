package exercises;

public class Baseball {
	public static void main(String... teams) {
		int score = 0;
		try {
			score = 1;
			System.out.print(score++);
		} catch (Throwable t) {
			System.out.print(score++);
		} finally {
			System.out.print(score++);
		}
		System.out.print(score++);
	}
}