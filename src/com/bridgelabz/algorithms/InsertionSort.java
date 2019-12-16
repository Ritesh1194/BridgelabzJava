
package com.bridgelabz.algorithms;

/** *****************************************************************************
 *	3. Reads in strings and prints them in sorted order using insertion sort.

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Algorithms;

public class InsertionSort {
	public static void main(String[] args) {

		String[] arr = { "India ", "Shrilanka", "Austrilia", "South Africa", "New Zealand" };
		String sortedArray[] = Algorithms.sort_sub(arr, arr.length);

		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
}