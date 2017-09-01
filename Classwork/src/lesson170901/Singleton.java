package lesson170901;

public enum Singleton {

	INSTANCE;

	int state;

	private Singleton() {
	}

	public void change() {
		state++;
	}

	public int getState() {
		return state;
	}

}
