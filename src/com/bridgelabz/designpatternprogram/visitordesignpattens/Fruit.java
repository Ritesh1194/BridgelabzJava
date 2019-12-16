package com.bridgelabz.designpatternprogram.visitordesignpattens;
/*******************************************************************************
 * 1. Behavioral Design Patterns :- 2.Visitor pattern is used when we have to
 * perform an operation on a group of similar kind of Objects. With the help of
 * visitor pattern, we can move the operational logic from the objects to
 * another class. For example, think of a Shopping cart where we can add
 * different type of items (Elements). When we click on checkout button, it
 * calculates the total amount to be paid. Now we can have the calculation logic
 * in item classes or we can move out this logic to another class using visitor
 * pattern. Let’s implement this in our example of visitor pattern.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class Fruit implements ItemElement {
	private int pricePerKg;
	private int weight;
	private String name;

	public Fruit(int priceKg, int wt, String na) {
		this.pricePerKg = priceKg;
		this.weight = wt;
		this.name = na;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}