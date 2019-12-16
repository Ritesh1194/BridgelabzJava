package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.datastructuresPrograms.LinkedList;

public class TestLinkedList {
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Test
	public void test_linkedList_isEmpty_whenEmpty() {
		assertTrue(list.isEmpty());
	}

	@Test
	public void test_linkedList_search_dataNotPresesntInList_whenNotEmpty() {
		list.add(10);
		list.add(20);
		list.add(30);
		assertFalse(list.search(50));
	}

	@Test
	public void test_linkedList_search_dataPresesntInList_whenNotEmpty() {
		list.add(10);
		list.add(20);
		list.add(30);
		assertTrue(list.search(20));
	}
}