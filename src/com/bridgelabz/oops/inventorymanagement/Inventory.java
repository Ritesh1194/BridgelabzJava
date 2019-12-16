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
public class Inventory {
	private String name;
	private double weight;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double d) {
		this.weight = d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
}