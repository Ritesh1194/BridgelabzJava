package com.bridgelabz.logicalprograms;

/** *****************************************************************************
 * 1. Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
 *  Keeps track of the number of times he/she wins and the number of bets he/she makes.
 *  Run the experiment N times, averages the results, and prints them out.
 * 
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.LogicalPrograms;
import utility.Utility;

public class Gambler {
	static double betPrice, stack, goal;
	static int numberOfPlay;

	public static void main(String[] args) {
		System.out.println("Enter stack Price");
		stack =  Utility.inputDouble();

		System.out.println("Enter stack Goal");
		goal =  Utility.inputDouble();

		System.out.println("Enter stack bet price");
		betPrice =  Utility.inputDouble();

		LogicalPrograms.playGame();
		LogicalPrograms.printResult();
	}
}