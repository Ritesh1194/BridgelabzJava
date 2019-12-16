package com.bridgelabz.basicprograms;

/** *****************************************************************************
 * 5. Prints the Nth Harmonic number: 1/1 + 1/2 + ... + 1/N.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.BasicCorePrograms;
import utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		double num;
		System.out.println("Enter Any Number ");

		num = Utility.inputInteger();
		System.out.println(BasicCorePrograms.printharmonicNumber(num));
	}
}