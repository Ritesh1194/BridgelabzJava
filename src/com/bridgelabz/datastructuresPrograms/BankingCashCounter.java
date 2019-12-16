package com.bridgelabz.datastructuresPrograms;

/**
 * *****************************************************************************
 * 4. Create a Program which creates Banking Cash Counter where people come in
 * to deposit Cash and withdraw Cash. Have an input panel to add people to Queue
 * to either deposit or withdraw money and dequeue the people. Maintain the Cash
 * Balance.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 25-11-2019
 *
 */
import utility.DataStructures;

public class BankingCashCounter {
	public static void main(String[] args) {
		DataStructures object = new DataStructures();
		int cash_count = 10000;
		object.bankCashCounter(cash_count);
	}
}