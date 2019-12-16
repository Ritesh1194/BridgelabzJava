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
public abstract class User {
	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
