package lesson170726;

public interface Special {
	
	class A {
		
	}
	
	Special special = new Special() {
		
		@Override
		public void doSomethingExceptional() {
			System.out.println("I am exceptional!");
		}
		
	};
	
	static Special createDefaultImpl() {
		return special;
	}
	
	void doSomethingExceptional();

}
