
package com.bridgelabz.functionalprograms;

/** *****************************************************************************
 * 4.  Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
 * Since the equation is x*x, hence there are 2 roots. 
 * The 2 roots of the equation can be found using a formula (Note: Take a, b and c as input values)
	delta = b*b - 4*a*c
	Root 1 of x = (-b + sqrt(delta))/(2*a)
	Root 2 of x = (-b - sqrt(delta))/(2*a).
	 
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.FunctionalPrograms;
import utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		double num1, num2, num3;
		System.out.println("Enter Any Three number");
		num1 =  Utility.inputDouble();
		num2 =  Utility.inputDouble();
		num3 =  Utility.inputDouble();
		FunctionalPrograms.quadraticEquation(num1, num2, num3);
	}
}