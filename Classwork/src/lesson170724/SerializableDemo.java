package lesson170724;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class SerializableDemo {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		A a = new A();
		a.x = 10;
		a.s = "Hello";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(a);
		
		byte[] data = baos.toByteArray();
		
		System.out.println(Arrays.toString(data));
		
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		
		ObjectInputStream ois = new ObjectInputStream(bais);
		
		A a2 = (A) ois.readObject();
		
		System.out.println(a2.x + " " + a2.s);
		
	}
	

}


class A implements Serializable {
	
	int x;
	
	CharSequence s;
	
}