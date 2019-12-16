
package com.bridgelabz.algorithms;

/** *****************************************************************************
 *	9. Rewrite Use Generics for Search.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.util.*;

import utility.Algorithms;

public class SearchUsingGenerics<Object> {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		Integer query = 30;

		System.out.println(Algorithms.linear(list, query));
	}
}