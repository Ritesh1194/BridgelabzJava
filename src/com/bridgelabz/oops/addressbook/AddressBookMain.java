package com.bridgelabz.oops.addressbook;

/******************************************************************************
 * 
 * 1. Purpose : Address Book Problem
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 02-12-2019
 *
 ******************************************************************************/
import java.io.IOException;

import utility.Utility;

public class AddressBookMain {
	public static void main(String[] args) throws IOException {
		AddressBookManager addBookMan = new AddressBookManager();
		do {
			System.out.println("Enter your choice");
			System.out.println(" 1. Create Book \n 2. Open Book \n 3. Save Book \n 4. Save As  \n 5.Quit");
			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				addBookMan.createBook();
				break;
			case 2:
				addBookMan.openBook();
				break;
			case 3:
				addBookMan.saveBook();
				break;
			case 4:
				addBookMan.saveAsBook();
				break;
			case 5:
				System.out.println("Quit");
				addBookMan = null;
				break;
			}
		} while (addBookMan != null);
		System.out.println("You have exited");
	}
}