package com.bridgelabz.oops.stockaccountmanagement;

/** StockAccount.java implements a data type that might be used by a financial institution to keep track of customer information. The StockAccount class implements following methods
The StockAccount class also maintains a list of CompanyShares object which has Stock Symbol and Number of Shares as well as DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are available and accordingly update or create an Object.
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 15-12-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.addressbook.AddressBookManager;

import utility.Oops;
import utility.Utility;

public class StockAccountManagementImpl implements StockAccountInterface {
	String path = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/CompanyList.json";
	File fileRead = new File(path);
	MyStack<String> transactionStack;
	MyQueue<String> transactionQueue;
	CompanyShare[] companyShares;

	public StockAccountManagementImpl() {
		transactionStack = new MyStack<>();
		transactionQueue = new MyQueue<>();
	}

	/**
	 * Define function addCompanyDetails()
	 * 
	 * @param file
	 *            --> File
	 * @param companyDetails
	 *            --> CompanyShare
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void addCompanyDetails(File file, CompanyShare companyDetails) {
		JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();
		JSONObject baseJson = (JSONObject) StockAccountRepository.readData(file);
		JSONObject json = (JSONObject) baseJson.get("STOCK MARKET");

		jsonObject.put("CompanyName", companyDetails.getCompanyName());
		jsonObject.put("CompanySymbol", companyDetails.getCompanySymbol());
		jsonObject.put("NumberOfShare", companyDetails.getNumberOfShare());
		jsonObject.put("Price", companyDetails.getPrice());
		jsonObject.put("Date", companyDetails.getDateTime());

		array.add(jsonObject);
		json.put(companyDetails.getCompanySymbol(), array);
		StockAccountRepository.writeData(file, baseJson);
	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
	}

	/**
	 * Define function buyShare()
	 * 
	 * @param ammount
	 *            --> double
	 * @param symbol
	 *            --> String
	 * @param fileWrite
	 *            --> File
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void buyShare(double amount, String symbol, File fileWrite) {
		int count = 0;
		double price = 0;
		JSONArray array, jsonArray = null;

		JSONObject jsonObject = StockAccountRepository.readData(fileRead);
		JSONObject json = (JSONObject) jsonObject.get("STOCK MARKET");
		System.out.println(json);
		if ((array = (JSONArray) json.get(symbol)) != null) {
			jsonArray = array;
			Iterator<?> iterator = array.iterator();
			while (iterator.hasNext()) {
				JSONObject cDetails = (JSONObject) iterator.next();
				price = (double) cDetails.get("Price");
			}

			int numberOfShare = (int) Math.round(amount / price);
			System.out.println("Share :" + numberOfShare);

			array = updateCompanyDetails(jsonArray, numberOfShare);

			LocalDateTime current = LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			String dateTime = current.format(format);

			JSONObject accountObject = new JSONObject();
			accountObject.put("Symbol", symbol);
			accountObject.put("PurchaseShare", numberOfShare);
			accountObject.put("PurchaseTime", dateTime);
			accountObject.put("Price", price);

			JSONArray array2 = new JSONArray();
			array2.add(accountObject);

			StockAccountRepository.writeData(fileRead, jsonObject);
			StockAccountRepository.writeData(fileWrite, array2);

			transactionStack.push("Purchased");
			transactionQueue.enqueue(dateTime);
		} else {
			System.out.println("The Stock you are trying to purchase is not available in Stock Market");
		}
	}

	/**
	 * Define JSONArray function updateCompanyDetails()
	 * 
	 * @param jsonArray
	 *            --> JSONArray
	 * @param numberOfShare
	 *            --> int
	 * @return JSONArray
	 */

	private JSONArray updateCompanyDetails(JSONArray jsonArray, int numberOfShare) {
		long updatedShare = 0;

		Iterator<?> iterator = jsonArray.iterator();
		while (iterator.hasNext()) {
			JSONObject type = (JSONObject) iterator.next();
			updatedShare = (long) type.get("NumberOfShare");
			System.out.println("updated share " + updatedShare);
			if (numberOfShare > updatedShare) {
				System.out.println("Number of Share should be less than total share which is :" + updatedShare);
			} else {
				updatedShare = updatedShare - numberOfShare;
				type.put("NumberOfShare", updatedShare);
			}
		}
		return jsonArray;
	}

	/**
	 * Define function sellShare()
	 * 
	 * @param ammount
	 *            --> double
	 * @param symbol
	 *            --> String
	 * @param file2
	 *            --> File
	 * @return void
	 */
	@Override
	public void sellShare(double amount, String symbol, File file2) {
		double price = 0;
		JSONArray jsonArray = StockAccountRepository.readArrayData(file2);
		if (jsonArray.size() != 0) {
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject, accountJson = null;
			while (iterator.hasNext()) {
				if ((jsonObject = (JSONObject) iterator.next()).get("Symbol").equals(symbol)) {
					if (jsonObject.get("PurchaseShare") != null) {
						accountJson = jsonObject;
						price = (double) jsonObject.get("Price");
					}
				}
			}
			int numberOfShare = (int) Math.round(amount / price);
			System.out.println("Share :" + numberOfShare);

			jsonObject = updateAccountDetails(accountJson, numberOfShare);

			StockAccountRepository.writeData(file2, jsonArray);
		} else {
			System.out.println("You doesn't have any share please buy some share berfore selling\n");
		}
	}

	/**
	 * Define JSONObject function updateAccountDetails()
	 * 
	 * @param accountJson
	 *            --> JSONObject
	 * @param numberOfShare
	 *            --> int
	 * @return JSONObject
	 */
	private JSONObject updateAccountDetails(JSONObject accountJson, int numberOfShare) {
		long share = (long) accountJson.get("PurchaseShare");
		long updatedShare = 0;
		String dateTime = "";
		if (share > numberOfShare) {
			updatedShare = share - numberOfShare;
			accountJson.put("SoldShare", updatedShare);

			LocalDateTime current = LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			dateTime = current.format(format);
			transactionStack.push("Sold");
			transactionQueue.enqueue(dateTime);
		} else {
			System.out.println("You are trying to sell Over limit you habve only " + share + " share");
		}
		accountJson.put("SoldTime", dateTime);
		return accountJson;
	}

	@Override
	public void removeCompanyDetails(String symbol) {
		// JSONArray jsonArray = StockAccountRepository.readArrayData(file);
		JSONObject object1 = new JSONObject();
		JSONParser jsonParser = new JSONParser();
		System.out.println("Enter the details of whom You To delete ");
		System.out.println("Enter Symbol: ");
		String symbol1 = Utility.inputString();
		String filedata = null;
		try {
			filedata = Oops.readJsonFile(path);
		} catch (IOException e) {
		}
		try {
			object1 = (JSONObject) jsonParser.parse(filedata);
		} catch (ParseException e) {
		}

		if (object1.containsKey(symbol1)) {
			object1.remove(symbol1);
			System.out.println("Data Deleted Successfully");
		} else {
			System.out.println("Symbol not Found");
		}
		try {
			Oops.writeFile(object1.toString(), path);
		} catch (IOException e) {
		}
	}

	/**
	 * Define function printTranctiondetails()
	 * 
	 * @return void
	 */
	@Override
	public void printTransactionDetails() {
		/**
		 * prints queue
		 */
		System.out.println("\nTransactions Queue:");
		while (!transactionQueue.isEmpty()) {
			System.out.println(transactionQueue.dequeue());
		}

		/**
		 * prints stack
		 */
		System.out.println("\nTransactions Stack:");
		while (!transactionStack.isEmpty()) {
			System.out.println(transactionStack.pop());
		}
	}
}