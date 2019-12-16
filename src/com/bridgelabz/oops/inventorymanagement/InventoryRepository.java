package com.bridgelabz.oops.inventorymanagement;

/******************************************************************************
 * 
 * Purpose: Create a JSON file having Inventory Details for Rice, Pulses and
 * Wheats with properties name, weight, price per kg.
 ** 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 03-12-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryRepository {
	String path = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/InventoryList.json";
	static JSONParser jsonParser = new JSONParser();
	static JSONObject jsonObject = new JSONObject();

	/*
	 * By using this method we write our user input data into the file as a json
	 * format
	 * 
	 * @param-data - JSONObject
	 * 
	 * @return - null
	 * 
	 */
	public static void writeData(JSONObject jsonFinalObject) {
		File f = new File("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/InventoryList.json");

		try (FileWriter fileWriter = new FileWriter(f)) {

			fileWriter.write(jsonFinalObject.toJSONString());
			System.out.println("Data is added to the file!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * reads data from json file and prints inventory value of Rice, Pulses and
	 * Wheat
	 */
	public static JSONObject readData() {
		JSONParser jsonParser = new JSONParser();
		org.json.simple.JSONObject jsonObject = new JSONObject();

		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader(
					"/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/InventoryList.json"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
}