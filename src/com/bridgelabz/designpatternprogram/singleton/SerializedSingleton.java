package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Serialization and Singleton
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private static final long serialVersionId = 1010101010;

	private SerializedSingleton() {
	}

	private static class SingleHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingleHelper.instance;
	}
}