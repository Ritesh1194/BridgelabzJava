package com.bridgelabz.functionalprograms;

/** *****************************************************************************
 *  1. A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.FunctionalPrograms;
import utility.Utility;

public class TwoArray {

	public static void main(String[] args) throws Exception {
		int m[][] = new int[2][2];
		int n[][] = new int[2][2];
		int i, j;
		System.out.println("Enter First Array Elements");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				m[i][j] =  Utility.inputInteger();
			}
		}
		System.out.println("Enter Second Array Elements");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				n[i][j] =  Utility.inputInteger();
			}
		}
		FunctionalPrograms.matrix(m, n);
	}
}