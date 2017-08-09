package exercises;

public class News<T> {}

class C {
	
	public static void main(String[] args) {
		
		News<String>   news;
		News<Object>   news2;
		News<?> news3;
		News<? extends Object> news4;
		
		news2 = news;
		
		news3 = news;
		
	}
}