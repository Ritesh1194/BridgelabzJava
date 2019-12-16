package com.bridgelabz.datastructuresPrograms;

/** *****************************************************************************
 *	12. Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of the month. 
 *Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-11-2019
 *
 ***************************************************************************** */
import utility.DataStructures;
import utility.Utility;

public class Calender {

	public static void main(String[] args) {
		DataStructures object = new DataStructures();
		System.out.println("Enter a month : ");
		int month = Utility.inputInteger();
		System.out.println("Enter a year : ");
		int year = Utility.inputInteger();
		object.calender(month, year);
	}
}