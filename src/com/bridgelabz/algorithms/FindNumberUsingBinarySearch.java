
package com.bridgelabz.algorithms;

/** *****************************************************************************
 * 	 
 *  10. The program reports if the search word is found in the list.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Algorithms;
import utility.Utility;

public class FindNumberUsingBinarySearch {

	public static void main(String args[]) {

		System.out.println("Enter the Range  (N) :");
		int num =Utility.inputInteger();
		Algorithms.find(0, num - 1);
	}
}