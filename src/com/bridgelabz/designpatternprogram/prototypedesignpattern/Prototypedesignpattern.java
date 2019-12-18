package com.bridgelabz.designpatternprogram.prototypedesignpattern;

/*******************************************************************************
 * 	1. Creational Design Patterns :-
 *  3. Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. 
 *  Use Prototype Pattern as shown in the Link above to create multiple Employee Object
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.util.List;

public class Prototypedesignpattern {

	public static void main(String[] args) {
		// Creating Employees Object
		Employees emps = new Employees();
		emps.lodaData();
		// Cloning The Employees Objects
		Employees empNew1 = (Employees) emps.clone();
		Employees empNew2 = (Employees) emps.clone();

		List<String> list1 = empNew1.getEmpList();
		list1.add("Ritesh");

		List<String> list2 = empNew2.getEmpList();
		list2.remove("Rahul");

		System.out.println("List Of Employees " + emps.getEmpList());
		System.out.println("EmpNew1 List" + list1);
		System.out.println("EmpNew2 List " + list2);
	}
}