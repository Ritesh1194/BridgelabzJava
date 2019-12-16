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
public interface Subject {
	public void register(Observer obj);

	public void unregister(Observer obj);

	public void Observers();

	public Object getUpdate(Observer obj);
}
