package lesson170707;

public class StringMethods2 {
	
	public static void main(String[] args) {
		
		String s = "hello";
		
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf("el"));
		System.out.println(s.indexOf("al"));

		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.substring(2, 2+3));
		
		System.out.println(s.toUpperCase());
		
		System.out.println("HeyThere".toLowerCase());
		
		System.out.println("Hello".equals(s));
		System.out.println("Hello".equalsIgnoreCase(s));
		
		System.out.println(s.contains("el"));
		System.out.println(s.contains("al"));
		
		System.out.println(s.replace('l', 'p'));
		
		String s2 = "  Hello!   ";
		
		System.out.println(s2.length());
		
		System.out.println(s2.trim());
		System.out.println(s2.trim().replace("ll", "pp").substring(1, 3));
		
		
		
	}

}
