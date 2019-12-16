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
public class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int cost, String inbn) {
		this.price = cost;
		this.isbnNumber = inbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setInbnNumber(String inbnNumber) {
		this.isbnNumber = inbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}