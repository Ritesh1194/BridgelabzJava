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
public class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {

		return this.ram;
	}

	@Override
	public String getHDD() {

		return this.hdd;
	}

	@Override
	public String CPU() {

		return this.cpu;
	}
}