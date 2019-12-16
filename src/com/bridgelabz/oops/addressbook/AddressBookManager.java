package com.bridgelabz.oops.addressbook;

/******************************************************************************
 * 
 * 1. Purpose : Address Book Problem
 * 
 * @author : Ritesh Yadav
 * @version : 1.3
 * @since : 02-12-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import utility.Oops;
import utility.Utility;

public class AddressBookManager {
	private static String book1;
	private static String BookName;
	private AddressBook addressBook = null;
	private static List<Person> listOfPersons = new ArrayList<Person>();

	/**
	 * Function to getBookName()
	 * 
	 * @return String
	 */
	public static String getBookName() {
		return "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/" + book1;
	}

	/**
	 * Function to get files
	 * 
	 * @return array of files
	 */
	private File[] getFiles() {
		return new File("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/").listFiles();
	}

	/**
	 * Function to create an address book that is in the form of a file with .json
	 * extension
	 * 
	 * @throws IOException
	 */
	public void createBook() throws IOException {
		System.out.println("Enter name of address book");
		String book = Utility.inputString();
		File file = new File("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/" + book + ".json");
		BookName = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/" + book + ".json";
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	/**
	 * Function to open the address book that we enter
	 * 
	 * @throws IOException
	 */
	public void openBook() throws IOException {
		System.out.println("Files available \n");
		File[] arrayOfFiles = getFiles();

		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}

		System.out.println("Choose the address book");
		book1 = Utility.inputString();

		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (book1.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Address book is not empty");

					String string = Oops.readJsonFile(filename);
					listOfPersons = Oops.userReadValue(string, AddressBook.class);
					addressBook();

				}
			} else {
				System.out.println("Address Book is empty");
				System.out.println("Add new data onto the Address Book");
				addressBook();
			}
		}
	}

	/**
	 * Function to write the list of persons on the address book that is opened
	 * 
	 * @throws IOException
	 */
	public void saveBook() throws IOException {
		Oops.writeFile1(AddressBook.getJsonObject(), AddressBookManager.getBookName());
		System.out.println("File Saved Successfully");
	}

	/**
	 * Function to save the book with different path, name or extension
	 * 
	 * @throws IOException
	 */
	public void saveAsBook() throws IOException {
		System.out.println("Files available are:");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book you want to save as with extention");
		String ch_book1 = Utility.inputString();
		File file = new File(ch_book1);
		if (file.createNewFile()) {
			System.out.println("File is created");
			String json = Oops.userWriteValueAsString(listOfPersons);
			Oops.writeFile(json, book1);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	/**
	 * Function to close the address book
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException {
		System.out.println("Would you like to save the changes? Y / N");
		String answer = Utility.inputString();
		if (answer.equalsIgnoreCase("Y")) {
			saveBook();
		}
		addressBook = null;
	}

	/**
	 * Function that performs various operations on the opened address book
	 * 
	 * @throws IOException
	 */
	public void addressBook() throws IOException {
		addressBook = new AddressBook();
		do {
			System.out.println("Enter choice");
			System.out.println(
					" 1. Add Person \n 2. Edit Person \n 3. Display Persons \n 4. Delete Person \n 5. Sort \n 6.Go Back to main ");
			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				addressBook.addPerson();
				break;
			case 2:
				addressBook.editPerson();
				break;
			case 3:
				addressBook.display();
				break;
			case 4:
				addressBook.deletePerson();
				break;
			case 5:
				sort();
				break;
			case 6:
				AddressBookMain.main(null);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (addressBook != null);
	}

	/**
	 * Function to sort the list of persons of the opened book by their last name
	 * and by their address zipcode
	 */
	public void sort() {
		System.out.println("Enter your choice");
		System.out.println("1. Sort by Last Name  2. Sort by Zip Code");
		int ch = Utility.inputInteger();
		switch (ch) {
		case 1:
			System.out.println("Sorting by last name");
			addressBook.sortByLastName();

			System.out.println("Your list is sorted");
			break;
		case 2:
			System.out.println("Sorting by zip code");
			addressBook.sortByZipCode();

			System.out.println("Your list is sorted");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}