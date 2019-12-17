package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Thread Safe Singleton
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestThreadSafeSingleton {

	public static void main(String[] args) {
		// Its a Singleton Object
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		Thread thread1 = new Thread(threadSafeSingleton);
		thread1.start();
		System.out.println(thread1.getName());
		System.out.println(threadSafeSingleton);

		Thread thread2 = new Thread(threadSafeSingleton);
		thread2.start();
		System.out.println(thread2.getName());
		System.out.println(threadSafeSingleton);
	}
}