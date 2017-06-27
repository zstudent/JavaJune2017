package lesson170625.primitivetypes;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		
		long l = 21474836470L;
		
		int x = 0xff;
		int o = 077;
		int b = 0b11;
		
		char c = 100;
		
		System.out.println(c);
		System.out.println((char)65);
		int i = 'c';
		System.out.println(i);
		
		
		long l2 = 100;
		
		int i2 = (int)l2;
		
		double d = 10;
		
		int i3 = (int)d;
		
		System.out.println(d);
		
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toOctalString(x));
		
		String result = "";
		
		result += 1;
		result += 1;
		result += 1;
		
		System.err.println(result);
	}
	
}
