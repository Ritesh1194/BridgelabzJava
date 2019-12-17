package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Enum Singleton
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestEnumSingleton {

	public static void main(String[] args) {
		// Its a Singleton Object
		EnumSingleton.doSomething(EnumSingleton.INSTANCE);
	}
}