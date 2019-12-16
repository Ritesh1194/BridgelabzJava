package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Using Reflection to destroy Singleton Pattern
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instanceTwo = null;

		try {
			Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializationSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}