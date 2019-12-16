package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.datastructuresPrograms.Queue;

public class TestQueue {
	Queue test = new Queue();

	@Test
	public void isEmpty_method_To_Check_When_Oueue_is_Not_Empty() {
		test.enQueue(98);
		test.enQueue(90);
		assertEquals(false, test.isEmpty());
	}

	@Test
	public void isEmpty_method_To_Check_When_Oueue_is_Empty() {
		assertEquals(true, test.isEmpty());
	}

	@Test
	public void isEmpty_method_To_Check_When_Oueue_Has_One_Element() {
		test.enQueue(98);
		assertEquals(false, test.isEmpty());
	}
}
