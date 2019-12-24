package com.bridgelabz.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
	private String name;

	public Test() {
		name = "Ritesh Yadav";
	}

	public void method1() {
		System.out.println("My Name Is : = " + name);
	}

	public void method2(int nam) {
		System.out.println("Number Is  : = " + nam);
	}

	private void method3() {
		System.out.println("Private Method Invoked : ");
	}
}

public class ReflectionDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// Creating object whose property is to be checked
		Test test = new Test();

		// Creating class object from the object using
		// getclass method
		Class cls = test.getClass();
		System.out.println("The Name Of Class Is : =  " + cls.getName());

		// Getting the constructor of the class through the
		// object of the class
		Constructor constructor = cls.getConstructor();
		System.out.println("The Name of The Constructor : = " + constructor.getName());

		System.out.println("Public Methods Are : = ");
		// Getting methods of the class through the object
		// of the class by using getMethods
		Method[] methods = cls.getMethods();
		// Printing method names
		for (Method method : methods)
			System.out.println(method.getName());

		// creates object of desired method by providing the
		// method name and parameter class as arguments to
		// the getDeclaredMethod
		Method method1 = cls.getDeclaredMethod("method2", int.class);
		// invokes the method at runtime
		method1.invoke(test, 8);
		System.out.println(method1.getName());

		// creates object of the desired field by providing
		// the name of field as argument to the
		// getDeclaredField method
		Field field = cls.getDeclaredField("name");
		System.out.println(field.getName());

		// allows the object to access the field irrespective
		// of the access specifier used with the field
		field.setAccessible(true);
		System.out.println(field.getName());

		// takes object and the new value to be assigned
		// to the field as arguments
		field.set(test, "Ravi");
		System.out.println(field);

		// Creates object of desired method by providing the
		// method name as argument to the getDeclaredMethod
		Method method2 = cls.getDeclaredMethod("method1");
		// invokes the method at runtime
		method2.invoke(test);
		System.out.println(method2);

		// creates object of the desired field by providing
		// the name of field as argument to the
		// getDeclaredField method
		Method method3 = cls.getDeclaredMethod("method3");
		// allows the object to access the field irrespective
		// of the access specifier used with the field
		method3.setAccessible(true);
		// invokes the method at runtime
		method3.invoke(test);
		System.out.println(method3);
	}
}