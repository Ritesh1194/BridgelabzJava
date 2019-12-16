package com.bridgelabz.oops.inventorymanagement;

/******************************************************************************
 * 
 * Purpose: Create a JSON file having Inventory Details for Rice, Pulses and
 * Wheats with properties name, weight, price per kg.
 ** 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 03-12-2019
 *
 ******************************************************************************/
import utility.Utility;

public class InventoryController {
	public static void main(String[] args) {
		InventoryI details = new InventoryImpl();

		System.out.println("Enter your choice");
		System.out.println("1. Add Inventory : ");
		System.out.println("2. Inventory List : ");
		System.out.println("3. Calculation : ");
		int option = Utility.inputInteger();
		if (Utility.validOption(option)) {
			switch (option) {
			case 1:
				System.out.println("Please choose which inventory you want to add");
				System.out.println("1.Rice");
				System.out.println("2.Wheat");
				System.out.println("3.Pulses");
				int selectedOption = Utility.inputInteger();
				if (Utility.validOption(selectedOption)) {
					details.writeData(selectedOption);
				}
				break;
			case 2:
				details.inventryList();
				break;
			case 3:
				System.out.println("Please choose which calculation you want ");
				System.out.println("1. Rice Inventory");
				System.out.println("2. Wheat Inventory");
				System.out.println("3. Pulses Inventory");
				System.out.println("4. Total inventory");
				int selected = Utility.inputInteger();

				details.calculation(selected);
				break;

			default:
				System.out.println("Invalid Option!!!");
				break;
			}
		}
	}
}