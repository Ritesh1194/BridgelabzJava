package com.bridgelabz.datastructuresPrograms;

/*******************************************************************************
 * 3. .Take an Arithmetic Expression such as
 * (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order
 * the performance of operations. Ensure parentheses must appear in a balanced
 * fashion.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 25-11-2019
 *
 */
import utility.DataStructures;
import utility.Utility;

public class StackBalancedParentheses {
	public static void main(String[] args) {
		System.out.println("Enter the expression : ");
		char[] exp = Utility.inputStringLine().toCharArray();
		int length = exp.length;

		// checking the parenthesis is balanced or not
		if (DataStructures.balancedParenthesis(exp, length))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}
}