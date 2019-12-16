
package com.bridgelabz.basicprograms;

/** *****************************************************************************
 * 3. Print the year is a Leap Year or not.
 * 
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.BasicCorePrograms;
import utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter Any Number ");
		year = Utility.inputInteger();
		
		System.out.println(BasicCorePrograms.leapYear(year));
	}
}