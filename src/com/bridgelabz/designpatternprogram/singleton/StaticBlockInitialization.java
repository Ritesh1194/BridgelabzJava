package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Static block initialization
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import javax.management.RuntimeErrorException;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeErrorException(null, "Error Occured");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}
}
