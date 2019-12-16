package com.bridgelabz.oops.stockaccountmanagement;

import java.io.File;

public interface StockAccountInterface {

	void addCompanyDetails(File file, CompanyShare companyDetails);

	void buyShare(double amount, String symbol, File file2);

	void sellShare(double amount, String symbol, File file2);

	void printReport();

	void removeCompanyDetails(String symbol);

	void printTransactionDetails();

}