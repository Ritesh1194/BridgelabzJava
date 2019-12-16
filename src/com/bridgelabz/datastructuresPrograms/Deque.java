package com.bridgelabz.datastructuresPrograms;
/**
 * *****************************************************************************
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 25-11-2019
 *
 */
class Deque<T> {
	public T data;
	public Deque<T> next;
	public Deque<T> pre;

	public Deque() {
		this.next = null;
		this.pre = null;
	}

	public Deque(T val) {
		this.data = val;
		this.next = null;
		this.pre = null;
	}
}