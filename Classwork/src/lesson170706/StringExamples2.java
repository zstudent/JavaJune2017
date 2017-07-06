package lesson170706;

public class StringExamples2 {
	
	public static void main(String[] args) {
		
		
		
		String s = new String();
		
		System.out.println(s.length());
		
		
		String s0 = "hello";
		String s1 = new String("hello");
		String s2 = new String(s0);
		String s3 = new String(s1);
		
		System.out.println(System.identityHashCode(s0));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s);
		
		System.out.println(s0 == s1);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s0);
		
		System.out.println(s0.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s0));
		
		String s4 = s0;
		
		System.out.println(s4 == s0);
		System.out.println(s4.equals(s0));
		
		String s5 = "hello";
		
		System.out.println(s5 == s0);
		
	}

}
