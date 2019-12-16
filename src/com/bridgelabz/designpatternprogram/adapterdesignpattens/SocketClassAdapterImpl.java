package com.bridgelabz.designpatternprogram.adapterdesignpattens;
/**
 * *****************************************************************************
 * 2. Structural Design Patterns :- 
 * 
 * 1. Adapter design pattern is one of the structural design pattern and its used
 * so that two unrelated interfaces can work together. The object that joins
 * these unrelated interface is called an Adapter. Use Adapter design pattern to
 * solve mobile charger which adapts to a Mobile battery needs 3 volts to charge
 * but the normal socket produces either 120V (US) or 240V (India). So the
 * mobile charger works as an adapter between mobile charging socket and the
 * wall socket.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {

		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {

		Volt v = getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {

		return new Volt(v.getVolts() / i);
	}
}