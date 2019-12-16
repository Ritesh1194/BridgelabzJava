package com.bridgelabz.datastructuresPrograms;

/**
 * *****************************************************************************
 * 5. A Palindrome is a string that reads the same forward and backward, for
 * example, radar, toot, and madam. We would like to construct an algorithm to
 * input a string of characters and check whether it is a palindrome.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 25-11-2019
 *
 */
import utility.DataStructures;
import utility.Utility;

public class PalindromeChecker<E> {

	public static void main(String[] args) {
		DataStructures object = new DataStructures();
		System.out.println("Enter a String: ");
		String s = Utility.inputString();
		object.displayPalindromeChecker(s);
	}
}