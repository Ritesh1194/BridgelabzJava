package com.bridgelabz.datastructuresPrograms;

/*******************************************************************************
 *	2.  Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. 
 *Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position
 *  @author  :  Ritesh Yadav
 *  @version :  1.2
 *  @since   :  25-11-2019
 */
import java.io.*;

import utility.DataStructures;
import utility.Utility;

public class OrderLinkedList {
	public static void main(String[] args) throws IOException {
		DataStructures object = new DataStructures();
		System.out.println("Enter the number you want to search :");
		Integer item = Utility.inputInteger();
		object.orderLinkedList(item);
	}
}