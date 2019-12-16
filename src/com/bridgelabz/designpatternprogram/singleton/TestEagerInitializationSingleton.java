package com.bridgelabz.designpatternprogram.singleton;
/*******************************************************************************
 * 1. Creational Design Patterns :- Eager initialization
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestEagerInitializationSingleton {

	public static void main(String[] args) {
		EagerInitializationSingleton eagerInitializationSingleton1 =  EagerInitializationSingleton.getInstance();
		System.out.println(eagerInitializationSingleton1);

		EagerInitializationSingleton eagerInitializationSingleton2 =  EagerInitializationSingleton.getInstance();
		System.out.println(eagerInitializationSingleton2);
	}
}