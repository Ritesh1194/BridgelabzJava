package com.bridgelabz.logicalprograms;

/* *
 *  2. Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number?
 *   This program simulates this random process.
 *   @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
*********************************************/
import utility.LogicalPrograms;
import utility.Utility;

public class CouponNumber {
	public static void main(String args[]) {

		System.out.println("How many cupons (N): ");
		int numberOfCupons = Utility.inputInteger();

		System.out.println("Random number require to genrate " + numberOfCupons + " is :"
				+ LogicalPrograms.genrateDistictCupons(numberOfCupons));
	}
}