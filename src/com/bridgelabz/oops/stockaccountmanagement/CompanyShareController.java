package com.bridgelabz.oops.stockaccountmanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import utility.Utility;

public class CompanyShareController {

	public static CompanyShare companyDetails() {

		System.out.println("Enter Company Name");
		String cName = Utility.inputString();
		// if (Utility.isStringOnlyAlphabet(cName)) {
		// }

		System.out.println("Enter Company Symbol");
		String symbol = Utility.inputString();

		System.out.println("Enter Number of Share");
		int numberOfShare = Utility.inputInteger();

		System.out.println("Enter Price");
		double price = Utility.inputDouble();

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		// to print in a particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String dateTime = current.format(format);

		CompanyShare companyShare = new CompanyShare(cName, symbol, numberOfShare, price, dateTime);
		return companyShare;
	}
}