package com.bridgelabz.datastructuresPrograms;

/**
 * *****************************************************************************
 * 
 * @author : Ritesh Yadav
 * @version : 1.1
 * @since : 25-11-2019
 *
 */
public class Node<T> implements Comparable<T> {

	public Node data;
	public Node<T> next;
	public Node<T> prev;
	public Node nextNode;
	public String data1;
	// public int data2;

	/**
	 * Constructors to initialize the inst ance variables
	 */
	public Node() {
		this.next = next;
		this.data = data;
	}

	/**
	 * Parameterized Constructors to initialize instance and local variables
	 * 
	 * @param data
	 *            the data to store in the node of a linked list
	 * @param next
	 *            the address of the next node
	 */
	public Node(T data, Node<T> next) {
		this.data = (Node) data;
		// this.data2 = data2;
		this.next = next;
	}

	/**
	 * Parameterized Constructors to initialize the data
	 * 
	 * @param data
	 * 
	 * 
	 * 
	 * 
	 *            the data to store in the node of a linked list
	 */
	public Node(T data) {
		this.data = (Node) data;
		// this.data2=data2;

	}

	/**
	 * Getter method to get the data
	 * 
	 * @return
	 */
	public T getData() {
		return (T) data;
	}

	/**
	 * Setter method to set the data
	 * 
	 * @param data
	 *            the data to be set
	 */
	public void setData(T data) {
		this.data = (Node) data;
	}

	/**
	 * Getter method to get the link of the next node
	 * 
	 * @return the link of the next node
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * Setter Method to set the link of the next node
	 * 
	 * @param next
	 *            the link that has the address of the next node
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

	/**
	 * Getter Method to get the address of the previous node
	 * 
	 * @return the address of the previous node
	 */
	public Node<T> getPrev() {
		return prev;
	}

	/**
	 * Setter Method to get the address of the previous node
	 * 
	 * @return the address of the previous node
	 */
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	/**
	 * Overriding the compareTo() method of the Comparable interface
	 * 
	 * @param object
	 *            the instance of a class that needs to be compared with the
	 *            variables.
	 * @return 0 if equal else 1
	 */
	@Override
	public int compareTo(T obj) {
		if (obj == this.data) {
			return 0;
		} else {
			return 1;
		}
	}
}