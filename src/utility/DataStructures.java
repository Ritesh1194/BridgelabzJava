package utility;

/** *****************************************************************************
 *	  Purpose: Data Structures Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.4
 *  @since   :  25-11-2019
 *
 ***************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.bridgelabz.datastructuresPrograms.Dequeue;
import com.bridgelabz.datastructuresPrograms.LinkedList;
import com.bridgelabz.datastructuresPrograms.PalindromeChecker;
import com.bridgelabz.datastructuresPrograms.Queue;
import com.bridgelabz.datastructuresPrograms.Stack;
import com.bridgelabz.datastructuresPrograms.StackLinkedList;

import utility.DataStructures;

public class DataStructures {
	/**
	 * Define static function unOrderLinkedList
	 * 
	 * @param item
	 *            --> String
	 * @return void
	 */
	public static void unOrderLinkedList(String item) throws IOException {
		LinkedList<String> list = new LinkedList<String>();
		String string = DataStructures.readFromFile(
				"/home/user/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/datastructuresPrograms/UnorderFile");
		String[] words = string.split(" ");
		for (String word : words)
			list.add(word);
		FileWriter fileWriter = new FileWriter(
				"/home/user/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/datastructuresPrograms/UnorderFile");

		if (list.search(item) == true) {
			list.removeItem(item);
		} else {
			list.add(item);
		}
		list.display();
		int size = list.size();
		for (int conut = 0; conut <= size; conut++) {
			fileWriter.write(list.pop(0) + " ");
		}
		fileWriter.close();
	}

	/**
	 * writing the data in the file
	 * 
	 * @param array
	 *            ==> String[]
	 * @param filename
	 *            ==> String
	 * @return void
	 */
	public static void fileWriter(String[] sorted, String filename) throws IOException {
		FileWriter fileWriter = new FileWriter(filename);
		for (String string : sorted) {
			if (string != null) {
				fileWriter.write(string);
				fileWriter.write(",");
			}
		}
		fileWriter.close();
	}

	public static BufferedReader bufferReader;

	/**
	 * writing the data in the file
	 * 
	 * @param data
	 *            ==> String
	 * @param filename
	 *            ==> String
	 * @return boolean
	 */

	public static boolean writeToFile(String data, String filename) {
		File file = new File(filename);
		BufferedWriter bw = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			bw = new BufferedWriter(new FileWriter(new File(filename)));
			bw.write(data);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * writing the data in the file
	 * 
	 * @param array
	 *            ==> int[][]
	 * @param rows
	 *            ==> int
	 * @param cols
	 *            ==> int
	 * @param filename
	 *            ==> String
	 * @return boolean
	 */
	public static boolean writeArrayToFile(int[][] array, int rows, int cols, String filename) {
		File file = new File(filename);
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(file);

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				printWriter.write(array[i][j] + " ");
			}
			printWriter.println();
		}
		printWriter.close();
		return true;
	}

	/**
	 * to read the data from the file
	 * 
	 * @param filename
	 *            ==> String
	 * @return String
	 */
	public static String readFromFile(String filename) {
		try {
			bufferReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {

			String line;
			while ((line = bufferReader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString();
	}

	/**
	 * Define static function OrderLinkedList
	 * 
	 * @param item
	 *            --> Integer
	 * @return void
	 */
	public static void orderLinkedList(Integer item) throws IOException {
		LinkedList<Integer> list = new LinkedList<Integer>();
		String string = DataStructures.readFromFile(
				"/home/user/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/datastructuresPrograms/OrderFile");
		String[] strArray = string.split(" ");
		int size = strArray.length;

		int[] array = new int[size];

		for (int conut = 0; conut < size; conut++) {
			array[conut] = Integer.parseInt(strArray[conut]);
		}

		// sorting the array
		int[] sortedArray = DataStructures.bubbleSort(array, size);

		// adding in data into linkedlist
		for (Integer number : sortedArray) {
			list.add(number);
		}
		System.out.println();
		FileWriter fileWriter = new FileWriter(
				"/home/user/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/datastructuresPrograms/OrderFile");
		// logic to search the item into the file
		if (list.search(item) == true) {
			list.removeItem(item); // removing the item if its already in file
		} else {
			System.out.println("Adding Elements");
			list.add(item); // adding the item into file
		}
		list.display();
		int length = list.size();
		for (int count = 0; count <= length; count++) {
			fileWriter.write(list.pop(0) + " ");
		}
		fileWriter.close();
	}

	/**
	 * Define static function balancedParenthesis() to balanced the parenthesis
	 * 
	 * @param exp
	 *            --> char
	 * @param length
	 *            --> int
	 * @return boolean
	 */
	public static boolean balancedParenthesis(char[] exp, int length) {
		Stack stack = new Stack(length);
		// logic to check parenthesis in expression
		for (int count = 0; count < length; count++) {
			if (exp[count] == '{' || exp[count] == '(' || exp[count] == '[')
				stack.push(exp[count]);
			if (exp[count] == '}' || exp[count] == ')' || exp[count] == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!isMatchingPair(stack.pop(), exp[count]))
						return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	/**
	 * define static function isMatchingPair() to match the opened and closed
	 * parenthesis to make pairs
	 * 
	 * @param ch1
	 *            ==> char
	 * @param ch2
	 *            ==> char
	 * @return boolean
	 */
	public static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	/**
	 * define static function BankCashCounter()
	 * 
	 * @param cash_count
	 *            ==> int
	 * @return boolean
	 */
	public boolean bankCashCounter(int cash_count) {
		Queue<Integer> queue = new Queue<Integer>();
		int count = 0;
		do {
			System.out.println("-----------Banking Cash Counter------------");
			System.out.println("Enter the choice");
			System.out.println("1:Add People  2:Cash Check  3:Exit");
			int choice = Utility.inputInteger();
			switch (choice) {

			case 1:
				queue.enQueue(count++);
				System.out.println("Adding " + count + " person to the queue");
				System.out.println("Do you want to: 1-Deposit 2-Withdraw");

				int ch = Utility.inputInteger();
				switch (ch) {
				case 1:
					System.out.println("Enter the amount to deposit");
					int dep_amt = Utility.inputInteger();
					cash_count += dep_amt;
					System.out.println(dep_amt + " is added");
					break;
				case 2:
					System.out.println("Enter the amount to withdraw");
					int withdraw = Utility.inputInteger();
					if (withdraw > cash_count) {
						System.out.println("Cash of that amount is not available");
					} else {
						cash_count -= withdraw;
						System.out.println(withdraw + " is withdrawn");
					}
					break;
				default:
					System.out.println("Invalid choice");
					System.exit(0);
				}
				queue.deQueue();
				System.out.println("The person is removed");
				break;
			case 2:
				System.out.println("The amount of cash available is: " + cash_count);
				break;
			case 3:
				System.exit(0);
			}
		} while (cash_count != 0);
		System.out.println("Ran out of cash");
		return false;
	}

	/**
	 * Define Boolean Function Palindrome checker()
	 * 
	 * @param s
	 *            --> String
	 * @return Boolean
	 */
	public boolean palindromeChecker(String string) {
		Dequeue<Character> utility = new Dequeue<Character>();

		// adding each character to the rear of the deque
		for (int count = 0; count < string.length(); count++) {
			char ch = string.charAt(count);
			utility.addRear(ch);
		}
		int flag = 0;

		while (utility.size() > 1) {
			if (utility.removeFront() != utility.removeRear()) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Define Boolean Function displayPalindrome checker()
	 * 
	 * @param s
	 *            --> String
	 * @return void
	 */
	public void displayPalindromeChecker(String s) {
		if (palindromeChecker(s)) {
			System.out.println("String is  palindrome");

		} else
			System.out.println("String is not palindrome");
	}

	/**
	 * Define Boolean Function Prme2D()
	 * 
	 * @return Boolean
	 */
	public boolean prime2D() {
		int number = 1;
		int[][] primeNumber = new int[10][100];
		// logic to check the number is prime or not
		for (int count = 0; count < 10; count++) {
			for (int count1 = 0; count1 < 100; count1++) {
				if (DataStructures.isPrime(number)) {
					primeNumber[count][count1] = number;
				} else {
					primeNumber[count][count1] = -1;
				}
				number++;
			}
		}
		// empty string to store prime numbers
		String prime = "";
		for (int j[] : primeNumber) {
			for (int i : j) {
				if (i != -1 && i != 1) {
					System.out.print(i + " ");
					prime = prime + i + " ";
				}
			}
			System.out.println();
		}
		boolean status = DataStructures.writeToFile(prime, "Ritesh.txt");
		System.out.println(status);
		return status;
	}

	/**
	 * Define Boolean Function primeAnagramPrint()
	 * 
	 * @return void
	 */
	public void primeAnagramPrint() {
		int arr[] = new int[1000];
		// logic to check the prime numbers
		int number = 2;
		for (int count = 0; count < arr.length; count++) {
			if (DataStructures.isPrime(number)) {

				arr[count] = number;
			}
			number++;
		}
		System.out.println("Numbers that are prime and anagram : ");

		// logic to check prime numbers are anagram or not
		for (int k = 0; k < arr.length; k++) {
			for (int j = k + 1; j < arr.length; j++) {
				if (DataStructures.isAnagram(arr[k], arr[j]) && (arr[k] != 0 && arr[j] != 0)) {
					System.out.println(arr[k] + " " + arr[j]);

				}
			}
		}
	}

	/**
	 * Define Boolean Function primeAnagramUSingStack()
	 * 
	 * @return void
	 */
	public void primeAnagramUsingStack() {
		StackLinkedList<Integer> stack = new StackLinkedList<Integer>();

		// logic to push the prime number into stack
		for (int i = 2; i <= 1000; i++) {
			if (DataStructures.isPrime(i)) {
				stack.push(i);
			}
		}

		// logic to store prime numbers from stack to array
		int size = stack.size();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = stack.pop();
		}

		// logic to check prime numbers are anagram or not
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (DataStructures.isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}
	}

	/**
	 * Define Boolean Function primeAnagramUsingQueue()
	 * 
	 * @return void
	 */
	public void primeAnagramUsingQueue() {
		Queue<Integer> queue = new Queue<Integer>();

		// Logic to check the number is prime or not
		for (int i = 2; i <= 1000; i++) {
			if (DataStructures.isPrime(i)) {
				queue.enQueue(i);
			}
		}

		int size = queue.getSize();
		int[] array = new int[size];

		// Logic to dequeue the number and store the numbers into array
		for (int i = 0; i < size; i++) {
			array[i] = queue.deQueue();
		}

		// Logic to check the prime numbers are anagram and store in queue
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (DataStructures.isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0) {
					queue.enQueue(array[i]);
					queue.enQueue(array[j]);
				}
			}
		}
		queue.display();
	}

	/**
	 * to check the number is prime or not
	 * 
	 * @param num
	 *            ==> int
	 * @return boolean
	 */
	public static boolean isPrime(int num) {
		boolean flag = true;
		for (int count = 2; count <= num / 2; count++) {
			if (num % count == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int countDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			++count;
		}
		return count;
	}

	/**
	 * to check the number is anagram or not
	 * 
	 * @param n1
	 *            ==> int
	 * @param n2
	 *            ==> int
	 * @return boolean
	 */
	public static boolean isAnagram(int n1, int n2) {
		int len1 = countDigits(n1);
		int len2 = countDigits(n2);
		if (len1 != len2) {
			return false;
		}
		int i = 0;
		int j = 0;
		int[] num1 = new int[len1];
		int[] num2 = new int[len2];
		while (n1 != 0) {
			int rem = n1 % 10;
			num1[i] = rem;
			n1 = n1 / 10;
			i++;
		}
		while (n2 != 0) {
			int rem = n2 % 10;
			num2[j] = rem;
			n2 = n2 / 10;
			j++;
		}
		Arrays.sort(num1);
		Arrays.sort(num2);

		if (Arrays.equals(num1, num2))
			return true;
		else
			return false;
	}

	/**
	 * Define Boolean Function bubbleSort()
	 * 
	 * @param arr[]
	 *            --> int
	 * @param length
	 *            --> int
	 * @return int
	 */

	public static int[] bubbleSort(int[] arr, int length) {
		// Logic to sort the array
		int i, j, temp;
		for (i = 0; i < length; i++) {
			int flag = 0;
			for (j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// swapping the two elements in array to sort the array
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

	/**
	 * Calender print
	 * 
	 * @param ==>
	 *            int ==> int
	 * @return int
	 */
	public void calender(int month, int year) {

		int month1, x, day = 1, day1, year1;

		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] dayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int monthDay = 0;
		// logic to check the day in month
		for (int i = 0; i < dayInMonth.length; i++) {
			if (i == month - 1) {
				monthDay = dayInMonth[i];
			}
		}
		// Initializating 2D array
		int[][] totalDays = new int[6][7];

		// logic to check leap year or not
		boolean leapYear = BasicCorePrograms.leapYear(year);
		if ((leapYear == true) && (month == 2)) {
			monthDay = 29;
		}

		int z = 1;
		// logic to check the total days in month
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDays[i][j] = -1;
				} else if (z <= monthDay) {
					totalDays[i][j] = z;
					z++;
				} else {
					totalDays[i][j] = -1;
				}
			}
		}

		// logic to check the month of the year
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.println(monthName[i] + " " + year);
			}
		}
		System.out.println();

		String[] dayName = { "S", "M", "T", "W", "T", "F", "S" };
		for (int i = 0; i < 7; i++) {
			System.out.print(dayName[i] + "  ");
		}
		System.out.println();

		// logic to print the calendar
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (totalDays[i][j] != -1) {
					if (totalDays[i][j] < 10)
						System.out.print(totalDays[i][j] + "  ");
					else
						System.out.print(totalDays[i][j] + " ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}