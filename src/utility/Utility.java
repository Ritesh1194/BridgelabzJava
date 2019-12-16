package utility;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();

	/*
	 * returns InputInteger
	 */
	public static int inputInteger() {
		return sc.nextInt();
	}

	public static long inputLong() {
		return sc.nextLong();
	}
	/*
	 * returns InputDouble
	 */
	public static double inputDouble() {
		return sc.nextDouble();
	}

	/*
	 * returns InputFloat
	 */
	public static double inputFloat() {
		return sc.nextFloat();
	}
	/*
	 * returns InputString
	 */

	public static String inputString() {
		return sc.next();
	}

	/*
	 * Return Input String
	 */
	public static String inputStringLine() {
		return sc.nextLine();
	}

	/*
	 * Return Input Boolean
	 */
	public static boolean inputBoolean() {
		return sc.nextBoolean();
	}

	/*
	 * Check User Input Value is Number
	 */
	public static boolean checkNumber(int userNumber) {
		if (userNumber >= '0' && userNumber <= '9') {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Inventory Management
	 */
	public static boolean checkChoice(int choice) {
		if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6
				|| choice == 7) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Check Choice for Rice Wheat
	 */
	public static boolean checkChoiceOne(int choice) {
		if (choice == 1 || choice == 2 || choice == 3) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * method to check number
	 */
	public static boolean checkNumber(long currentAmount) {
		if (currentAmount >= 'A' && currentAmount <= 'Z' || currentAmount == 'a' && currentAmount == 'z') {
			return false;
		}
		while (currentAmount != 0) {
			long rem = currentAmount % 10;
			currentAmount = currentAmount / 10;
			if (rem == 0 || rem == 1 || rem == 2 || rem == 3 || rem == 4 || rem == 5 || rem == 6 || rem == 7 || rem == 8
					|| rem == 9)
				return true;
		}
		return false;
	}

	public static boolean checkString(String string) {
		char charcter[] = string.toCharArray();
		for (int i = 0; i < charcter.length; i++) {
			if (charcter[i] >= 'A' && charcter[i] <= 'Z' || charcter[i] == 'a' && charcter[i] == 'z') {
				return true;
			}
		}
		return false;
	}

	public static boolean stringChecker(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		Predicate<Character> p = s -> s >= 97 && s <= 122 || s >= 65 && s <= 90 || s >= 48 && s <= 57;
		for (char i : ch) {
			if (p.test(i)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Integer check
	 */
	public static boolean checkInteger(String number) {
		char ch[] = number.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				return true;
			}
		}
		return false;
	}

	/*
	 * @param-type: integer
	 * 
	 * @return-type: boolean
	 * 
	 */
	public static boolean validOption(int option) {
		if (option == 1 || option == 2 || option == 3)
			return true;
		return false;
	}

	public static String doctorId() {
		String output = "";
		String doctorId = "DOC";
		for (int i = 0; i < 3; i++) {
			output += random.nextInt(10);
		}
		int outputInt = Integer.parseInt(output);
		return doctorId += outputInt;

	}

	public static String patientId() {
		String output = "";
		String doctorId = "PAT";
		for (int i = 0; i < 3; i++) {
			output += random.nextInt(10);
		}
		int outputInt = Integer.parseInt(output);
		return doctorId += outputInt;

	}

	public static boolean mobileNumberValidator(String number) {
		if (number.matches("^[789]\\d{9}$")) {
			return true;
		}
		return false;
	}

	

	public static boolean isStringOnlyAlphabet(String str) {
		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}

	public static boolean intChecker(String number) {
		// regular expression for an integer number
		String regex = "[+-]?[0-9][0-9]*";

		// compiling regex
		Pattern p = Pattern.compile(regex);

		// Creates a matcher that will match input1 against regex
		Matcher m = p.matcher(number);

		if (m.find() && m.group().equals(number))
			return true;

		return false;
	}
	/*
	 * METHOD TO QUIT
	 */
	public static void quit() {
		System.exit(0);
	}
}