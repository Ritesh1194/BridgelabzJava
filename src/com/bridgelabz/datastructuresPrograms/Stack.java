package com.bridgelabz.datastructuresPrograms;

/*******************************************************************************
 * 3. .Take an Arithmetic Expression such as
 * (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order
 * the performance of operations. Ensure parentheses must appear in a balanced
 * fashion.
 * 
 * @author : Ritesh Yadav
 * @version : 1.1
 * @since : 25-11-2019
 *
 */
import java.util.NoSuchElementException;

public class Stack<T> {

	int top;
	char[] stackArray;
	int size;

	/**
	 * define parameterised constructor
	 * 
	 * @param s
	 *            ==> int
	 */
	public Stack(int s) {
		size = s;
		stackArray = new char[size];
		top = 0;
	}

	public Stack() {
		// TODO Auto-generated constructor stub
	}

	// adding the elements in a stack
	public char push(char data) {
		if (top == size) {
			System.out.println("Overflow");
		} else {
			stackArray[top++] = data;
		}
		return data;
	}

	/**
	 * removing the elements from the stack
	 * 
	 * @return char
	 */
	public char pop() {
		char data = 0;
		if (isEmpty()) {
			throw new NoSuchElementException("UnderFlow");
		} else {
			data = stackArray[--top];
			stackArray[top] = 0;

		}
		return data;

	}

	/**
	 * define function peek() to get the last elements from the stack
	 * 
	 * @return int
	 */
	public int peek() {
		int data = stackArray[top - 1];
		return data;
	}

	/**
	 * to check the stack is empty or not
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return (top <= 0);
	}

	/**
	 * to check the size of the stack
	 * 
	 * @return int
	 */
	public int size() {
		return top;
	}

	// to print the elements of the stack
	public void show() {
		for (int i : stackArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}