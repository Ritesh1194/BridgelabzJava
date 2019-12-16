package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Bill Pugh Singleton Implementation
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingleTonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingleTonHelper.instance;
	}
}