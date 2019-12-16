package com.bridgelabz.oops.stockaccountmanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utility.Utility;

public class StockAccount {
	static StockAccountInterface accountService = new StockAccountManagementImpl();
	static String path = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/";
	static File file;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("Select following option ");
		System.out.println("1. Add Company Details");
		System.out.println("2. Remove Company Details");
		System.out.println("3. Create an Account");

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
				System.out.println("Enter Company Symbol");
				String symbol = Utility.inputString();
				accountService.removeCompanyDetails(symbol);
				menu();
				break;
			case "3":
				System.out.println("Create an Account");
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

	public static void buyOrSellStock(File file2) {
		System.out.println("1. Buy Some Share");
		System.out.println("2. Sell some Share");
		System.out.println("3. Print Transaction");
		double amount;
		String symbol;

		String choice = Utility.inputString();
		switch (choice) {
		case "1":
			System.out.println("Enter amount :\nEnter Symbol :");
			amount = Utility.inputDouble();
			symbol = Utility.inputString();
			accountService.buyShare(amount, symbol, file2);
			buyOrSellStock(file2);
			break;
		case "2":
			System.out.println("Enter amount :\nEnter Symbol :");
			amount = Utility.inputDouble();
			symbol = Utility.inputString();
			accountService.sellShare(amount, symbol, file2);
			buyOrSellStock(file2);
			break;
		case "3":
			accountService.printTransactionDetails();
			buyOrSellStock(file2);
			break;
		}
	}
}