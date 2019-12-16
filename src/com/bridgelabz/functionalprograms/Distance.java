package com.bridgelabz.functionalprograms;

/** *****************************************************************************
 * 3. Write a program Distance.java that takes two integer command-line arguments x and y and 
 * prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *  The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.
 *  
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.FunctionalPrograms;
import utility.Utility;

public class Distance {

	public static void main(String[] args) {
		double x, y, x1, y1;
		System.out.println("Enter Two Number ");
		x = Utility.inputDouble();
		x1 = Utility.inputDouble();
		y = Utility.inputDouble();
		y1 = Utility.inputDouble();

		FunctionalPrograms.distance(x, x1, y, y1);
	}
}