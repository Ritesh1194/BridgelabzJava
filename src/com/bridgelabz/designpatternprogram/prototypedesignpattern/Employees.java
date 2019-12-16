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
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void lodaData() {
		empList.add("Ravi");
		empList.add("Rahul");
		empList.add("Ritesh");
		empList.add("Raja");
	}

	public List<String> getEmpList() {
		return empList;
	}

	public Object clone() {
		List<String> temp = new ArrayList<String>();
		for (String string : this.getEmpList()) {
			temp.add(string);
		}
		return new Employees(temp);

	}
}