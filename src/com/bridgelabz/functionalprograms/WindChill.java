package com.bridgelabz.functionalprograms;

/** *****************************************************************************
 * 5.Write a program WindChill. java that takes two double command-line arguments t and v and prints the wind chill.
  	Use Math.pow(a, b) to compute ab.
  	Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
 	the National Weather Service defines the effective temperature (the wind chill) to be:
	Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.FunctionalPrograms;
import utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		double t, v;
		System.out.println("Enter Two Inputs ");
		t = Utility.inputDouble();
		v = Utility.inputDouble();

		FunctionalPrograms.windChill(t, v);
	}
}