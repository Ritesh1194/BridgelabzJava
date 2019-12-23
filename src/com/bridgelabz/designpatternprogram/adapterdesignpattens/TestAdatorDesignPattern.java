package com.bridgelabz.designpatternprogram.adapterdesignpattens;

/**
 * *****************************************************************************
 * 2. Structural Design Patterns :-
 * 
 * 1. Adapter design pattern is one of the structural design pattern and its
 * used so that two unrelated interfaces can work together. The object that
 * joins these unrelated interface is called an Adapter. Use Adapter design
 * pattern to solve mobile charger which adapts to a Mobile battery needs 3
 * volts to charge but the normal socket produces either 120V (US) or 240V
 * (India). So the mobile charger works as an adapter between mobile charging
 * socket and the wall socket.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestAdatorDesignPattern {

	public static void main(String[] args) {
		// calling the methods
		testClassAdaptor();
		testObjectAdaptor();
	}

	/**
	 * Define static function testClassAdapter()
	 * 
	 * @return void
	 */
	public static void testClassAdaptor() {
		// Creating Object
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);

		System.out.println("V3 Volts Using TestClassAdaptor " + v3.getVolts());
		System.out.println("V3 Volts Using TestClassAdaptor " + v12.getVolts());
		System.out.println("V3 Volts Using TestClassAdaptor " + v120.getVolts());
	}

	/**
	 * Define static function testObjectAdapter()
	 * 
	 * @return void
	 */
	public static void testObjectAdaptor() {
		// Creating Object
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);

		System.out.println("V3 Volts Using TestObjectAdaptor " + v3.getVolts());
		System.out.println("V12 Volts Using TestObjectAdaptor " + v12.getVolts());
		System.out.println("V3 Volts Using TestObjectAdaptor " + v120.getVolts());
	}

	/**
	 * Define static function getVolt()
	 * 
	 * @param socketAdapter
	 *            -> SocketAdapter
	 * @param i
	 *            ->int
	 * 
	 * @return Volt
	 */
	private static Volt getVolt(SocketAdapter socketAdapter, int i) {
		switch (i) {
		case 3:
			return socketAdapter.get3Volt();
		case 12:
			return socketAdapter.get12Volt();
		case 120:
			return socketAdapter.get120Volt();
		default:
			return socketAdapter.get120Volt();
		}
	}
}