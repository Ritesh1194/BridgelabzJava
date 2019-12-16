package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Eager initialization
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class EagerInitializationSingleton {

	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private  EagerInitializationSingleton() {

	}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}