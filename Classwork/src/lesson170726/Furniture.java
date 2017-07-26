package lesson170726;

abstract public class Furniture implements Cleanable {

	@Override
	public void takeApart() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void combine() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Cleanable {
	default void clean() {
		takeApart();
		System.out.println("cleaning parts");
		combine();
	}

	 void combine();

	 void takeApart();
}


class Table extends Furniture {
	
	
}

class Chair extends Furniture {
	
}
