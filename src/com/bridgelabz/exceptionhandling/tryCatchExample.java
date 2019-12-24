package com.bridgelabz.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tryCatchExample {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			int num1, num2;

			System.out.println("Enter First Number : = ");
			num1 = scanner.nextInt();

			System.out.println("Enter Second Number : = ");
			num2 = scanner.nextInt();

			// java.lang.ArithmeticException: / by zero
			int num3 = num1 / num2;
			System.out.println("Result is " + num3);
			System.out.println();

			int arr[] = { 1, 3, 5, 7 };
			// java.lang.ArrayIndexOutOfBoundsException: 10
			System.out.println(arr[2]);

			PrintWriter pw = new PrintWriter("ritesh.txt"); // may be throw exception
			pw.println("saved");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Program Run Successfully ");
		}
	}
}