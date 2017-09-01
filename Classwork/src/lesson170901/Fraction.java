package lesson170901;

public class Fraction {
	
	int numerator;
	int denominator;
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Fraction)) {
			return false;
		}
	}

}
