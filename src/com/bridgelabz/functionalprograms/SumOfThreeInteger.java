package com.bridgelabz.functionalprograms;

/** *****************************************************************************
 * 
 *  2. A program with cubic running time. Read in N integers and counts the  number of triples that sum to exactly 0.
 *  
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.FunctionalPrograms;
import utility.Utility;

public class SumOfThreeInteger {

	public static void main(String[] args) {
		int arr[] = new int[10];

		System.out.println("Enter Array Elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  Utility.inputInteger();
		}
		FunctionalPrograms.findTriplets(arr);
	}
}