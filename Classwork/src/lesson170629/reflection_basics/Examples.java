package lesson170629.reflection_basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Examples {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Class<A> c = A.class;
		
		
		for (Method m : c.getMethods()) {
			System.out.println(m);
		}
		
//		A a = new A();
		
		A a = c.newInstance();
		
		Constructor<A> constructor = c.getConstructor(null);
		A a2 = constructor.newInstance(null);
		
		System.out.println(a);
		
		
		Method m = c.getMethod("m", null);
		
		// a.m();
		m.invoke(a, null);
	}
	
}
