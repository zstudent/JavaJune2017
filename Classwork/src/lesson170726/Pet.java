package lesson170726;

abstract public class Pet implements Cleanable {
	
	@Override
	public void clean() {
		System.out.println("wash with care");
	}

	@Override
	public void combine() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void takeApart() {
		throw new UnsupportedOperationException();
	}

}
