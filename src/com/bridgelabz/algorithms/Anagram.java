package com.bridgelabz.algorithms;

/** *****************************************************************************
 *	6. One string is an anagram of another if the second is simply a rearrangement of the first.
 *	For example, 'heart' and 'earth' are anagrams.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Algorithms;
import utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter Two String ");
		String first = Utility.inputString();
		String second = Utility.inputString();

		System.out.println(Algorithms.detectAnagram(first, second) ? "Words are Anagram" : "Words are not Anagram");
	}
}