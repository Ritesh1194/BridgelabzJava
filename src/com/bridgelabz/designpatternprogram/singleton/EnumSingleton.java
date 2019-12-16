package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Enum Singleton
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public enum EnumSingleton {
	INSTANCE;
	public static void doSomething(EnumSingleton e) {
		System.out.println("Demotrastion of enum Singleton");
		if (e == EnumSingleton.INSTANCE) {
			System.out.println("Instance Created");
			System.out.println(INSTANCE.hashCode());
		}
	}
}