
package com.bridgelabz.algorithms;

/** *****************************************************************************
 *	9. Rewrite Use Generics for Sort Algorithms.

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.util.*;

import utility.Algorithms;

public class SortingUsingGenerics {

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 1, 5 };
		System.out.println("before sorting int: " + Arrays.toString(arr));
		Algorithms.selectionSort(arr);
		System.out.println("After sorting int : " + Arrays.toString(arr));
	}
}