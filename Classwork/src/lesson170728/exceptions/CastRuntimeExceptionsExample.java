package lesson170728.exceptions;

public class CastRuntimeExceptionsExample {
	
	public static void main(String[] args) {
		
		cast();
		
	}

	private static void cast() {
		
		Object o = "hello";
		
		o = new StringBuffer();
		
		String string = castToString(o);
		
		System.out.println(string);
		
		castToStringWithInstanceOf(o);
		
	}

	private static String castToStringWithInstanceOf(Object o) {
		return o instanceof String ? (String) o : "";
	}

	private static String castToString(Object o) {
		String s;
		try {
			s = (String) o;
		} catch (Exception e) {
			s = "";
		}
		
		return s;
	}
	

}
