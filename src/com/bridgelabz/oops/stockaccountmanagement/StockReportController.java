package com.bridgelabz.oops.stockaccountmanagement;

/** StockAccount.java implements a data type that might be used by a financial institution to keep track of customer information. The StockAccount class implements following methods
The StockAccount class also maintains a list of CompanyShares object which has Stock Symbol and Number of Shares as well as DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are available and accordingly update or create an Object.
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 15-12-2019
 *
 ******************************************************************************/
import utility.Utility;

public class StockReportController {

	static MyLinkedList<StockPortfolio> list;

	public static void main(String[] args) {

		StockReportController report = new StockReportController();
		StockReportController.getStockData();
		report.printReport();
	}

	/**
	 * gets user input of stock data
	 * 
	 * @param-type: Takes no argument
	 * @return-type: Doesn't return anything
	 */
	static void getStockData() {
		System.out.println("Enter Number Of Stocks: ");
		int count = Utility.inputInteger();
		list = new MyLinkedList<StockPortfolio>();

		for (int i = 0; i < count; i++) {
			System.out.println("Enter Stock Name, Number Of Shares and Share Price: ");
			String name = Utility.inputString();
			int numberOfShares = Utility.inputInteger();
			int price = Utility.inputInteger();
			StockPortfolio stock = new StockPortfolio(name, numberOfShares, price);
			list.add(stock);
		}
	}

	/**
	 * Print the Stock Report
	 * 
	 * @param-type: Takes no argument
	 * @return-type: Doesn't return anything
	 * 
	 */
	void printReport() {
		int totalValue = 0;

		System.out.println("----------STOCK REPORT----------");
		System.out.println("\nName\tShares\tPrice\tValue");
		while (!list.isEmpty()) {
			StockPortfolio folio = list.pop();
			totalValue += folio.getValue();
			System.out.println(folio.getName() + "\t" + folio.getNumberOfShares() + "\t" + folio.getPrice() + " \t"
					+ folio.getValue());
		}
		System.out.println("\nTotal stock value is: " + totalValue);
	}
}