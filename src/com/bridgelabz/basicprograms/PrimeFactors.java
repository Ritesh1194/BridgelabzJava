
package com.bridgelabz.basicprograms;

/** *****************************************************************************
 * 
 *  6. Print the prime factors of number N.
 *  
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.BasicCorePrograms;
import utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		int num;

		System.out.println(" Enter Any Number ");
		num = Utility.inputInteger();
		BasicCorePrograms.primefactors(num);
	}
}