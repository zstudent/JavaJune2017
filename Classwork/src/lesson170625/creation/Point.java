package lesson170625.creation;

public class Point {
	
	final int x;
	final int y;
	
//	{
//		x = 10;
//		y = 10;
//	}
	
	Point() {
		this(10,10);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point (int y) {
		this(0, y);
	}

}
