package com.bridgelabz.datastructuresPrograms;

/**
 * *****************************************************************************
 * 5. A palindrome is a string that reads the same forward and backward, for
 * example, radar, toot, and madam. We would like to construct an algorithm to
 * input a string of characters and check whether it is a palindrome.
 * 
 * @author : Ritesh Yadav
 * @version : 1.1
 * @since : 25-11-2019
 *
 */
public class Dequeue<T> {
	public Dequeue() {
	}

	Deque<T> front;
	Deque<T> rear;
	int size = 0;

	// add front
	public void addFront(T c) {
		if (front == null) // if no element in list
		{
			front.data = c;
			rear = front;
		} else // if element in list
		{
			Deque<T> tNode = null;
			tNode.data = c;
			tNode.next = front;
			front.pre = tNode;
			front = tNode;
		}
		size++;
	}

	// add rear
	public void addRear(T c) {
		if (front == null) // if no element in list
		{
			Deque<T> tNode = new Deque<T>(c);
			front = tNode;
			rear = front;
		} else // if element in list
		{
			Deque<T> tNode = new Deque<T>(c);
			rear.next = tNode;
			tNode.pre = rear;
			rear = tNode;
		}
		size++;
	}

	// remove front
	public T removeFront() {
		T val = null;
		if (front == null) {
			System.out.println("No elements to delete");
		} else {
			val = front.data;
			front = front.next;
		}
		size--;
		return val;
	}

	// remove rear
	public T removeRear() {
		T val = null;
		if (front == null) {
			System.out.println("No element to delete");
		} else {
			val = rear.data;
			rear = rear.pre;
			rear.next = null;
		}
		size--;
		return val;
	}

	// to remove
	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	// return size of deque
	public int size() {
		return size;
	}
}