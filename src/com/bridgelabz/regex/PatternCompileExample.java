package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class PatternCompileExample {

	public static void main(String[] args) {
		String string1 = "Ritesh  " + " Yadav ";
		String string2 = ".*Ritesh.*";

		Pattern pattern = Pattern.compile(string2, Pattern.CASE_INSENSITIVE);
		System.out.println("Value Matches " + pattern);
	}
}