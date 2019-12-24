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
		MyAnnotation myAnnotation = SubClass.class.getAnnotation(MyAnnotation.class);
		System.out.println(myAnnotation);

		MyInheritedAnnotations myInheritedAnnotations = SubClass.class.getAnnotation(MyInheritedAnnotations.class);
		System.out.println(myInheritedAnnotations);
	}
}