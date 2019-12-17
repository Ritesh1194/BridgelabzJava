package com.bridgelabz.designpatternprogram.factorypattern;

/*******************************************************************************
 * 1. Creational Design Patterns :- 2. Use Factory Pattern to create a Computer
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
public class TestFactoryPattern {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "1 tb", "500 gb", "2.4 ghz");
		Computer server = ComputerFactory.getComputer("server", "500 gb", "1gb", "2.4 ghz");

		System.out.println("PC Configure : = " + pc);
		System.out.println("Server Configure : = " + server);
	}
}