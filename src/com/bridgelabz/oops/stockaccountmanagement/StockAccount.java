package com.bridgelabz.oops.stockaccountmanagement;

/** StockAccount.java implements a data type that might be used by a financial institution to keep track of customer information. The StockAccount class implements following methods
The StockAccount class also maintains a list of CompanyShares object which has Stock Symbol and Number of Shares as well as DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are available and accordingly update or create an Object.
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 15-12-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.oops.addressbook.AddressBookMain;

import utility.Utility;

public class StockAccount {
	static StockAccountInterface accountService = new StockAccountManagementImpl();
	private static final String PATH = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/";
	static File file;

	public static void main(String[] args) {
		menu();
	}

	/**
	 * Define static function menu()
	 * 
	 * @return void
	 */
	public static void menu() {
		System.out.println("Select following option : ");
		System.out.println("1. Add Company Details ");
		System.out.println("2. Remove Company Details ");
		System.out.println("3. Create an Account ");

		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			switch (choice) {
			case "1":
				CompanyShare companyDetails = CompanyShareController.companyDetails();
				file = new File("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/CompanyList.json");
				accountService.addCompanyDetails(file, companyDetails);
				menu();
				break;
			case "2":
				System.out.println("Enter Company Symbol ");
				String symbol = Utility.inputString();
				accountService.removeCompanyDetails(symbol);
				menu();
				break;
			case "3":
				System.out.println("Create an Account ");
				String name = Utility.inputString();
				createAccount(name);
				menu();
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		}
	}

	/**
	 * Define static function createAccount()
	 * 
	 * @param fileName
	 *            --> String
	 * @return void
	 */

	private static void createAccount(String fileName) {
		file = new File("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/" + fileName + ".json");
		try (FileWriter fileWriter = new FileWriter(file)) {
			System.out.println(file + " Created Successfully !!!");
			if (file.length() == 0) {
				String defaultValue = "[]";
				fileWriter.write(defaultValue);
				fileWriter.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		buyOrSellStock(file);
	}

	/**
	 * Define static functio￼n buyOrSellStock()
	 * 
	 * @param file2
	 *            --> File
	 * @return void
	 */
	public static void buyOrSellStock(File file2) {
		System.out.println("1. Buy Some Share ");
		System.out.println("2. Sell some Share ");
		System.out.println("3. Print Transaction ");
		System.out.println("4. Go Back to main");
		double amount;
		String symbol;

		String choice = Utility.inputString();
		switch (choice) {
		case "1":
			System.out.println("Enter amount : ");
			amount = Utility.inputDouble();
			System.out.println("Enter Symbol : ");
			symbol = Utility.inputString();
			accountService.buyShare(amount, symbol, file2);
			buyOrSellStock(file2);
			break;
		case "2":
			System.out.println("Enter amount : ");
			amount = Utility.inputDouble();
			System.out.println("Enter Symbol : ");
			symbol = Utility.inputString();
			accountService.sellShare(amount, symbol, file2);
			buyOrSellStock(file2);
			break;
		case "3":
			accountService.printTransactionDetails();
			buyOrSellStock(file2);
			break;
		case "4":
			System.out.println();
			StockAccount.main(null);
			break;
		default:
			System.out.println("Invalid Choice ");
		}
	}
}