package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.datastructuresPrograms.Stack;

public class TestStack {

	Stack<Integer> stack = new Stack<Integer>();

	@Test
	public void test_Stack_emptyStatus() {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test_Stack_lengthWhenEmpty() {
		assertEquals(0, stack.size());
	}
}