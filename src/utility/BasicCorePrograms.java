package utility;

/** *****************************************************************************
 *   Purpose: Basic Core Programs  Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.1
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {

	private static final String TEMPLATE = "Hello userName, How Are You ?";

	/**
	 * Define static function replaceString1()
	 * 
	 * @param userName
	 *            --> String
	 * @return boolean
	 */
	public static boolean replaceString1(String userName) {
		if (userName.length() < 3) {
			System.out.println("Enter more Then 3 Character");
			return true;
		} else {
			return false;
		}
	}

	public static void printUserName(String userName) {
		System.out.print(TEMPLATE.replaceAll("userName", userName));
	}

	/**
	 * Define static function numberOfTail()
	 * 
	 * @param number
	 *            --> int
	 * @return int
	 */
	public static int numberOfTail(int number) {
		int tail = 0;
		Random random = new Random();
		for (int i = 0; i < number; i++) {
			if (random.nextInt() < 0.5)
				tail++;
		}
		return tail;
	}

	/**
	 * Define static function percentageOfTail()
	 * 
	 * @param tail
	 *            --> int
	 * @param number
	 *            --> int
	 * @return int
	 */
	public static int percentageOfTail(int tail, int number) {
		return (100 * tail) / number;

	}

	/**
	 * Define static function validatePositiveNumber()
	 * 
	 * @param number
	 *            --> int
	 * @return boolean
	 */
	public static boolean validatePositiveNumber(int number) {
		if (number > 0)
			return true;
		else
			return false;
	}

	/**
	 * Define static function checkCondition()
	 * 
	 * @param num
	 *            --> int
	 * @return boolean
	 */
	public static boolean checkCondition(int num) {
		if (num == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Define static function printharmonicNumber()
	 * 
	 * @param num
	 *            --> double
	 * @return double
	 */
	public static double printharmonicNumber(double num) {
		double result = 0;
		for (int i = 1; i <= num; i++) {
			result = result + (1.0 / i);
		}
		return result;
	}

	/*
	 * Leap Year Method
	 */
	// public static boolean validYear(int year) {
	// if (year <= 4) {
	// return true;
	// } else {
	// return false;
	// }
	// }
	/**
	 * Define static function leapYear()
	 * 
	 * @param year
	 *            --> int
	 * @return boolean
	 */
	public static boolean leapYear(int year) {
		if (year >= 1000 && year < 10000) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Define static function checklessThan31()
	 * 
	 * @param num
	 *            --> int
	 * @return boolean
	 */
	public static boolean checkLessThan31(int num) {
		if (num > 31)
			return false;
		else
			return true;
	}

	/**
	 * Define static function printPowerValue()
	 * 
	 * @param num
	 *            --> int
	 * @return int
	 */

	public static int printPowerValue(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.println("2 ^ " + i + " = " + Math.pow(2, i));
		}
		return num;
	}

	/**
	 * Define static function primeFactors()
	 * 
	 * @param num
	 *            --> int
	 * @return void
	 */
	public static void primefactors(int num) {
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
	}
}