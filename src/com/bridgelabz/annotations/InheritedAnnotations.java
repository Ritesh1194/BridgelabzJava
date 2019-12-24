package com.bridgelabz.annotations;

@interface MyAnnotation {

}

@interface MyInheritedAnnotations {

}

@MyAnnotation
@MyInheritedAnnotations
class BaseClass {
}

class SubClass extends BaseClass {

}

public class InheritedAnnotations {

	public static void main(String[] args) {
		/**
		 * Annotations in Java are not inherited to subclasses by default. Hence, the
		 * Inherited Annotation marks the annotation to be inherited to subclasses. The
		 * following is an example of Inherited Annotation
		 */
		MyAnnotation myAnnotation = SubClass.class.getAnnotation(MyAnnotation.class);
		System.out.println(myAnnotation);

		MyInheritedAnnotations myInheritedAnnotations = SubClass.class.getAnnotation(MyInheritedAnnotations.class);
		System.out.println(myInheritedAnnotations);
	}
}