package lesson170624;

import mytestframework.Asserts;

public class FizzBuzzTest {

	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(6), "Fizz"));
		System.out
				.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(333), "Fizz"));
		System.out
				.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(5), "Fizz"));

		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(5), "Buzz"));
		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(10), "Buzz"));
		System.out
				.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(100), "Buzz"));
		System.out
				.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(1), "Buzz"));

		System.out.println(
				Asserts.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
		System.out.println(
				Asserts.assertEquals(FizzBuzz.fizzBuzz(300), "FizzBuzz"));
		System.out.println(
				Asserts.assertNotEquals(FizzBuzz.fizzBuzz(11), "FizzBuzz"));

		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(1), "1"));
		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(7), "7"));
		System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(17), "17"));
		System.out.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(3), "3"));
		System.out.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(5), "5"));
		System.out
				.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(15), "15"));
	}

}
