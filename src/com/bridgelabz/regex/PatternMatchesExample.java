package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class PatternMatchesExample {

	public static void main(String[] args) {
		String string1 = "Ritesh  " + " Yadav ";
		String string2 = ".*Ravi.*";

		boolean isMatch = Pattern.matches(string2, string1);
		System.out.println("Value Matches " + isMatch);
	}
}