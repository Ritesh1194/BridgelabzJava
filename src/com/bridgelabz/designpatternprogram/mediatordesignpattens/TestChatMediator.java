package com.bridgelabz.designpatternprogram.mediatordesignpattens;
/*******************************************************************************
 * 3. Behavioural Design Patterns :- 
 * 2 .Mediator Design Pattern is very helpful
 * in an enterprise application where multiple objects are interacting with each
 * other. If the objects interact with each other directly, the system
 * components are tightly-coupled with each other that makes higher
 * maintainability cost and not hard to extend. Mediator pattern focuses on
 * provide a mediator between objects for communication and help in implementing
 * loose-coupling between objects. Allows loose coupling by encapsulating the
 * way disparate sets of objects interact and communicate with each other.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
public class TestChatMediator {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Ritesh");
		User user2 = new UserImpl(mediator, "Ravi");
		User user3 = new UserImpl(mediator, "Rahul");
		User user4 = new UserImpl(mediator, "Raja");

		mediator.adddUser(user1);
		mediator.adddUser(user2);
		mediator.adddUser(user3);
		mediator.adddUser(user4);
		user1.send("Hi Ritesh");
	}
}