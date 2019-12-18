package com.bridgelabz.designpatternprogram.observerdesignpattens;

/*******************************************************************************
 * 3. Behavioural Design Patterns :- 
 * 2 Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change.
 *  In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject. 
	For observer pattern java program example, implement a simple topic and observers can register to this topic. Whenever any new message will be posted to the topic, all the registers observers will be notified and they can consume the message.
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	// Constructor
	public MyTopic() {
		this.observers = new ArrayList<>();
	}

	/**
	 * Define function register()
	 * 
	 * @param obj
	 *            --> Observer
	 * @return Void
	 */
	@Override
	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if (!observers.contains(obj))
				observers.add(obj);
		}
	}

	/**
	 * Define function notifyObservers()
	 * 
	 * @return Void
	 */
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}

	/**
	 * Define function unRegister()
	 * 
	 * @param obj
	 *            --> Observer
	 * @return Void
	 */
	@Override
	public void unregister(Observer obj) {

		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	@Override
	public void Observers() {

	}

	/**
	 * Define function getUpdate()
	 * 
	 * @param obj
	 *            --> Observer
	 * @return Object
	 */
	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	/**
	 * Define function postRegister()
	 * 
	 * @param msg
	 *            --> String
	 * @return Void
	 */

	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic " + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}
}