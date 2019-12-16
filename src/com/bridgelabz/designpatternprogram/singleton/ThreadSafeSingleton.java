package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Thread Safe Singleton
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class ThreadSafeSingleton implements Runnable {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}

		}
		return instance;
	}

	@Override
	public void run() {
		System.out.println("Welcome To Ritesh Yadav");
	}
}