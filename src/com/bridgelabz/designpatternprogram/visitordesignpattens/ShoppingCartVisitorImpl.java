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
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else
			cost = book.getPrice();
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}
}