
package com.bridgelabz.algorithms;

/** *****************************************************************************
 * 4.  Reads in integers prints them in sorted order using Bubble Sort
 * 
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Algorithms;
import utility.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		int i, j, num;
		int arr[] = new int[10];
		num = Utility.inputInteger();
		System.out.println(" Enter " + num + " Elements ");

		for (i = 0; i < num; i++) {
			arr[i] = Utility.inputInteger();
		}

		Algorithms.bubbleSort(arr, num);
	}
}