package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Lazy Initialization
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestLazyInitializedSingleton {

	public static void main(String[] args) {
		// Its a Singleton Object
		LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
		System.out.println(lazyInitializedSingleton);
	}
}