package com.bridgelabz.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
	String Developer() default "Edureka";

	String Expirydate();
}

public class CustomAnnotations {
	/**
	 * Java Custom annotations are the User-defined annotations that are easy to
	 * create and use. The @Interface element is used to declare an annotation.
	 */
	@TestAnnotation(Developer = "Ritesh", Expirydate = "01-Aug-2050")
	void function1() {
		System.out.println("Testing Annotation method 1");
	}

	@TestAnnotation(Developer = "Raj", Expirydate = "01-Oct-2075")
	void function2() {
		System.out.println("Test Annotation method 2");
	}

	public static void main(String args[]) {
		System.out.println("Customized Annotations Example");
	}
}
