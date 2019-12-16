package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.DataStructures;

public class TestPrimeArray {
	DataStructures test = new DataStructures();

	@Test
	public void Testing_for_IsPrime_When_Number_Is_Prime_Returns_True() {
		int number = 23;
		int number1 = 13;
		int number2 = 7;
		assertEquals(true, test.isPrime(number));
		assertEquals(true, test.isPrime(number1));
		assertEquals(true, test.isPrime(number2));

	}

	@Test
	public void Testing_for_IsPrime_When_Number_Is_Prime_Returns_False() {
		int number = 25;
		int number1 = 10;
		int number2 = 12;
		assertEquals(false, test.isPrime(number));
		assertEquals(false, test.isPrime(number1));
		assertEquals(false, test.isPrime(number2));

	}

}
