package com.bridgelabz.annotations;

import java.lang.annotation.Documented;

@Documented
@interface DocumentAnnotation {
	public class DocumentedAnnotations {

		public static void main(String[] args) {
			int x = 10, y = 20, z;
			z = x + y;
			System.out.println("Sum of the integers = " + z);
		}
	}
}