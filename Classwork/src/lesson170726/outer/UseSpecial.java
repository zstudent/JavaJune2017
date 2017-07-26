package lesson170726.outer;

import lesson170726.Special;
import lesson170726.Special.A;

public class UseSpecial {
	
	public static void main(String[] args) {
		
		Special special = Special.createDefaultImpl();
		
		special.doSomethingExceptional();
		
		Special special2 = Special.createDefaultImpl();
		
		System.out.println(special);
		System.out.println(special2);
		
		Special.A a = new Special.A();
		
//		Special.special = null;  ERROR!!  field special is final
		
	}
	
	

}
