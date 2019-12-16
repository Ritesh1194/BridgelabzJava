package com.bridgelabz.datastructuresPrograms;

/**
 * *****************************************************************************
 * 4. Create a Program which creates Banking Cash Counter where people come in
 * to deposit Cash and withdraw Cash. Have an input panel to add people to Queue
 * to either deposit or withdraw money and dequeue the people. Maintain the Cash
 * Balance.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 25-11-2019
 *
 */
import java.util.NoSuchElementException;

public class Queue<T> {
	Node head;

	class Node {
		T data;
		Node next;

		// constructor
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * for adding the elements in the queue
	 * 
	 * @param new_data
	 *            ==>T
	 */
	public void enQueue(T new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new_node;
		}
	}

	/**
	 * for removing the elements from the queue
	 * 
	 * @return T
	 */
	public T deQueue() {
		T data = null;
		if (head == null) {
			throw new NoSuchElementException("UnderFlow");
		} else {
			data = head.data;
			head = head.next;
		}
		return data;
	}

	/**
	 * to check the queue is empty or not
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * to calculate the size of the queue
	 * 
	 * @return int
	 */
	public int getSize() {
		int size = 0;
		if (head == null) {
			return -1;
		} else {
			Node current = head;
			while (current != null) {
				current = current.next;
				size++;
			}
		}
		return size;
	}

	/**
	 * to get the last element from the queue
	 * 
	 * @return T
	 */
	public T peek() {
		T data = null;
		if (head == null)
			return data;
		else {
			Node current = head;
			Node previous = null;
			while (current != null) {
				previous = current;
				current = current.next;
			}
			data = previous.data;
		}
		return data;
	}

	// for printing the elements of the queue
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}