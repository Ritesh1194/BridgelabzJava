package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Static block initialization
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestStaticBlockInitialization {

	public static void main(String[] args) {
		StaticBlockInitialization staticBlockInitialization1 = StaticBlockInitialization.getInstance();
		System.out.println(staticBlockInitialization1);
	}
}