package lesson170706;

public class EvilString {
	
	private final char[] value;
	private int offset;
	private int length;
	
	public EvilString(String valueSource) {
		this.value = valueSource.toCharArray();
		this.length = value.length;
	}
	
	private EvilString(char[] value, int offset, int length) {
		this.value = value;
		this.offset = offset;
		this.length = length;
	}
	
	@Override
	public String toString() {
		return new String(value);
	}	
	
	public EvilString subString(int begin, int end) {
		return new EvilString(value, begin, end - begin);
	}
	
	public static void main(String[] args) {
		
		String s = new String(new char[1_000_000]);
		
		EvilString ms = new EvilString(s);
		
		EvilString word = ms.subString(0, 10);
		
	}

}
