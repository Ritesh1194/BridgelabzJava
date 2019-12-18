package com.bridgelabz.oops.inventorymanagement;

/******************************************************************************
 * 
 * Purpose: Create a JSON file having Inventory Details for Rice, Pulses and
 * Wheats with properties name, weight, price per kg.
 ** 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 03-11-2019
 *
 ******************************************************************************/
public interface InventoryI {

	void writeData(int selectedOption);

	void inventryList();

	void calculation(int selected);
}