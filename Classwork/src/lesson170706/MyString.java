package lesson170706;

public class MyString {
	
	final char[] value;
	
	public MyString(String valueSource) {
		value = valueSource.toCharArray();
	}
	
	public char[] toCharArray() {
		return value;
	}
	
	@Override
	public String toString() {
		return new String(value);
	}
	
	
	
	public static void main(String[] args) {
		
		MyString s = new MyString("hello");
		
		s.toCharArray()[0] = 'b';
		
		System.out.println(s);
	}

}
