package com.bridgelabz.annotations;

public class DeprecatedAnnotations {
	/**
	 * Deprecated annotation is used for informing the compiler that the particular
	 * method, class or field is unimportant and it indicates that a declaration is
	 * outdated.
	 */
	@Deprecated
	public void display() {
		System.out.println("Hello Welcome To Ritesh World");
	}

	public static void main(String[] args) {
		DeprecatedAnnotations deprecatedAnnotations = new DeprecatedAnnotations();
		deprecatedAnnotations.display();
	}
}