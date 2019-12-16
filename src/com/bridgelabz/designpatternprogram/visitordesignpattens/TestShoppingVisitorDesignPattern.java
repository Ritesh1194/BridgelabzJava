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
public class TestShoppingVisitorDesignPattern {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"), new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
