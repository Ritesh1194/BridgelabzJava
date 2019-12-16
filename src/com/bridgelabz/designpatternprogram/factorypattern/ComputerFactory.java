package com.bridgelabz.designpatternprogram.factorypattern;

/*******************************************************************************
 * 1. Creational Design Patterns :-
 *  2 . Use Factory Pattern to create a Computer
 * Factory that can Produce PC, Laptop and Server Class Computers. As Shown in
 * the Figure Below Create an Abstract Computer Class and PC, Laptop and Server
 * inherit from Computer and ComputerFactory is able to create the corresponding
 * Computer Object on request
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {

		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);

		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		return null;

	}
}