package com.bridgelabz.oops.inventorymanagement;
/******************************************************************************
 * 
 * Purpose: Create a JSON file having Inventory Details for Rice, Pulses and
 * Wheats with properties name, weight, price per kg.
 ** 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 14-11-2019
 *
 ******************************************************************************/
public class InvalidOptionException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public InvalidOptionException(String s) {
		super(s);
	}
}
