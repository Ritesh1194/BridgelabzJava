
package com.bridgelabz.basicprograms;

/** *****************************************************************************
 * 4. This program takes a command-line argument N and
 *  prints a table of the powers of 2 that are less than or equal to 2^N.
 *  
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.BasicCorePrograms;
import utility.Utility;

public class Power {

	public static void main(String[] args) {
		int num;
		do {
			System.out.println("Enter Any Number ");
			num = Utility.inputInteger();
		} while (!BasicCorePrograms.checkLessThan31(num));
		BasicCorePrograms.printPowerValue(num);
	}
}