package com.bridgelabz.datastructuresPrograms;

/**
 * *****************************************************************************
 * 
 * @author : Ritesh Yadav
 * @version : 1.1
 * @since : 25-11-2019
 *
 */
public class LinkedList<T> {
	Node head;

	public class Node {
		Node next;
		T data;

		// constructor
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * for adding the element in the linkedlist
	 * 
	 * @param data
	 *            ==>T
	 */
	public void add(T data) {
		Node node = new Node(data);
		Node current = head;

		if (head == null) {
			head = node;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	/**
	 * removing from end of linked list.
	 * 
	 * @return T
	 */
	public T pop() {
		Node current = head;
		T data = null;
		if (head == null) {
			System.out.println("List is Empty..!!");
		} else {
			while (current.next.next != null) {
				current = current.next;
			}
			System.out.println("Removed element :" + current.next.data);
			data = (T) current.data;
			current.next = null;
		}
		return data;
	}

	/**
	 * Removing from list
	 */
	public void remove() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty..!!");
		} else {
			while (current.next.next != null) {
				current = current.next;
			}
			System.out.println("Removed element :" + current.next.data);
			current.next = null;
		}
	}

	/**
	 * searching the item
	 * 
	 * @param item
	 *            ==> T
	 * @return boolean
	 */
	public boolean search(T item) {

		Node current = head;
		if (head.data.equals(item)) {
			return true;
		}
		while (current.next != null) {
			current = current.next;
			if (current.data == item || current.data.equals(item)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * remove a particular item
	 * 
	 * @param item
	 *            ==> T
	 */
	public void removeItem(T item) {
		Node current = head;
		Node prev = null;
		if (head == null) {
			System.out.println("List is empty..!!");
			return;
		}
		if (head.data.equals(item)) {
			head = head.next;
		} else {
			while (current.next != null) {
				if (current.data.equals(item)) {
					System.out.println("Removed :" + current.data);
					prev.next = current.next;
					return;
				}
				prev = current;
				current = current.next;
			}
		}
	}

	// linkedlist is empty or not
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	/**
	 * removing the item from particular position
	 * 
	 * @param pos
	 *            ==> int
	 * @return T
	 */
	public T pop(int pos) {
		Node current = head;
		Node prev = null;
		T data = null;
		if (pos == 0) {
			data = (T) head.data;
			head = head.next;
			return (T) data;
		}
		for (int i = 0; i < pos; i++) {
			prev = current;
			current = current.next;
		}
		prev.next = current.next.next;
		return current.data;

	}

	/**
	 * Size of the list
	 */
	public int size() {
		Node current = head;
		int size = 0;
		if (head == null) {
			System.out.println("list is empty");
		} else {
			while (current.next != null) {
				size++;
				current = current.next;
			}
		}
		return size;
	}

	/**
	 * Adding the node in last of list
	 * 
	 * @param data
	 *            ==> T
	 */
	public void append(T data) {
		Node node = new Node(data);
		Node current = head;
		if (head == null) {
			head = node;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;

	}

	/**
	 * Returns the position of item.
	 * 
	 * @param item
	 *            ==>T
	 * @return int
	 */
	public int index(T item) {
		int index = 0;
		Node current = head;
		if (head == item) {
			return index;
		}
		while (current.next != null) {
			index++;
			current = current.next;
			if (current.data == item || current.data.equals(item)) {
				return index;
			}
		}
		return -1;
	}

	/**
	 * insert item at particular position
	 * 
	 * @param pos
	 *            ==> int
	 * @param data
	 *            ==> T
	 */
	public void insert(int pos, T data) {
		Node node = new Node(data);
		Node current = head;
		if (pos == 0) {
			head = node;
		} else
			for (int i = 0; i < pos - 1; i++) {
				current = current.next;
			}
		node.next = current.next;
		current.next = node;
	}

	/**
	 * Displaying the output
	 */
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty..!!");
		} else {
			while (current.next != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println(current.data);
		}
	}
}