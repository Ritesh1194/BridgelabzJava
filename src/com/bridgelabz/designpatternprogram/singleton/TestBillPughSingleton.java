package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Bill Pugh Singleton Implementation
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestBillPughSingleton {

	public static void main(String[] args) {
		BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton1);

		BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton2);
	}
}