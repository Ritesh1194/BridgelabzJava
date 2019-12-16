package com.bridgelabz.basicprograms;

/** *****************************************************************************
 * 
 * 2. Flip Coin and print percentage of Heads and Tails.
 * 
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.BasicCorePrograms;
import utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter number of times to Flip Coin: ");

		int number = Utility.inputInteger();
		BasicCorePrograms.validatePositiveNumber(number);

		int tail = BasicCorePrograms.numberOfTail(number);
		double percentageTial = BasicCorePrograms.percentageOfTail(tail, number);

		System.out.println("Percentage of time tial :" + percentageTial);
		System.out.println("Percentage of time Head :" + (100 - percentageTial));
	}
}