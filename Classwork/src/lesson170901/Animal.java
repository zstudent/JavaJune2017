package lesson170901;

public class Animal {
	
	final private int id;
	final private String name;
	final private int age;
	
	public Animal(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal)) {
			return false;
		}
		Animal other = (Animal) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		return this.name.equals(other.name);
	}
	
	
	@Override
	public int hashCode() {
		int hashcode = 7;
		hashcode = hashcode + 31 * this.id;
		hashcode = hashcode + 31 * this.age;
		hashcode = hashcode + 31 * this.name.hashCode();
		return hashcode;
	}
	
	

}
