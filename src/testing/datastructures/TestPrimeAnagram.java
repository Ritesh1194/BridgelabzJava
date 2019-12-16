package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.DataStructures;

public class TestPrimeAnagram {

	DataStructures test = new DataStructures();

	@Test
	public void Testing_for_IsPrime_When_Number_Is_Prime_Returns_True() {
		int number = 13;
		int number1 = 31;
		assertEquals(true, test.isAnagram(number, number1));
	}

	@Test
	public void Testing_for_IsPrime_When_Number_Is_Prime_Returns_False() {
		int number = 23;
		int number1 = 31;
		assertEquals(false, test.isAnagram(number, number1));
	}
}