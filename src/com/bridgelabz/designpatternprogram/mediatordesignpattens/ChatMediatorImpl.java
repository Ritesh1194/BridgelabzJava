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
import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	private List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User u : this.users) {
			if (u != users) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void adddUser(User user) {
		this.users.add(user);
	}
}