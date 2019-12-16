package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.DataStructures;

public class TestBalancedParanthesis {
	DataStructures test = new DataStructures();

	@Test
	public void balancedParenthesis_When_NoParanthesis() {
		String exp = "5+6∗7+8/4+35+6∗7+8/4+3";
		char ch[] = exp.toCharArray();
		int length = ch.length;
		assertEquals(true, test.balancedParenthesis(ch, length));
	}

	public void balancedParenthesis_When_Paranthesis() {
		String exp = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char ch[] = exp.toCharArray();
		int length = ch.length;
		assertEquals(true, test.balancedParenthesis(ch, length));
	}
}