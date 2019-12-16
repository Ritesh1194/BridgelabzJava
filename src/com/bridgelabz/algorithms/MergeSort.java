
package com.bridgelabz.algorithms;

/** *****************************************************************************
 *	5. Write a program to do Merge Sort of list of Strings. 

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Algorithms;

public class MergeSort {

	public static void main(String[] args) {

		String[] array = { "Ritesh", "Ajit", "vinay", "Raju", "Vikas", "Atul" };
		String[] sortedArray = Algorithms.mergeSort(array);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}
	}
}