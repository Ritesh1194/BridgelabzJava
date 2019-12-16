package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.datastructuresPrograms.Dequeue;

public class Dequeue1 {

	Dequeue test = new Dequeue();

	// shows 0 when dequeue is empty
	@Test
	public void isEmpty_Test_When_empty() {
		assertEquals(true, test.isEmpty());
	}

	@Test
	public void Testing_size_Method_When_Value_Is_There() {
		test.addRear(21);
		assertEquals(1, test.size());
		test.addRear(2);
		test.addRear(22);
		assertEquals(3, test.size());
	}

	@Test
	public void Testing_RmoveRear_Method_With_Three_Element() {
		test.addRear(22);
		test.addRear(21);
		test.addRear(23);
		assertEquals(23, test.removeRear());
	}

	@Test

	public void Testing_Rmovefront_Method_With_Element() {
		test.addRear(22);
		test.addRear(23);
		assertEquals(22, test.removeFront());
	}
}
