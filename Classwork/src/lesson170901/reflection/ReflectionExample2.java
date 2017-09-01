package lesson170901.reflection;

import java.lang.reflect.Method;
import java.util.Optional;

public class ReflectionExample2 {

	public static void main(String[] args) {
		
		Object o = new Object() {
			public void one() {
				System.out.println("my one!");
			}
		};
		
		Object o2 = new Object();
		
		
		process(o);
		process(o2);
		
	}

	private static void process(Object object) {
		Class<? extends Object> clazz = object.getClass();

		Method method = null;
		try {
			method = clazz.getMethod("one", null);
			
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("no one!");
		}
		
		Optional.ofNullable(method).ifPresent(m -> {
			try {
				m.invoke(object, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		
	}
	
}
