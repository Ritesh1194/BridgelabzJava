package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherExample {

	public static void main(String[] args) {
		String content = "This is a tutorial Website!";
		String patternString = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(content);
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
	}
}