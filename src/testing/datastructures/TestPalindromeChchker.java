package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.DataStructures;

public class TestPalindromeChchker {
	static DataStructures test = new DataStructures();

	@Test
	public void isPalindrome_If_radar_Is_passed() {
		assertEquals(true, test.palindromeChecker("raar"));
	}

	@Test
	public void isPalindrome_If_ritesh_Is_passed() {
		assertFalse( test.palindromeChecker("ritesh"));
	}
	@Test
	public void isPalindrome_If_ritesh_Is_passedTrue() {
		assertFalse(test.palindromeChecker("ritesh"));
	}
	@Test
	public void isPalindrome_If_ritesh_Is_passedFalse() {
		assertTrue(test.palindromeChecker("madam"));
	}
}