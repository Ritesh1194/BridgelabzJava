package com.bridgelabz.annotations;

public class OverrideAnnotations {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.display();
	}

}

class Parent {
	public void display() {
		System.out.println("I'm Ritesh Yadav");
	}
}

class Child extends Parent {
	/**
	 * It is a Marker type Annotation. An Override Annotation is designed to ensure
	 * that a super-class method is overridden, and not overloaded. A method
	 * annotated with @Override is expected to override a method from a super-class
	 * else a compile-time error will be thrown.
	 */
	@Override
	public void display() {
		System.out.println("I'm Ravi Yadav");
	}
}