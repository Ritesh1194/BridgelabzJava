package testing.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.DataStructures;

public class TestOrderLinkedList {

	DataStructures test = new DataStructures();

	@Test
	public void Testing_For_readFile_Method_and_Returning_The_correct_sting() {
		String fileName = "G:\\Eclipse\\Basic Java\\BridgelabzJava\\OrderFile";
		int num = 2;
		assertEquals(num, test.readFromFile(fileName));
	}
}