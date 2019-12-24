package com.bridgelabz.annotations;

public class SuppressWarningAnnotations {
	/**
	 * Suppress Warning Annotations are used to eliminate/suppress interpreter
	 * warnings during the program execution. Suppress Warning annotation can be
	 * applied to any type of declaration. The following is an example of this type
	 * of annotations.
	 */
	@SuppressWarnings({ "checked", "deprecation" })
	public static void main(String[] args) {
		DeprecatedTest deprecatedTest = new DeprecatedTest();
		deprecatedTest.display();

	}
}

class DeprecatedTest {
	@Deprecated
	public void display() {
		System.out.println("Hello Welcome To Home");
	}
}