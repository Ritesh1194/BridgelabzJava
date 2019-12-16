package testing.datastructures;

import static org.junit.Assert.*;
import org.junit.Test;

import utility.DataStructures;

public class TestUnorderLinkedList {
	DataStructures test = new DataStructures();

	@Test
	public void Testing_For_readFile_Method_and_Returning_The_correct_sting() {
		String fileName = "G:\\Eclipse\\Basic Java\\BridgelabzJava\\UnorderFile";
		String[] expected = { "Ritesh" };
		assertEquals(expected, test.readFromFile(fileName));
	}
}