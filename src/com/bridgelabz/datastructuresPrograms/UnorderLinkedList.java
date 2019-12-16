package com.bridgelabz.datastructuresPrograms;

/*******************************************************************************
 *	1. Read the Text from a file, split it into words and arrange it as Linked List. 
 *Take a user input to search a Word in the List.
 * If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file
 *  @author  :  Ritesh Yadav
 *  @version :  1.2
 *  @since   :  25-11-2019
 */
import java.io.*;

import utility.DataStructures;
import utility.Utility;

public class UnorderLinkedList<T> {

	public static void main(String[] args) throws IOException {
		DataStructures object = new DataStructures();
		System.out.println("Enter the word you want to search :");
		String item = Utility.inputString();
		object.unOrderLinkedList(item);
	}
}