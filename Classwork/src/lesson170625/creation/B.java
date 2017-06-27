package lesson170625.creation;

public class B extends A {

	{ System.out.println("init B"); }
	
	B() { super(); System.out.println("constructor B");}
	
}
